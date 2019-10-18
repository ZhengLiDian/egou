package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 订单详情
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class EDetail extends Model<EDetail> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单ID
     */
    private Integer orderId;
    /**
     * 商品编号
     */
    private String productNo;
    /**
     * 商品名称
     */
    private String productName;
    /**
     *  颜色名称
     */
    private String color;
    /**
     * 尺码
     */
    private String size;
    /**
     * 商品销售价
     */
    private Double skuPrice;
    /**
     * 购买数量
     */
    private Integer amount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EDetail{" +
        ", id=" + id +
        ", orderId=" + orderId +
        ", productNo=" + productNo +
        ", productName=" + productName +
        ", color=" + color +
        ", size=" + size +
        ", skuPrice=" + skuPrice +
        ", amount=" + amount +
        "}";
    }
}
