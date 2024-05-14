package com.entity.vo;

import com.entity.JiehunanliEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 结婚案例
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiehunanli")
public class JiehunanliVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
