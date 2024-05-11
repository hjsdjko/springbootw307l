package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianfenfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianfenfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianfenfenleiView;


/**
 * 面粉分类
 *
 * @author 
 * @email 
 * @date 2021-04-26 11:29:22
 */
public interface MianfenfenleiService extends IService<MianfenfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianfenfenleiVO> selectListVO(Wrapper<MianfenfenleiEntity> wrapper);
   	
   	MianfenfenleiVO selectVO(@Param("ew") Wrapper<MianfenfenleiEntity> wrapper);
   	
   	List<MianfenfenleiView> selectListView(Wrapper<MianfenfenleiEntity> wrapper);
   	
   	MianfenfenleiView selectView(@Param("ew") Wrapper<MianfenfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianfenfenleiEntity> wrapper);
   	
}

