package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 订单
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class EOrder extends Model<EOrder> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 订单号
     */
    private String oid;
    /**
     * 运费
     */
    private BigDecimal deliverFee;
    /**
     * 应付金额
     */
    private Double payableFee;
    /**
     * 订单金额
     */
    private Double totalPrice;
    /**
     * 支付方式 0:到付 1:在线 2:邮局 3:公司转帐
     */
    private Integer paymentWay;
    /**
     * 货到付款方式.1现金,2POS刷卡
     */
    private Integer paymentCash;
    /**
     * 送货时间
     */
    private Integer delivery;
    /**
     * 是否电话确认 1:是  0: 否
     */
    @TableField("isConfirm")
    private Integer isConfirm;
    /**
     * 支付状态 :0到付1待付款,2已付款,3待退款,4退款成功,5退款失败
     */
    private Integer isPaiy;
    /**
     * 订单状态 0:提交订单 1:仓库配货 2:商品出库 3:等待收货 4:完成 5待退货 6已退货
     */
    private Integer state;
    /**
     * 订单生成时间
     */
    private Date createDate;
    /**
     * 附言
     */
    private String note;
    /**
     * 用户名
     */
    private String buyerId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public BigDecimal getDeliverFee() {
        return deliverFee;
    }

    public void setDeliverFee(BigDecimal deliverFee) {
        this.deliverFee = deliverFee;
    }

    public Double getPayableFee() {
        return payableFee;
    }

    public void setPayableFee(Double payableFee) {
        this.payableFee = payableFee;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getPaymentWay() {
        return paymentWay;
    }

    public void setPaymentWay(Integer paymentWay) {
        this.paymentWay = paymentWay;
    }

    public Integer getPaymentCash() {
        return paymentCash;
    }

    public void setPaymentCash(Integer paymentCash) {
        this.paymentCash = paymentCash;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    public Integer getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Integer isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Integer getIsPaiy() {
        return isPaiy;
    }

    public void setIsPaiy(Integer isPaiy) {
        this.isPaiy = isPaiy;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EOrder{" +
        ", id=" + id +
        ", oid=" + oid +
        ", deliverFee=" + deliverFee +
        ", payableFee=" + payableFee +
        ", totalPrice=" + totalPrice +
        ", paymentWay=" + paymentWay +
        ", paymentCash=" + paymentCash +
        ", delivery=" + delivery +
        ", isConfirm=" + isConfirm +
        ", isPaiy=" + isPaiy +
        ", state=" + state +
        ", createDate=" + createDate +
        ", note=" + note +
        ", buyerId=" + buyerId +
        "}";
    }
}
