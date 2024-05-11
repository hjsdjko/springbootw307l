package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YunpimianfenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YunpimianfenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YunpimianfenView;


/**
 * 云匹面粉
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface YunpimianfenService extends IService<YunpimianfenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YunpimianfenVO> selectListVO(Wrapper<YunpimianfenEntity> wrapper);
   	
   	YunpimianfenVO selectVO(@Param("ew") Wrapper<YunpimianfenEntity> wrapper);
   	
   	List<YunpimianfenView> selectListView(Wrapper<YunpimianfenEntity> wrapper);
   	
   	YunpimianfenView selectView(@Param("ew") Wrapper<YunpimianfenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YunpimianfenEntity> wrapper);
   	
}

