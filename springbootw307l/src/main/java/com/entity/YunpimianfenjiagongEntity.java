package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 云匹面粉加工
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
@TableName("yunpimianfenjiagong")
public class YunpimianfenjiagongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YunpimianfenjiagongEntity() {
		
	}
	
	public YunpimianfenjiagongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 面粉制作
	 */
					
	private String mianfenzhizuo;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：面粉制作
	 */
	public void setMianfenzhizuo(String mianfenzhizuo) {
		this.mianfenzhizuo = mianfenzhizuo;
	}
	/**
	 * 获取：面粉制作
	 */
	public String getMianfenzhizuo() {
		return mianfenzhizuo;
	}
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
