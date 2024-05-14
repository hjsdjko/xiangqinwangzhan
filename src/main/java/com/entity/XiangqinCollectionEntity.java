package com.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 相亲收藏
 *
 * @author 
 * @email
 */
@TableName("xiangqin_collection")
public class XiangqinCollectionEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiangqinCollectionEntity() {

	}

	public XiangqinCollectionEntity(T t) {
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
     * 相亲
     */
    @TableField(value = "xiangqin_id")

    private Integer xiangqinId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 类型
     */
    @TableField(value = "xiangqin_collection_types")

    private Integer xiangqinCollectionTypes;


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
	 * 设置：相亲
	 */
    public Integer getXiangqinId() {
        return xiangqinId;
    }


    /**
	 * 获取：相亲
	 */

    public void setXiangqinId(Integer xiangqinId) {
        this.xiangqinId = xiangqinId;
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
    public Integer getXiangqinCollectionTypes() {
        return xiangqinCollectionTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setXiangqinCollectionTypes(Integer xiangqinCollectionTypes) {
        this.xiangqinCollectionTypes = xiangqinCollectionTypes;
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
        return "XiangqinCollection{" +
            "id=" + id +
            ", xiangqinId=" + xiangqinId +
            ", yonghuId=" + yonghuId +
            ", xiangqinCollectionTypes=" + xiangqinCollectionTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
