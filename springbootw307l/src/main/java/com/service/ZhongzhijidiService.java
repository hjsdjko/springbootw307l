package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongzhijidiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongzhijidiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongzhijidiView;


/**
 * 种植基地
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface ZhongzhijidiService extends IService<ZhongzhijidiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongzhijidiVO> selectListVO(Wrapper<ZhongzhijidiEntity> wrapper);
   	
   	ZhongzhijidiVO selectVO(@Param("ew") Wrapper<ZhongzhijidiEntity> wrapper);
   	
   	List<ZhongzhijidiView> selectListView(Wrapper<ZhongzhijidiEntity> wrapper);
   	
   	ZhongzhijidiView selectView(@Param("ew") Wrapper<ZhongzhijidiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongzhijidiEntity> wrapper);
   	
}

