package com.dao;

import com.entity.ZhongzhijidiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongzhijidiVO;
import com.entity.view.ZhongzhijidiView;


/**
 * 种植基地
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface ZhongzhijidiDao extends BaseMapper<ZhongzhijidiEntity> {
	
	List<ZhongzhijidiVO> selectListVO(@Param("ew") Wrapper<ZhongzhijidiEntity> wrapper);
	
	ZhongzhijidiVO selectVO(@Param("ew") Wrapper<ZhongzhijidiEntity> wrapper);
	
	List<ZhongzhijidiView> selectListView(@Param("ew") Wrapper<ZhongzhijidiEntity> wrapper);

	List<ZhongzhijidiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongzhijidiEntity> wrapper);
	
	ZhongzhijidiView selectView(@Param("ew") Wrapper<ZhongzhijidiEntity> wrapper);
	
}
