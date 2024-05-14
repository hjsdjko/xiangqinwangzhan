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
 * 相亲
 *
 * @author 
 * @email
 */
@TableName("xiangqin")
public class XiangqinEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiangqinEntity() {

	}

	public XiangqinEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 姓名
     */
    @TableField(value = "xiangqin_name")

    private String xiangqinName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 照片
     */
    @TableField(value = "xiangqin_photo")

    private String xiangqinPhoto;


    /**
     * 属相
     */
    @TableField(value = "shuxiang")

    private String shuxiang;


    /**
     * 有无子女
     */
    @TableField(value = "youwuzinv")

    private String youwuzinv;


    /**
     * 血型
     */
    @TableField(value = "xuexing")

    private String xuexing;


    /**
     * 体重(kg)
     */
    @TableField(value = "tizhong")

    private Integer tizhong;


    /**
     * 职业
     */
    @TableField(value = "zhiye")

    private String zhiye;


    /**
     * 公司性质
     */
    @TableField(value = "gongsixingzhi")

    private String gongsixingzhi;


    /**
     * 月薪
     */
    @TableField(value = "yuexin")

    private String yuexin;


    /**
     * 个人介绍
     */
    @TableField(value = "geren_content")

    private String gerenContent;


    /**
     * 工作情况
     */
    @TableField(value = "gongzuo_content")

    private String gongzuoContent;


    /**
     * 家庭情况
     */
    @TableField(value = "jiating_content")

    private String jiatingContent;


    /**
     * 择偶意向
     */
    @TableField(value = "zeou_content")

    private String zeouContent;


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
	 * 设置：姓名
	 */
    public String getXiangqinName() {
        return xiangqinName;
    }


    /**
	 * 获取：姓名
	 */

    public void setXiangqinName(String xiangqinName) {
        this.xiangqinName = xiangqinName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：照片
	 */
    public String getXiangqinPhoto() {
        return xiangqinPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setXiangqinPhoto(String xiangqinPhoto) {
        this.xiangqinPhoto = xiangqinPhoto;
    }
    /**
	 * 设置：属相
	 */
    public String getShuxiang() {
        return shuxiang;
    }


    /**
	 * 获取：属相
	 */

    public void setShuxiang(String shuxiang) {
        this.shuxiang = shuxiang;
    }
    /**
	 * 设置：有无子女
	 */
    public String getYouwuzinv() {
        return youwuzinv;
    }


    /**
	 * 获取：有无子女
	 */

    public void setYouwuzinv(String youwuzinv) {
        this.youwuzinv = youwuzinv;
    }
    /**
	 * 设置：血型
	 */
    public String getXuexing() {
        return xuexing;
    }


    /**
	 * 获取：血型
	 */

    public void setXuexing(String xuexing) {
        this.xuexing = xuexing;
    }
    /**
	 * 设置：体重(kg)
	 */
    public Integer getTizhong() {
        return tizhong;
    }


    /**
	 * 获取：体重(kg)
	 */

    public void setTizhong(Integer tizhong) {
        this.tizhong = tizhong;
    }
    /**
	 * 设置：职业
	 */
    public String getZhiye() {
        return zhiye;
    }


    /**
	 * 获取：职业
	 */

    public void setZhiye(String zhiye) {
        this.zhiye = zhiye;
    }
    /**
	 * 设置：公司性质
	 */
    public String getGongsixingzhi() {
        return gongsixingzhi;
    }


    /**
	 * 获取：公司性质
	 */

    public void setGongsixingzhi(String gongsixingzhi) {
        this.gongsixingzhi = gongsixingzhi;
    }
    /**
	 * 设置：月薪
	 */
    public String getYuexin() {
        return yuexin;
    }


    /**
	 * 获取：月薪
	 */

    public void setYuexin(String yuexin) {
        this.yuexin = yuexin;
    }
    /**
	 * 设置：个人介绍
	 */
    public String getGerenContent() {
        return gerenContent;
    }


    /**
	 * 获取：个人介绍
	 */

    public void setGerenContent(String gerenContent) {
        this.gerenContent = gerenContent;
    }
    /**
	 * 设置：工作情况
	 */
    public String getGongzuoContent() {
        return gongzuoContent;
    }


    /**
	 * 获取：工作情况
	 */

    public void setGongzuoContent(String gongzuoContent) {
        this.gongzuoContent = gongzuoContent;
    }
    /**
	 * 设置：家庭情况
	 */
    public String getJiatingContent() {
        return jiatingContent;
    }


    /**
	 * 获取：家庭情况
	 */

    public void setJiatingContent(String jiatingContent) {
        this.jiatingContent = jiatingContent;
    }
    /**
	 * 设置：择偶意向
	 */
    public String getZeouContent() {
        return zeouContent;
    }


    /**
	 * 获取：择偶意向
	 */

    public void setZeouContent(String zeouContent) {
        this.zeouContent = zeouContent;
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
        return "Xiangqin{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xiangqinName=" + xiangqinName +
            ", sexTypes=" + sexTypes +
            ", xiangqinPhoto=" + xiangqinPhoto +
            ", shuxiang=" + shuxiang +
            ", youwuzinv=" + youwuzinv +
            ", xuexing=" + xuexing +
            ", tizhong=" + tizhong +
            ", zhiye=" + zhiye +
            ", gongsixingzhi=" + gongsixingzhi +
            ", yuexin=" + yuexin +
            ", gerenContent=" + gerenContent +
            ", gongzuoContent=" + gongzuoContent +
            ", jiatingContent=" + jiatingContent +
            ", zeouContent=" + zeouContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
