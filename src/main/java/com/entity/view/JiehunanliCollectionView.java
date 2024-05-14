package com.entity.view;

import com.entity.JiehunanliCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 结婚案例收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiehunanli_collection")
public class JiehunanliCollectionView extends JiehunanliCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String jiehunanliCollectionValue;



		//级联表 jiehunanli
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

	public JiehunanliCollectionView() {

	}

	public JiehunanliCollectionView(JiehunanliCollectionEntity jiehunanliCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, jiehunanliCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getJiehunanliCollectionValue() {
				return jiehunanliCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setJiehunanliCollectionValue(String jiehunanliCollectionValue) {
				this.jiehunanliCollectionValue = jiehunanliCollectionValue;
			}
















				//级联表的get和set jiehunanli
					/**
					* 获取： 结婚案例编号
					*/
					public String getHunligongsiOrderUuidNumber() {
						return hunligongsiOrderUuidNumber;
					}
					/**
					* 设置： 结婚案例编号
					*/
					public void setHunligongsiOrderUuidNumber(String hunligongsiOrderUuidNumber) {
						this.hunligongsiOrderUuidNumber = hunligongsiOrderUuidNumber;
					}
					/**
					* 获取： 结婚案例名称
					*/
					public String getJiehunanliName() {
						return jiehunanliName;
					}
					/**
					* 设置： 结婚案例名称
					*/
					public void setJiehunanliName(String jiehunanliName) {
						this.jiehunanliName = jiehunanliName;
					}
					/**
					* 获取： 结婚案例照片
					*/
					public String getJiehunanliPhoto() {
						return jiehunanliPhoto;
					}
					/**
					* 设置： 结婚案例照片
					*/
					public void setJiehunanliPhoto(String jiehunanliPhoto) {
						this.jiehunanliPhoto = jiehunanliPhoto;
					}
					/**
					* 获取： 结婚案例详情
					*/
					public String getJiehunanliContent() {
						return jiehunanliContent;
					}
					/**
					* 设置： 结婚案例详情
					*/
					public void setJiehunanliContent(String jiehunanliContent) {
						this.jiehunanliContent = jiehunanliContent;
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
