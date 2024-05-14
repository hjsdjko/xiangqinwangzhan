package com.entity.model;

import com.entity.JiehunanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 结婚案例
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiehunanliModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 结婚案例编号
     */
    private String hunligongsiOrderUuidNumber;


    /**
     * 结婚案例名称
     */
    private String jiehunanliName;


    /**
     * 结婚案例照片
     */
    private String jiehunanliPhoto;


    /**
     * 结婚案例详情
     */
    private String jiehunanliContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：结婚案例编号
	 */
    public String getHunligongsiOrderUuidNumber() {
        return hunligongsiOrderUuidNumber;
    }


    /**
	 * 设置：结婚案例编号
	 */
    public void setHunligongsiOrderUuidNumber(String hunligongsiOrderUuidNumber) {
        this.hunligongsiOrderUuidNumber = hunligongsiOrderUuidNumber;
    }
    /**
	 * 获取：结婚案例名称
	 */
    public String getJiehunanliName() {
        return jiehunanliName;
    }


    /**
	 * 设置：结婚案例名称
	 */
    public void setJiehunanliName(String jiehunanliName) {
        this.jiehunanliName = jiehunanliName;
    }
    /**
	 * 获取：结婚案例照片
	 */
    public String getJiehunanliPhoto() {
        return jiehunanliPhoto;
    }


    /**
	 * 设置：结婚案例照片
	 */
    public void setJiehunanliPhoto(String jiehunanliPhoto) {
        this.jiehunanliPhoto = jiehunanliPhoto;
    }
    /**
	 * 获取：结婚案例详情
	 */
    public String getJiehunanliContent() {
        return jiehunanliContent;
    }


    /**
	 * 设置：结婚案例详情
	 */
    public void setJiehunanliContent(String jiehunanliContent) {
        this.jiehunanliContent = jiehunanliContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
