package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyunpimianfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyunpimianfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyunpimianfenView;


/**
 * 云匹面粉评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:29:23
 */
public interface DiscussyunpimianfenService extends IService<DiscussyunpimianfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyunpimianfenVO> selectListVO(Wrapper<DiscussyunpimianfenEntity> wrapper);
   	
   	DiscussyunpimianfenVO selectVO(@Param("ew") Wrapper<DiscussyunpimianfenEntity> wrapper);
   	
   	List<DiscussyunpimianfenView> selectListView(Wrapper<DiscussyunpimianfenEntity> wrapper);
   	
   	DiscussyunpimianfenView selectView(@Param("ew") Wrapper<DiscussyunpimianfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyunpimianfenEntity> wrapper);
   	
}

