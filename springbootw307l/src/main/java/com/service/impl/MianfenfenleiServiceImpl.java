package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MianfenfenleiDao;
import com.entity.MianfenfenleiEntity;
import com.service.MianfenfenleiService;
import com.entity.vo.MianfenfenleiVO;
import com.entity.view.MianfenfenleiView;

@Service("mianfenfenleiService")
public class MianfenfenleiServiceImpl extends ServiceImpl<MianfenfenleiDao, MianfenfenleiEntity> implements MianfenfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianfenfenleiEntity> page = this.selectPage(
                new Query<MianfenfenleiEntity>(params).getPage(),
                new EntityWrapper<MianfenfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianfenfenleiEntity> wrapper) {
		  Page<MianfenfenleiView> page =new Query<MianfenfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianfenfenleiVO> selectListVO(Wrapper<MianfenfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianfenfenleiVO selectVO(Wrapper<MianfenfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianfenfenleiView> selectListView(Wrapper<MianfenfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianfenfenleiView selectView(Wrapper<MianfenfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
