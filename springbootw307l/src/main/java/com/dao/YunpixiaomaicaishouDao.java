package com.dao;

import com.entity.YunpixiaomaicaishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YunpixiaomaicaishouVO;
import com.entity.view.YunpixiaomaicaishouView;


/**
 * 云匹小麦采收
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface YunpixiaomaicaishouDao extends BaseMapper<YunpixiaomaicaishouEntity> {
	
	List<YunpixiaomaicaishouVO> selectListVO(@Param("ew") Wrapper<YunpixiaomaicaishouEntity> wrapper);
	
	YunpixiaomaicaishouVO selectVO(@Param("ew") Wrapper<YunpixiaomaicaishouEntity> wrapper);
	
	List<YunpixiaomaicaishouView> selectListView(@Param("ew") Wrapper<YunpixiaomaicaishouEntity> wrapper);

	List<YunpixiaomaicaishouView> selectListView(Pagination page,@Param("ew") Wrapper<YunpixiaomaicaishouEntity> wrapper);
	
	YunpixiaomaicaishouView selectView(@Param("ew") Wrapper<YunpixiaomaicaishouEntity> wrapper);
	
}
