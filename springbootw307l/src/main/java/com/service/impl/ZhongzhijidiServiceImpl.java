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


import com.dao.ZhongzhijidiDao;
import com.entity.ZhongzhijidiEntity;
import com.service.ZhongzhijidiService;
import com.entity.vo.ZhongzhijidiVO;
import com.entity.view.ZhongzhijidiView;

@Service("zhongzhijidiService")
public class ZhongzhijidiServiceImpl extends ServiceImpl<ZhongzhijidiDao, ZhongzhijidiEntity> implements ZhongzhijidiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhongzhijidiEntity> page = this.selectPage(
                new Query<ZhongzhijidiEntity>(params).getPage(),
                new EntityWrapper<ZhongzhijidiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhongzhijidiEntity> wrapper) {
		  Page<ZhongzhijidiView> page =new Query<ZhongzhijidiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhongzhijidiVO> selectListVO(Wrapper<ZhongzhijidiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhongzhijidiVO selectVO(Wrapper<ZhongzhijidiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhongzhijidiView> selectListView(Wrapper<ZhongzhijidiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhongzhijidiView selectView(Wrapper<ZhongzhijidiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
