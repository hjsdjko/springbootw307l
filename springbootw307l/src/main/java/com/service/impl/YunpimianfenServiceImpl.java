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


import com.dao.YunpimianfenDao;
import com.entity.YunpimianfenEntity;
import com.service.YunpimianfenService;
import com.entity.vo.YunpimianfenVO;
import com.entity.view.YunpimianfenView;

@Service("yunpimianfenService")
public class YunpimianfenServiceImpl extends ServiceImpl<YunpimianfenDao, YunpimianfenEntity> implements YunpimianfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YunpimianfenEntity> page = this.selectPage(
                new Query<YunpimianfenEntity>(params).getPage(),
                new EntityWrapper<YunpimianfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YunpimianfenEntity> wrapper) {
		  Page<YunpimianfenView> page =new Query<YunpimianfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YunpimianfenVO> selectListVO(Wrapper<YunpimianfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YunpimianfenVO selectVO(Wrapper<YunpimianfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YunpimianfenView> selectListView(Wrapper<YunpimianfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YunpimianfenView selectView(Wrapper<YunpimianfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
