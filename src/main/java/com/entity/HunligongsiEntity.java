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
 * 婚礼公司
 *
 * @author 
 * @email
 */
@TableName("hunligongsi")
public class HunligongsiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HunligongsiEntity() {

	}

	public HunligongsiEntity(T t) {
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
     * 婚礼公司名称
     */
    @TableField(value = "hunligongsi_name")

    private String hunligongsiName;


    /**
     * 婚礼公司照片
     */
    @TableField(value = "hunligongsi_photo")

    private String hunligongsiPhoto;


    /**
     * 公司位置
     */
    @TableField(value = "hunligongsi_address")

    private String hunligongsiAddress;


    /**
     * 公司规模
     */
    @TableField(value = "hunligongsi_guimo")

    private String hunligongsiGuimo;


    /**
     * 注册资金
     */
    @TableField(value = "hunligongsi_zijin")

    private String hunligongsiZijin;


    /**
     * 公司介绍
     */
    @TableField(value = "hunligongsi_content")

    private String hunligongsiContent;


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
	 * 设置：婚礼公司名称
	 */
    public String getHunligongsiName() {
        return hunligongsiName;
    }


    /**
	 * 获取：婚礼公司名称
	 */

    public void setHunligongsiName(String hunligongsiName) {
        this.hunligongsiName = hunligongsiName;
    }
    /**
	 * 设置：婚礼公司照片
	 */
    public String getHunligongsiPhoto() {
        return hunligongsiPhoto;
    }


    /**
	 * 获取：婚礼公司照片
	 */

    public void setHunligongsiPhoto(String hunligongsiPhoto) {
        this.hunligongsiPhoto = hunligongsiPhoto;
    }
    /**
	 * 设置：公司位置
	 */
    public String getHunligongsiAddress() {
        return hunligongsiAddress;
    }


    /**
	 * 获取：公司位置
	 */

    public void setHunligongsiAddress(String hunligongsiAddress) {
        this.hunligongsiAddress = hunligongsiAddress;
    }
    /**
	 * 设置：公司规模
	 */
    public String getHunligongsiGuimo() {
        return hunligongsiGuimo;
    }


    /**
	 * 获取：公司规模
	 */

    public void setHunligongsiGuimo(String hunligongsiGuimo) {
        this.hunligongsiGuimo = hunligongsiGuimo;
    }
    /**
	 * 设置：注册资金
	 */
    public String getHunligongsiZijin() {
        return hunligongsiZijin;
    }


    /**
	 * 获取：注册资金
	 */

    public void setHunligongsiZijin(String hunligongsiZijin) {
        this.hunligongsiZijin = hunligongsiZijin;
    }
    /**
	 * 设置：公司介绍
	 */
    public String getHunligongsiContent() {
        return hunligongsiContent;
    }


    /**
	 * 获取：公司介绍
	 */

    public void setHunligongsiContent(String hunligongsiContent) {
        this.hunligongsiContent = hunligongsiContent;
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
        return "Hunligongsi{" +
            "id=" + id +
            ", hunligongsiName=" + hunligongsiName +
            ", hunligongsiPhoto=" + hunligongsiPhoto +
            ", hunligongsiAddress=" + hunligongsiAddress +
            ", hunligongsiGuimo=" + hunligongsiGuimo +
            ", hunligongsiZijin=" + hunligongsiZijin +
            ", hunligongsiContent=" + hunligongsiContent +
            ", createTime=" + createTime +
        "}";
    }
}
