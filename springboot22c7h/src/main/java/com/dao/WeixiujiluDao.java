package com.dao;

import com.entity.WeixiujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeixiujiluVO;
import com.entity.view.WeixiujiluView;


/**
 * 维修记录
 * 
 * @author 
 * @email 
 * @date 2023-04-16 09:14:39
 */
public interface WeixiujiluDao extends BaseMapper<WeixiujiluEntity> {
	
	List<WeixiujiluVO> selectListVO(@Param("ew") Wrapper<WeixiujiluEntity> wrapper);
	
	WeixiujiluVO selectVO(@Param("ew") Wrapper<WeixiujiluEntity> wrapper);
	
	List<WeixiujiluView> selectListView(@Param("ew") Wrapper<WeixiujiluEntity> wrapper);

	List<WeixiujiluView> selectListView(Pagination page,@Param("ew") Wrapper<WeixiujiluEntity> wrapper);
	
	WeixiujiluView selectView(@Param("ew") Wrapper<WeixiujiluEntity> wrapper);
	

}
