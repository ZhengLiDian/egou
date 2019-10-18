package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 收货地址
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class EAddr extends Model<EAddr> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户ID
     */
    private String buyerId;
    /**
     * 收货人
     */
    private String name;
    private String city;
    /**
     * 收货地址
     */
    private String addr;
    /**
     * 手机号或是固定电话号
     */
    private String phone;
    /**
     * 是否默认
     */
    private Integer isDef;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getIsDef() {
        return isDef;
    }

    public void setIsDef(Integer isDef) {
        this.isDef = isDef;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EAddr{" +
        ", id=" + id +
        ", buyerId=" + buyerId +
        ", name=" + name +
        ", city=" + city +
        ", addr=" + addr +
        ", phone=" + phone +
        ", isDef=" + isDef +
        "}";
    }
}
