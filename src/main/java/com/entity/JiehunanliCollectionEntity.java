package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 结婚案例收藏
 *
 * @author 
 * @email
 */
@TableName("jiehunanli_collection")
public class JiehunanliCollectionEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiehunanliCollectionEntity() {

	}

	public JiehunanliCollectionEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 结婚案例
     */
    @TableField(value = "jiehunanli_id")

    private Integer jiehunanliId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 类型
     */
    @TableField(value = "jiehunanli_collection_types")

    private Integer jiehunanliCollectionTypes;


    /**
     * 收藏时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：结婚案例
	 */
    public Integer getJiehunanliId() {
        return jiehunanliId;
    }


    /**
	 * 获取：结婚案例
	 */

    public void setJiehunanliId(Integer jiehunanliId) {
        this.jiehunanliId = jiehunanliId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：类型
	 */
    public Integer getJiehunanliCollectionTypes() {
        return jiehunanliCollectionTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setJiehunanliCollectionTypes(Integer jiehunanliCollectionTypes) {
        this.jiehunanliCollectionTypes = jiehunanliCollectionTypes;
    }
    /**
	 * 设置：收藏时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：收藏时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "JiehunanliCollection{" +
            "id=" + id +
            ", jiehunanliId=" + jiehunanliId +
            ", yonghuId=" + yonghuId +
            ", jiehunanliCollectionTypes=" + jiehunanliCollectionTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
