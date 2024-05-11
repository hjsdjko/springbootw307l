package com.entity.model;

import com.entity.YunpixiaomaicaishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 云匹小麦采收
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public class YunpixiaomaicaishouModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 采收现场
	 */
	
	private String caishouxianchang;
		
	/**
	 * 采收图片
	 */
	
	private String caishoutupian;
				
	
	/**
	 * 设置：采收现场
	 */
	 
	public void setCaishouxianchang(String caishouxianchang) {
		this.caishouxianchang = caishouxianchang;
	}
	
	/**
	 * 获取：采收现场
	 */
	public String getCaishouxianchang() {
		return caishouxianchang;
	}
				
	
	/**
	 * 设置：采收图片
	 */
	 
	public void setCaishoutupian(String caishoutupian) {
		this.caishoutupian = caishoutupian;
	}
	
	/**
	 * 获取：采收图片
	 */
	public String getCaishoutupian() {
		return caishoutupian;
	}
			
}
