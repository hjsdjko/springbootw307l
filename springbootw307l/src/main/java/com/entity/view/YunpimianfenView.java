package com.entity.view;

import com.entity.YunpimianfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 云匹面粉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
@TableName("yunpimianfen")
public class YunpimianfenView  extends YunpimianfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YunpimianfenView(){
	}
 
 	public YunpimianfenView(YunpimianfenEntity yunpimianfenEntity){
 	try {
			BeanUtils.copyProperties(this, yunpimianfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
