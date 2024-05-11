package com.dao;

import com.entity.DiscusszhongzhijidiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhongzhijidiVO;
import com.entity.view.DiscusszhongzhijidiView;


/**
 * 种植基地评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:29:23
 */
public interface DiscusszhongzhijidiDao extends BaseMapper<DiscusszhongzhijidiEntity> {
	
	List<DiscusszhongzhijidiVO> selectListVO(@Param("ew") Wrapper<DiscusszhongzhijidiEntity> wrapper);
	
	DiscusszhongzhijidiVO selectVO(@Param("ew") Wrapper<DiscusszhongzhijidiEntity> wrapper);
	
	List<DiscusszhongzhijidiView> selectListView(@Param("ew") Wrapper<DiscusszhongzhijidiEntity> wrapper);

	List<DiscusszhongzhijidiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhongzhijidiEntity> wrapper);
	
	DiscusszhongzhijidiView selectView(@Param("ew") Wrapper<DiscusszhongzhijidiEntity> wrapper);
	
}
