package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 品牌
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class EBrand extends Model<EBrand> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 图片Url
     */
    private String imgUrl;
    /**
     * 品牌网址
     */
    private String webSite;
    /**
     * 排序:最大最排前
     */
    private Integer sort;
    /**
     * 是否可见 1:可见 0:不可见
     */
    private Integer isDisplay;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EBrand{" +
        ", id=" + id +
        ", name=" + name +
        ", description=" + description +
        ", imgUrl=" + imgUrl +
        ", webSite=" + webSite +
        ", sort=" + sort +
        ", isDisplay=" + isDisplay +
        "}";
    }
}
