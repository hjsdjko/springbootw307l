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


import com.dao.DiscusszhongzhijidiDao;
import com.entity.DiscusszhongzhijidiEntity;
import com.service.DiscusszhongzhijidiService;
import com.entity.vo.DiscusszhongzhijidiVO;
import com.entity.view.DiscusszhongzhijidiView;

@Service("discusszhongzhijidiService")
public class DiscusszhongzhijidiServiceImpl extends ServiceImpl<DiscusszhongzhijidiDao, DiscusszhongzhijidiEntity> implements DiscusszhongzhijidiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhongzhijidiEntity> page = this.selectPage(
                new Query<DiscusszhongzhijidiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhongzhijidiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhongzhijidiEntity> wrapper) {
		  Page<DiscusszhongzhijidiView> page =new Query<DiscusszhongzhijidiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhongzhijidiVO> selectListVO(Wrapper<DiscusszhongzhijidiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhongzhijidiVO selectVO(Wrapper<DiscusszhongzhijidiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhongzhijidiView> selectListView(Wrapper<DiscusszhongzhijidiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhongzhijidiView selectView(Wrapper<DiscusszhongzhijidiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
