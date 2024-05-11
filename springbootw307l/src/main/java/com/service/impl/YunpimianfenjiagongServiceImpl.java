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


import com.dao.YunpimianfenjiagongDao;
import com.entity.YunpimianfenjiagongEntity;
import com.service.YunpimianfenjiagongService;
import com.entity.vo.YunpimianfenjiagongVO;
import com.entity.view.YunpimianfenjiagongView;

@Service("yunpimianfenjiagongService")
public class YunpimianfenjiagongServiceImpl extends ServiceImpl<YunpimianfenjiagongDao, YunpimianfenjiagongEntity> implements YunpimianfenjiagongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YunpimianfenjiagongEntity> page = this.selectPage(
                new Query<YunpimianfenjiagongEntity>(params).getPage(),
                new EntityWrapper<YunpimianfenjiagongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YunpimianfenjiagongEntity> wrapper) {
		  Page<YunpimianfenjiagongView> page =new Query<YunpimianfenjiagongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YunpimianfenjiagongVO> selectListVO(Wrapper<YunpimianfenjiagongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YunpimianfenjiagongVO selectVO(Wrapper<YunpimianfenjiagongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YunpimianfenjiagongView> selectListView(Wrapper<YunpimianfenjiagongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YunpimianfenjiagongView selectView(Wrapper<YunpimianfenjiagongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
