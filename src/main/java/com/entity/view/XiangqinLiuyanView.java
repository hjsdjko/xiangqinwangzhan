package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.XiangqinLiuyanEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 相亲留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xiangqin_liuyan")
public class XiangqinLiuyanView extends XiangqinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xiangqin
			/**
			* 相亲 的 用户
			*/
			private Integer xiangqinYonghuId;
			/**
			* 姓名
			*/
			private String xiangqinName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;

	public XiangqinLiuyanView() {

	}

	public XiangqinLiuyanView(XiangqinLiuyanEntity xiangqinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xiangqinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set xiangqin
					/**
					* 获取：相亲 的 用户
					*/
					public Integer getXiangqinYonghuId() {
						return xiangqinYonghuId;
					}
					/**
					* 设置：相亲 的 用户
					*/
					public void setXiangqinYonghuId(Integer xiangqinYonghuId) {
						this.xiangqinYonghuId = xiangqinYonghuId;
					}

					/**
					* 获取： 姓名
					*/
					public String getXiangqinName() {
						return xiangqinName;
					}
					/**
					* 设置： 姓名
					*/
					public void setXiangqinName(String xiangqinName) {
						this.xiangqinName = xiangqinName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 照片
					*/
					public String getXiangqinPhoto() {
						return xiangqinPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setXiangqinPhoto(String xiangqinPhoto) {
						this.xiangqinPhoto = xiangqinPhoto;
					}
					/**
					* 获取： 属相
					*/
					public String getShuxiang() {
						return shuxiang;
					}
					/**
					* 设置： 属相
					*/
					public void setShuxiang(String shuxiang) {
						this.shuxiang = shuxiang;
					}
					/**
					* 获取： 有无子女
					*/
					public String getYouwuzinv() {
						return youwuzinv;
					}
					/**
					* 设置： 有无子女
					*/
					public void setYouwuzinv(String youwuzinv) {
						this.youwuzinv = youwuzinv;
					}
					/**
					* 获取： 血型
					*/
					public String getXuexing() {
						return xuexing;
					}
					/**
					* 设置： 血型
					*/
					public void setXuexing(String xuexing) {
						this.xuexing = xuexing;
					}
					/**
					* 获取： 体重(kg)
					*/
					public Integer getTizhong() {
						return tizhong;
					}
					/**
					* 设置： 体重(kg)
					*/
					public void setTizhong(Integer tizhong) {
						this.tizhong = tizhong;
					}
					/**
					* 获取： 职业
					*/
					public String getZhiye() {
						return zhiye;
					}
					/**
					* 设置： 职业
					*/
					public void setZhiye(String zhiye) {
						this.zhiye = zhiye;
					}
					/**
					* 获取： 公司性质
					*/
					public String getGongsixingzhi() {
						return gongsixingzhi;
					}
					/**
					* 设置： 公司性质
					*/
					public void setGongsixingzhi(String gongsixingzhi) {
						this.gongsixingzhi = gongsixingzhi;
					}
					/**
					* 获取： 月薪
					*/
					public String getYuexin() {
						return yuexin;
					}
					/**
					* 设置： 月薪
					*/
					public void setYuexin(String yuexin) {
						this.yuexin = yuexin;
					}
					/**
					* 获取： 个人介绍
					*/
					public String getGerenContent() {
						return gerenContent;
					}
					/**
					* 设置： 个人介绍
					*/
					public void setGerenContent(String gerenContent) {
						this.gerenContent = gerenContent;
					}
					/**
					* 获取： 工作情况
					*/
					public String getGongzuoContent() {
						return gongzuoContent;
					}
					/**
					* 设置： 工作情况
					*/
					public void setGongzuoContent(String gongzuoContent) {
						this.gongzuoContent = gongzuoContent;
					}
					/**
					* 获取： 家庭情况
					*/
					public String getJiatingContent() {
						return jiatingContent;
					}
					/**
					* 设置： 家庭情况
					*/
					public void setJiatingContent(String jiatingContent) {
						this.jiatingContent = jiatingContent;
					}
					/**
					* 获取： 择偶意向
					*/
					public String getZeouContent() {
						return zeouContent;
					}
					/**
					* 设置： 择偶意向
					*/
					public void setZeouContent(String zeouContent) {
						this.zeouContent = zeouContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
