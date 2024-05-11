package com.entity.view;

import com.entity.MianfenfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 面粉分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
@TableName("mianfenfenlei")
public class MianfenfenleiView  extends MianfenfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MianfenfenleiView(){
	}
 
 	public MianfenfenleiView(MianfenfenleiEntity mianfenfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, mianfenfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
