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


import com.dao.YunpixiaomaicaishouDao;
import com.entity.YunpixiaomaicaishouEntity;
import com.service.YunpixiaomaicaishouService;
import com.entity.vo.YunpixiaomaicaishouVO;
import com.entity.view.YunpixiaomaicaishouView;

@Service("yunpixiaomaicaishouService")
public class YunpixiaomaicaishouServiceImpl extends ServiceImpl<YunpixiaomaicaishouDao, YunpixiaomaicaishouEntity> implements YunpixiaomaicaishouService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YunpixiaomaicaishouEntity> page = this.selectPage(
                new Query<YunpixiaomaicaishouEntity>(params).getPage(),
                new EntityWrapper<YunpixiaomaicaishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YunpixiaomaicaishouEntity> wrapper) {
		  Page<YunpixiaomaicaishouView> page =new Query<YunpixiaomaicaishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YunpixiaomaicaishouVO> selectListVO(Wrapper<YunpixiaomaicaishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YunpixiaomaicaishouVO selectVO(Wrapper<YunpixiaomaicaishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YunpixiaomaicaishouView> selectListView(Wrapper<YunpixiaomaicaishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YunpixiaomaicaishouView selectView(Wrapper<YunpixiaomaicaishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
