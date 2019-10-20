package net.zld.egou.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import net.zld.egou.entity.EProduct;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品 Mapper 接口
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public interface EProductMapper extends BaseMapper<EProduct> {
    /**
     * 为了区别plus原来的查询select*的字段 ，自定义为diy
     *
     * @param eProductWrapper 条件构造器
     * @return 多表关联查询
     */
    @Select("SELECT a.*,b.url FROM e_product a LEFT JOIN e_img b ON a.id = b.product_id ${ew.sqlSegment}")
    List<Map<String, Object>> diyProductAndImg(Page<Map<String, Object>> page, @Param("ew") Wrapper<EProduct> eProductWrapper);
}
