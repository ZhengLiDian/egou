package net.zld.egou.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import net.zld.egou.entity.EProduct;
import com.baomidou.mybatisplus.service.IService;
import net.zld.egou.entity.EProductItem;
import net.zld.egou.results.ProductResult;

import java.util.Map;

/**
 * <p>
 * 商品 服务类
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public interface EProductService extends IService<EProduct> {
    //多表条件分页 一对一
    Page<Map<String,Object>> diyProductAndImg(int current, int number);

    ProductResult diyProductItemList(EntityWrapper<EProduct> eProductEntityWrapper, int current, int number);
}
