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
 * 云匹面粉
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
@TableName("yunpimianfen")
public class YunpimianfenEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YunpimianfenEntity() {
		
	}
	
	public YunpimianfenEntity(T t) {
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
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 原料
	 */
					
	private String yuanliao;
	
	/**
	 * 配料
	 */
					
	private String peiliao;
	
	/**
	 * 种植基地
	 */
					
	private String zhongzhijidi;
	
	/**
	 * 净含量
	 */
					
	private String jinghanliang;
	
	/**
	 * 保质期
	 */
					
	private String baozhiqi;
	
	/**
	 * 储存方法
	 */
					
	private String chucunfangfa;
	
	/**
	 * 适用
	 */
					
	private String shiyong;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 生产日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shengchanriqi;
	
	/**
	 * 分类
	 */
					
	private String fenlei;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
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
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：原料
	 */
	public void setYuanliao(String yuanliao) {
		this.yuanliao = yuanliao;
	}
	/**
	 * 获取：原料
	 */
	public String getYuanliao() {
		return yuanliao;
	}
	/**
	 * 设置：配料
	 */
	public void setPeiliao(String peiliao) {
		this.peiliao = peiliao;
	}
	/**
	 * 获取：配料
	 */
	public String getPeiliao() {
		return peiliao;
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
	 * 设置：净含量
	 */
	public void setJinghanliang(String jinghanliang) {
		this.jinghanliang = jinghanliang;
	}
	/**
	 * 获取：净含量
	 */
	public String getJinghanliang() {
		return jinghanliang;
	}
	/**
	 * 设置：保质期
	 */
	public void setBaozhiqi(String baozhiqi) {
		this.baozhiqi = baozhiqi;
	}
	/**
	 * 获取：保质期
	 */
	public String getBaozhiqi() {
		return baozhiqi;
	}
	/**
	 * 设置：储存方法
	 */
	public void setChucunfangfa(String chucunfangfa) {
		this.chucunfangfa = chucunfangfa;
	}
	/**
	 * 获取：储存方法
	 */
	public String getChucunfangfa() {
		return chucunfangfa;
	}
	/**
	 * 设置：适用
	 */
	public void setShiyong(String shiyong) {
		this.shiyong = shiyong;
	}
	/**
	 * 获取：适用
	 */
	public String getShiyong() {
		return shiyong;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
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
	 * 设置：生产日期
	 */
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
	/**
	 * 设置：分类
	 */
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
