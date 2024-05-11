package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YunpixiaomaicaishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YunpixiaomaicaishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YunpixiaomaicaishouView;


/**
 * 云匹小麦采收
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface YunpixiaomaicaishouService extends IService<YunpixiaomaicaishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YunpixiaomaicaishouVO> selectListVO(Wrapper<YunpixiaomaicaishouEntity> wrapper);
   	
   	YunpixiaomaicaishouVO selectVO(@Param("ew") Wrapper<YunpixiaomaicaishouEntity> wrapper);
   	
   	List<YunpixiaomaicaishouView> selectListView(Wrapper<YunpixiaomaicaishouEntity> wrapper);
   	
   	YunpixiaomaicaishouView selectView(@Param("ew") Wrapper<YunpixiaomaicaishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YunpixiaomaicaishouEntity> wrapper);
   	
}

