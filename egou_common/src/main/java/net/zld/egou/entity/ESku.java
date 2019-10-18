package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 最小销售单元
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class ESku extends Model<ESku> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * 颜色ID
     */
    private Integer colorId;
    /**
     * 尺码
     */
    private String size;
    /**
     * 运费 默认10元
     */
    private Double deliveFee;
    /**
     * 售价
     */
    private Double skuPrice;
    /**
     * 库存
     */
    private Integer stockInventory;
    /**
     * 购买限制
     */
    private Integer skuUpperLimit;
    /**
     * 仓库位置:货架号
     */
    private String location;
    /**
     * SKU图片  精确到颜色及尺码对应的图片
     */
    private String skuImg;
    /**
     * 前台显示排序
     */
    private Integer skuSort;
    /**
     * SKU名称
     */
    private String skuName;
    /**
     * 市场价
     */
    private Double marketPrice;
    private Date createTime;
    private Date updateTime;
    private String createUserId;
    private String updateUserId;
    /**
     * 0,历史 1最新
     */
    private Integer lastStatus;
    /**
     * 0:赠品,1普通
     */
    private Integer skuType;
    /**
     * 销量
     */
    private Integer sales;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getDeliveFee() {
        return deliveFee;
    }

    public void setDeliveFee(Double deliveFee) {
        this.deliveFee = deliveFee;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getStockInventory() {
        return stockInventory;
    }

    public void setStockInventory(Integer stockInventory) {
        this.stockInventory = stockInventory;
    }

    public Integer getSkuUpperLimit() {
        return skuUpperLimit;
    }

    public void setSkuUpperLimit(Integer skuUpperLimit) {
        this.skuUpperLimit = skuUpperLimit;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    public Integer getSkuSort() {
        return skuSort;
    }

    public void setSkuSort(Integer skuSort) {
        this.skuSort = skuSort;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Integer getLastStatus() {
        return lastStatus;
    }

    public void setLastStatus(Integer lastStatus) {
        this.lastStatus = lastStatus;
    }

    public Integer getSkuType() {
        return skuType;
    }

    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ESku{" +
        ", id=" + id +
        ", productId=" + productId +
        ", colorId=" + colorId +
        ", size=" + size +
        ", deliveFee=" + deliveFee +
        ", skuPrice=" + skuPrice +
        ", stockInventory=" + stockInventory +
        ", skuUpperLimit=" + skuUpperLimit +
        ", location=" + location +
        ", skuImg=" + skuImg +
        ", skuSort=" + skuSort +
        ", skuName=" + skuName +
        ", marketPrice=" + marketPrice +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createUserId=" + createUserId +
        ", updateUserId=" + updateUserId +
        ", lastStatus=" + lastStatus +
        ", skuType=" + skuType +
        ", sales=" + sales +
        "}";
    }
}
