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
 * 结婚案例
 *
 * @author 
 * @email
 */
@TableName("jiehunanli")
public class JiehunanliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiehunanliEntity() {

	}

	public JiehunanliEntity(T t) {
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
     * 结婚案例编号
     */
    @TableField(value = "hunligongsi_order_uuid_number")

    private String hunligongsiOrderUuidNumber;


    /**
     * 结婚案例名称
     */
    @TableField(value = "jiehunanli_name")

    private String jiehunanliName;


    /**
     * 结婚案例照片
     */
    @TableField(value = "jiehunanli_photo")

    private String jiehunanliPhoto;


    /**
     * 结婚案例详情
     */
    @TableField(value = "jiehunanli_content")

    private String jiehunanliContent;


    /**
     * 添加时间
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
	 * 设置：结婚案例编号
	 */
    public String getHunligongsiOrderUuidNumber() {
        return hunligongsiOrderUuidNumber;
    }


    /**
	 * 获取：结婚案例编号
	 */

    public void setHunligongsiOrderUuidNumber(String hunligongsiOrderUuidNumber) {
        this.hunligongsiOrderUuidNumber = hunligongsiOrderUuidNumber;
    }
    /**
	 * 设置：结婚案例名称
	 */
    public String getJiehunanliName() {
        return jiehunanliName;
    }


    /**
	 * 获取：结婚案例名称
	 */

    public void setJiehunanliName(String jiehunanliName) {
        this.jiehunanliName = jiehunanliName;
    }
    /**
	 * 设置：结婚案例照片
	 */
    public String getJiehunanliPhoto() {
        return jiehunanliPhoto;
    }


    /**
	 * 获取：结婚案例照片
	 */

    public void setJiehunanliPhoto(String jiehunanliPhoto) {
        this.jiehunanliPhoto = jiehunanliPhoto;
    }
    /**
	 * 设置：结婚案例详情
	 */
    public String getJiehunanliContent() {
        return jiehunanliContent;
    }


    /**
	 * 获取：结婚案例详情
	 */

    public void setJiehunanliContent(String jiehunanliContent) {
        this.jiehunanliContent = jiehunanliContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
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
        return "Jiehunanli{" +
            "id=" + id +
            ", hunligongsiOrderUuidNumber=" + hunligongsiOrderUuidNumber +
            ", jiehunanliName=" + jiehunanliName +
            ", jiehunanliPhoto=" + jiehunanliPhoto +
            ", jiehunanliContent=" + jiehunanliContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
