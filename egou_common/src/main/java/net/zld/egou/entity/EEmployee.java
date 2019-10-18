package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 员工
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class EEmployee extends Model<EEmployee> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 学历
     */
    private String degree;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 性别 
     */
    private Integer gender;
    /**
     * 图片(头像)
     */
    private String imgUrl;
    /**
     * 手机
     */
    private String phone;
    /**
     * 真实名字
     */
    private String realName;
    /**
     * 毕业学校
     */
    private String school;
    /**
     * 是否删除 1:未删除 0:删除
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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
        return "EEmployee{" +
        ", username=" + username +
        ", password=" + password +
        ", degree=" + degree +
        ", email=" + email +
        ", gender=" + gender +
        ", imgUrl=" + imgUrl +
        ", phone=" + phone +
        ", realName=" + realName +
        ", school=" + school +
        ", isDel=" + isDel +
        "}";
    }
}
