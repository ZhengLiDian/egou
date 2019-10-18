package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 购买者
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class EBuyer extends Model<EBuyer> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    private String gender;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 真实名字
     */
    private String realName;
    /**
     * 注册时间
     */
    private Date registerTime;
    /**
     * 省ID
     */
    private String province;
    /**
     * 市ID
     */
    private String city;
    /**
     * 县ID
     */
    private String town;
    /**
     * 地址
     */
    private String addr;
    /**
     * 是否已删除:1:未,0:删除了
     */
    private Integer isDel;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    protected Serializable pkVal() {
        return this.username;
    }

    @Override
    public String toString() {
        return "EBuyer{" +
        ", username=" + username +
        ", password=" + password +
        ", gender=" + gender +
        ", email=" + email +
        ", realName=" + realName +
        ", registerTime=" + registerTime +
        ", province=" + province +
        ", city=" + city +
        ", town=" + town +
        ", addr=" + addr +
        ", isDel=" + isDel +
        "}";
    }
}
