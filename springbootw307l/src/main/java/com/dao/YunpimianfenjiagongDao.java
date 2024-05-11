package com.dao;

import com.entity.YunpimianfenjiagongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YunpimianfenjiagongVO;
import com.entity.view.YunpimianfenjiagongView;


/**
 * 云匹面粉加工
 * 
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface YunpimianfenjiagongDao extends BaseMapper<YunpimianfenjiagongEntity> {
	
	List<YunpimianfenjiagongVO> selectListVO(@Param("ew") Wrapper<YunpimianfenjiagongEntity> wrapper);
	
	YunpimianfenjiagongVO selectVO(@Param("ew") Wrapper<YunpimianfenjiagongEntity> wrapper);
	
	List<YunpimianfenjiagongView> selectListView(@Param("ew") Wrapper<YunpimianfenjiagongEntity> wrapper);

	List<YunpimianfenjiagongView> selectListView(Pagination page,@Param("ew") Wrapper<YunpimianfenjiagongEntity> wrapper);
	
	YunpimianfenjiagongView selectView(@Param("ew") Wrapper<YunpimianfenjiagongEntity> wrapper);
	
}
