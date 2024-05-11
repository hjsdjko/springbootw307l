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


import com.dao.DiscussyunpimianfenDao;
import com.entity.DiscussyunpimianfenEntity;
import com.service.DiscussyunpimianfenService;
import com.entity.vo.DiscussyunpimianfenVO;
import com.entity.view.DiscussyunpimianfenView;

@Service("discussyunpimianfenService")
public class DiscussyunpimianfenServiceImpl extends ServiceImpl<DiscussyunpimianfenDao, DiscussyunpimianfenEntity> implements DiscussyunpimianfenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyunpimianfenEntity> page = this.selectPage(
                new Query<DiscussyunpimianfenEntity>(params).getPage(),
                new EntityWrapper<DiscussyunpimianfenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyunpimianfenEntity> wrapper) {
		  Page<DiscussyunpimianfenView> page =new Query<DiscussyunpimianfenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyunpimianfenVO> selectListVO(Wrapper<DiscussyunpimianfenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyunpimianfenVO selectVO(Wrapper<DiscussyunpimianfenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyunpimianfenView> selectListView(Wrapper<DiscussyunpimianfenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyunpimianfenView selectView(Wrapper<DiscussyunpimianfenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
