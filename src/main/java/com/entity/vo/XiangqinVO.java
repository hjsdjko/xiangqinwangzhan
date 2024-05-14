package com.entity.vo;

import com.entity.XiangqinEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 相亲
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xiangqin")
public class XiangqinVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
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
