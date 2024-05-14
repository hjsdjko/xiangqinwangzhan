package com.entity.view;

import com.entity.HunligongsiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 婚礼公司收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("hunligongsi_collection")
public class HunligongsiCollectionView extends HunligongsiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String hunligongsiCollectionValue;



		//级联表 hunligongsi
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

	public HunligongsiCollectionView() {

	}

	public HunligongsiCollectionView(HunligongsiCollectionEntity hunligongsiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, hunligongsiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getHunligongsiCollectionValue() {
				return hunligongsiCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setHunligongsiCollectionValue(String hunligongsiCollectionValue) {
				this.hunligongsiCollectionValue = hunligongsiCollectionValue;
			}







				//级联表的get和set hunligongsi
					/**
					* 获取： 婚礼公司名称
					*/
					public String getHunligongsiName() {
						return hunligongsiName;
					}
					/**
					* 设置： 婚礼公司名称
					*/
					public void setHunligongsiName(String hunligongsiName) {
						this.hunligongsiName = hunligongsiName;
					}
					/**
					* 获取： 婚礼公司照片
					*/
					public String getHunligongsiPhoto() {
						return hunligongsiPhoto;
					}
					/**
					* 设置： 婚礼公司照片
					*/
					public void setHunligongsiPhoto(String hunligongsiPhoto) {
						this.hunligongsiPhoto = hunligongsiPhoto;
					}
					/**
					* 获取： 公司位置
					*/
					public String getHunligongsiAddress() {
						return hunligongsiAddress;
					}
					/**
					* 设置： 公司位置
					*/
					public void setHunligongsiAddress(String hunligongsiAddress) {
						this.hunligongsiAddress = hunligongsiAddress;
					}
					/**
					* 获取： 公司规模
					*/
					public String getHunligongsiGuimo() {
						return hunligongsiGuimo;
					}
					/**
					* 设置： 公司规模
					*/
					public void setHunligongsiGuimo(String hunligongsiGuimo) {
						this.hunligongsiGuimo = hunligongsiGuimo;
					}
					/**
					* 获取： 注册资金
					*/
					public String getHunligongsiZijin() {
						return hunligongsiZijin;
					}
					/**
					* 设置： 注册资金
					*/
					public void setHunligongsiZijin(String hunligongsiZijin) {
						this.hunligongsiZijin = hunligongsiZijin;
					}
					/**
					* 获取： 公司介绍
					*/
					public String getHunligongsiContent() {
						return hunligongsiContent;
					}
					/**
					* 设置： 公司介绍
					*/
					public void setHunligongsiContent(String hunligongsiContent) {
						this.hunligongsiContent = hunligongsiContent;
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
