package com.dao;

import com.entity.DiscussyunpimianfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyunpimianfenVO;
import com.entity.view.DiscussyunpimianfenView;


/**
 * 云匹面粉评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:29:23
 */
public interface DiscussyunpimianfenDao extends BaseMapper<DiscussyunpimianfenEntity> {
	
	List<DiscussyunpimianfenVO> selectListVO(@Param("ew") Wrapper<DiscussyunpimianfenEntity> wrapper);
	
	DiscussyunpimianfenVO selectVO(@Param("ew") Wrapper<DiscussyunpimianfenEntity> wrapper);
	
	List<DiscussyunpimianfenView> selectListView(@Param("ew") Wrapper<DiscussyunpimianfenEntity> wrapper);

	List<DiscussyunpimianfenView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyunpimianfenEntity> wrapper);
	
	DiscussyunpimianfenView selectView(@Param("ew") Wrapper<DiscussyunpimianfenEntity> wrapper);
	
}
