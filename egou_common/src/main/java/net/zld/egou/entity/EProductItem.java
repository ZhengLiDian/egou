package net.zld.egou.entity;


import net.zld.egou.entity.EImg;
import net.zld.egou.entity.EProduct;

import java.util.List;

/**
 * 主要是用来封装产品及对应的图片
 * @author stone
 *
 */
public class EProductItem {

    private EProduct product;
    private List<EImg> imgs;
    private EImg mainImg;
    public EProductItem() {
    }
    public EProductItem(EProduct product, List<EImg> imgs) {
        super();
        this.product = product;
        this.imgs = imgs;
    }
    public EProduct getProduct() {
        return product;
    }
    public void setProduct(EProduct product) {
        this.product = product;
    }
    public List<EImg> getImgs() {
        return imgs;
    }
    public void setImgs(List<EImg> imgs) {
        this.imgs = imgs;
    }

    public EImg getMainImg() {
        return mainImg;
    }

    public void setMainImg(EImg mainImg) {
        this.mainImg = mainImg;
    }
}
