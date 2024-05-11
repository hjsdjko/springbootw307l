package com.entity.model;

import com.entity.YunpimianfenjiagongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 云匹面粉加工
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public class YunpimianfenjiagongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 种植基地
	 */
	
	private String zhongzhijidi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：种植基地
	 */
	 
	public void setZhongzhijidi(String zhongzhijidi) {
		this.zhongzhijidi = zhongzhijidi;
	}
	
	/**
	 * 获取：种植基地
	 */
	public String getZhongzhijidi() {
		return zhongzhijidi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
