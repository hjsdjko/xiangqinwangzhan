package com.entity.vo;

import com.entity.HunligongsiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 婚礼公司
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("hunligongsi")
public class HunligongsiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
