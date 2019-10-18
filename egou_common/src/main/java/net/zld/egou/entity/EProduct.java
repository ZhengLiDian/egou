package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class EProduct extends Model<EProduct> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品编号
     */
    private String no;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 重量 单位:克
     */
    private Double weight;
    /**
     * 是否新品:0:旧品,1:新品
     */
    private Integer isNew;
    /**
     * 是否热销:0,否 1:是
     */
    private Integer isHot;
    /**
     * 推荐 1推荐 0 不推荐
     */
    private Integer isCommend;
    /**
     * 添加时间
     */
    private Date createTime;
    /**
     * 添加人ID
     */
    private String createUserId;
    /**
     * 审核时间
     */
    private Date checkTime;
    /**
     * 审核人ID
     */
    private String checkUserId;
    /**
     * 上下架:0否 1是
     */
    private Integer isShow;
    /**
     * 是否删除:0删除,1,没删除
     */
    private Integer isDel;
    /**
     * 类型ID
     */
    private Integer typeId;
    /**
     * 品牌ID
     */
    private Integer brandId;
    /**
     * 检索关键词
     */
    private String keywords;
    /**
     * 销量
     */
    private Integer sales;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 包装清单
     */
    private String packageList;
    /**
     * 商品属性集
     */
    private String feature;
    /**
     * 颜色集
     */
    private String color;
    /**
     * 尺寸集
     */
    private String size;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getIsCommend() {
        return isCommend;
    }

    public void setIsCommend(Integer isCommend) {
        this.isCommend = isCommend;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(String checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackageList() {
        return packageList;
    }

    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EProduct{" +
        ", id=" + id +
        ", no=" + no +
        ", name=" + name +
        ", weight=" + weight +
        ", isNew=" + isNew +
        ", isHot=" + isHot +
        ", isCommend=" + isCommend +
        ", createTime=" + createTime +
        ", createUserId=" + createUserId +
        ", checkTime=" + checkTime +
        ", checkUserId=" + checkUserId +
        ", isShow=" + isShow +
        ", isDel=" + isDel +
        ", typeId=" + typeId +
        ", brandId=" + brandId +
        ", keywords=" + keywords +
        ", sales=" + sales +
        ", description=" + description +
        ", packageList=" + packageList +
        ", feature=" + feature +
        ", color=" + color +
        ", size=" + size +
        "}";
    }
}
