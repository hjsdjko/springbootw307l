package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhongzhijidiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhongzhijidiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhongzhijidiView;


/**
 * 种植基地评论表
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:29:23
 */
public interface DiscusszhongzhijidiService extends IService<DiscusszhongzhijidiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhongzhijidiVO> selectListVO(Wrapper<DiscusszhongzhijidiEntity> wrapper);
   	
   	DiscusszhongzhijidiVO selectVO(@Param("ew") Wrapper<DiscusszhongzhijidiEntity> wrapper);
   	
   	List<DiscusszhongzhijidiView> selectListView(Wrapper<DiscusszhongzhijidiEntity> wrapper);
   	
   	DiscusszhongzhijidiView selectView(@Param("ew") Wrapper<DiscusszhongzhijidiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhongzhijidiEntity> wrapper);
   	
}

