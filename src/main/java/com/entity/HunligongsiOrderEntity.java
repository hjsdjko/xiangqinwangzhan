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
 * 婚礼公司预约
 *
 * @author 
 * @email
 */
@TableName("hunligongsi_order")
public class HunligongsiOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HunligongsiOrderEntity() {

	}

	public HunligongsiOrderEntity(T t) {
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
     * 预约唯一编号
     */
    @TableField(value = "hunligongsi_order_uuid_number")

    private String hunligongsiOrderUuidNumber;


    /**
     * 婚礼公司
     */
    @TableField(value = "hunligongsi_id")

    private Integer hunligongsiId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yuyue_time")

    private Date yuyueTime;


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
	 * 设置：预约唯一编号
	 */
    public String getHunligongsiOrderUuidNumber() {
        return hunligongsiOrderUuidNumber;
    }


    /**
	 * 获取：预约唯一编号
	 */

    public void setHunligongsiOrderUuidNumber(String hunligongsiOrderUuidNumber) {
        this.hunligongsiOrderUuidNumber = hunligongsiOrderUuidNumber;
    }
    /**
	 * 设置：婚礼公司
	 */
    public Integer getHunligongsiId() {
        return hunligongsiId;
    }


    /**
	 * 获取：婚礼公司
	 */

    public void setHunligongsiId(Integer hunligongsiId) {
        this.hunligongsiId = hunligongsiId;
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
	 * 设置：预约时间
	 */
    public Date getYuyueTime() {
        return yuyueTime;
    }


    /**
	 * 获取：预约时间
	 */

    public void setYuyueTime(Date yuyueTime) {
        this.yuyueTime = yuyueTime;
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
        return "HunligongsiOrder{" +
            "id=" + id +
            ", hunligongsiOrderUuidNumber=" + hunligongsiOrderUuidNumber +
            ", hunligongsiId=" + hunligongsiId +
            ", yonghuId=" + yonghuId +
            ", yuyueTime=" + yuyueTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
