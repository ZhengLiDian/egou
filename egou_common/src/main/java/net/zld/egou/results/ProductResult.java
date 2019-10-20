package net.zld.egou.results;

import net.zld.egou.entity.EProductItem;
import com.baomidou.mybatisplus.plugins.Page;

public class ProductResult {

    private String params;    //分页请求的参数
    private Page<EProductItem> productItems;//产品信息和分页信息

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public Page<EProductItem> getProductItems() {
        return productItems;
    }

    public void setProductItems(Page<EProductItem> productItems) {
        this.productItems = productItems;
    }

}
