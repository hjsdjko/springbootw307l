package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YunpimianfenjiagongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YunpimianfenjiagongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YunpimianfenjiagongView;


/**
 * 云匹面粉加工
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface YunpimianfenjiagongService extends IService<YunpimianfenjiagongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YunpimianfenjiagongVO> selectListVO(Wrapper<YunpimianfenjiagongEntity> wrapper);
   	
   	YunpimianfenjiagongVO selectVO(@Param("ew") Wrapper<YunpimianfenjiagongEntity> wrapper);
   	
   	List<YunpimianfenjiagongView> selectListView(Wrapper<YunpimianfenjiagongEntity> wrapper);
   	
   	YunpimianfenjiagongView selectView(@Param("ew") Wrapper<YunpimianfenjiagongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YunpimianfenjiagongEntity> wrapper);
   	
}

