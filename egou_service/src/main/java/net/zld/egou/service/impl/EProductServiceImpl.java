package net.zld.egou.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import net.zld.egou.entity.EImg;
import net.zld.egou.entity.EProduct;
import net.zld.egou.entity.EProductItem;
import net.zld.egou.mapper.EImgMapper;
import net.zld.egou.mapper.EProductMapper;
import net.zld.egou.results.ProductResult;
import net.zld.egou.service.EImgService;
import net.zld.egou.service.EProductService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品 服务实现类
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
@Service
public class EProductServiceImpl extends ServiceImpl<EProductMapper, EProduct> implements EProductService {

    @Resource
    private EImgService eImgService;

    @Override
    public Page<Map<String, Object>> diyProductAndImg(int current, int number) {
        // 新建分页
        Page<Map<String, Object>> page = new Page<>(current, number);
        //条件构造
        EntityWrapper<EProduct> eProductEntityWrapper = new EntityWrapper<>();
//        eProductEntityWrapper.last("where a.id="+252);
        // 返回分页结果
        return page.setRecords(this.baseMapper.diyProductAndImg(page, eProductEntityWrapper));

    }

    @Override
    public ProductResult diyProductItemList(EntityWrapper<EProduct> eProductEntityWrapper, int current, int number) {
        //根据pageNo和pageSize将当前页数的数据集合查询出来
        Page<EProductItem> page = new Page<>(current,number);
        List<EProduct> products = this.baseMapper.selectPage(page,eProductEntityWrapper);
        List<EProductItem> items = new ArrayList<>();
        for(EProduct product:products){
            EProductItem item = new EProductItem();
            item.setProduct(product);
            //将每个商品对象的图片查询出来
            EntityWrapper<EImg> eImgEntityWrapper = new EntityWrapper<>();
            eImgEntityWrapper.eq("product_id",product.getId());
            List<EImg> imgs = eImgService.selectList(eImgEntityWrapper);
            for(EImg img:imgs){
                if(img.getIsDef()==1){
                    item.setMainImg(img);
                    break;
                }
            }
            item.setImgs(imgs);
            items.add(item);
        }
        page.setRecords(items);
        ProductResult result = new ProductResult();
        result.setProductItems(page);
        return result;
    }


}
