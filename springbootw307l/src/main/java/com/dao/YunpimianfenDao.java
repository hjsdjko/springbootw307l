package com.dao;

import com.entity.YunpimianfenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YunpimianfenVO;
import com.entity.view.YunpimianfenView;


/**
 * 云匹面粉
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface YunpimianfenDao extends BaseMapper<YunpimianfenEntity> {
	
	List<YunpimianfenVO> selectListVO(@Param("ew") Wrapper<YunpimianfenEntity> wrapper);
	
	YunpimianfenVO selectVO(@Param("ew") Wrapper<YunpimianfenEntity> wrapper);
	
	List<YunpimianfenView> selectListView(@Param("ew") Wrapper<YunpimianfenEntity> wrapper);

	List<YunpimianfenView> selectListView(Pagination page,@Param("ew") Wrapper<YunpimianfenEntity> wrapper);
	
	YunpimianfenView selectView(@Param("ew") Wrapper<YunpimianfenEntity> wrapper);
	
}
