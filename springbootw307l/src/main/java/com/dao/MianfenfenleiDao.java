package com.dao;

import com.entity.MianfenfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianfenfenleiVO;
import com.entity.view.MianfenfenleiView;


/**
 * 面粉分类
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface MianfenfenleiDao extends BaseMapper<MianfenfenleiEntity> {
	
	List<MianfenfenleiVO> selectListVO(@Param("ew") Wrapper<MianfenfenleiEntity> wrapper);
	
	MianfenfenleiVO selectVO(@Param("ew") Wrapper<MianfenfenleiEntity> wrapper);
	
	List<MianfenfenleiView> selectListView(@Param("ew") Wrapper<MianfenfenleiEntity> wrapper);

	List<MianfenfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<MianfenfenleiEntity> wrapper);
	
	MianfenfenleiView selectView(@Param("ew") Wrapper<MianfenfenleiEntity> wrapper);
	
}
