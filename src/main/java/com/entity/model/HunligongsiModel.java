package com.entity.model;

import com.entity.HunligongsiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 婚礼公司
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HunligongsiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 婚礼公司名称
     */
    private String hunligongsiName;


    /**
     * 婚礼公司照片
     */
    private String hunligongsiPhoto;


    /**
     * 公司位置
     */
    private String hunligongsiAddress;


    /**
     * 公司规模
     */
    private String hunligongsiGuimo;


    /**
     * 注册资金
     */
    private String hunligongsiZijin;


    /**
     * 公司介绍
     */
    private String hunligongsiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：婚礼公司名称
	 */
    public String getHunligongsiName() {
        return hunligongsiName;
    }


    /**
	 * 设置：婚礼公司名称
	 */
    public void setHunligongsiName(String hunligongsiName) {
        this.hunligongsiName = hunligongsiName;
    }
    /**
	 * 获取：婚礼公司照片
	 */
    public String getHunligongsiPhoto() {
        return hunligongsiPhoto;
    }


    /**
	 * 设置：婚礼公司照片
	 */
    public void setHunligongsiPhoto(String hunligongsiPhoto) {
        this.hunligongsiPhoto = hunligongsiPhoto;
    }
    /**
	 * 获取：公司位置
	 */
    public String getHunligongsiAddress() {
        return hunligongsiAddress;
    }


    /**
	 * 设置：公司位置
	 */
    public void setHunligongsiAddress(String hunligongsiAddress) {
        this.hunligongsiAddress = hunligongsiAddress;
    }
    /**
	 * 获取：公司规模
	 */
    public String getHunligongsiGuimo() {
        return hunligongsiGuimo;
    }


    /**
	 * 设置：公司规模
	 */
    public void setHunligongsiGuimo(String hunligongsiGuimo) {
        this.hunligongsiGuimo = hunligongsiGuimo;
    }
    /**
	 * 获取：注册资金
	 */
    public String getHunligongsiZijin() {
        return hunligongsiZijin;
    }


    /**
	 * 设置：注册资金
	 */
    public void setHunligongsiZijin(String hunligongsiZijin) {
        this.hunligongsiZijin = hunligongsiZijin;
    }
    /**
	 * 获取：公司介绍
	 */
    public String getHunligongsiContent() {
        return hunligongsiContent;
    }


    /**
	 * 设置：公司介绍
	 */
    public void setHunligongsiContent(String hunligongsiContent) {
        this.hunligongsiContent = hunligongsiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
