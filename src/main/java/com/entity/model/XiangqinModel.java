package com.entity.model;

import com.entity.XiangqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 相亲
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiangqinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 姓名
     */
    private String xiangqinName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 照片
     */
    private String xiangqinPhoto;


    /**
     * 属相
     */
    private String shuxiang;


    /**
     * 有无子女
     */
    private String youwuzinv;


    /**
     * 血型
     */
    private String xuexing;


    /**
     * 体重(kg)
     */
    private Integer tizhong;


    /**
     * 职业
     */
    private String zhiye;


    /**
     * 公司性质
     */
    private String gongsixingzhi;


    /**
     * 月薪
     */
    private String yuexin;


    /**
     * 个人介绍
     */
    private String gerenContent;


    /**
     * 工作情况
     */
    private String gongzuoContent;


    /**
     * 家庭情况
     */
    private String jiatingContent;


    /**
     * 择偶意向
     */
    private String zeouContent;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：姓名
	 */
    public String getXiangqinName() {
        return xiangqinName;
    }


    /**
	 * 设置：姓名
	 */
    public void setXiangqinName(String xiangqinName) {
        this.xiangqinName = xiangqinName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：照片
	 */
    public String getXiangqinPhoto() {
        return xiangqinPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setXiangqinPhoto(String xiangqinPhoto) {
        this.xiangqinPhoto = xiangqinPhoto;
    }
    /**
	 * 获取：属相
	 */
    public String getShuxiang() {
        return shuxiang;
    }


    /**
	 * 设置：属相
	 */
    public void setShuxiang(String shuxiang) {
        this.shuxiang = shuxiang;
    }
    /**
	 * 获取：有无子女
	 */
    public String getYouwuzinv() {
        return youwuzinv;
    }


    /**
	 * 设置：有无子女
	 */
    public void setYouwuzinv(String youwuzinv) {
        this.youwuzinv = youwuzinv;
    }
    /**
	 * 获取：血型
	 */
    public String getXuexing() {
        return xuexing;
    }


    /**
	 * 设置：血型
	 */
    public void setXuexing(String xuexing) {
        this.xuexing = xuexing;
    }
    /**
	 * 获取：体重(kg)
	 */
    public Integer getTizhong() {
        return tizhong;
    }


    /**
	 * 设置：体重(kg)
	 */
    public void setTizhong(Integer tizhong) {
        this.tizhong = tizhong;
    }
    /**
	 * 获取：职业
	 */
    public String getZhiye() {
        return zhiye;
    }


    /**
	 * 设置：职业
	 */
    public void setZhiye(String zhiye) {
        this.zhiye = zhiye;
    }
    /**
	 * 获取：公司性质
	 */
    public String getGongsixingzhi() {
        return gongsixingzhi;
    }


    /**
	 * 设置：公司性质
	 */
    public void setGongsixingzhi(String gongsixingzhi) {
        this.gongsixingzhi = gongsixingzhi;
    }
    /**
	 * 获取：月薪
	 */
    public String getYuexin() {
        return yuexin;
    }


    /**
	 * 设置：月薪
	 */
    public void setYuexin(String yuexin) {
        this.yuexin = yuexin;
    }
    /**
	 * 获取：个人介绍
	 */
    public String getGerenContent() {
        return gerenContent;
    }


    /**
	 * 设置：个人介绍
	 */
    public void setGerenContent(String gerenContent) {
        this.gerenContent = gerenContent;
    }
    /**
	 * 获取：工作情况
	 */
    public String getGongzuoContent() {
        return gongzuoContent;
    }


    /**
	 * 设置：工作情况
	 */
    public void setGongzuoContent(String gongzuoContent) {
        this.gongzuoContent = gongzuoContent;
    }
    /**
	 * 获取：家庭情况
	 */
    public String getJiatingContent() {
        return jiatingContent;
    }


    /**
	 * 设置：家庭情况
	 */
    public void setJiatingContent(String jiatingContent) {
        this.jiatingContent = jiatingContent;
    }
    /**
	 * 获取：择偶意向
	 */
    public String getZeouContent() {
        return zeouContent;
    }


    /**
	 * 设置：择偶意向
	 */
    public void setZeouContent(String zeouContent) {
        this.zeouContent = zeouContent;
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
