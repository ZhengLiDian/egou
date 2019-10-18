package net.zld.egou.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 区县信息表
 * </p>
 *
 * @author zld
 * @since 2019-10-18
 */
public class ETown extends Model<ETown> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 区县编码
     */
    private String code;
    /**
     * 区县名称
     */
    private String name;
    /**
     * 所属城市编码
     */
    private String city;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ETown{" +
        ", id=" + id +
        ", code=" + code +
        ", name=" + name +
        ", city=" + city +
        "}";
    }
}
