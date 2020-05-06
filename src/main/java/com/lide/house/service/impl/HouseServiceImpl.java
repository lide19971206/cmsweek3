package com.lide.house.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lide.house.dao.HouseMapper;
import com.lide.house.domain.House;
import com.lide.house.domain.HouseVo;
import com.lide.house.service.HouseService;

@Service
public class HouseServiceImpl implements HouseService {

	@Resource
	private HouseMapper mapper;
	
	@Override
	public List<House> selectsHouse(HouseVo vo) {
		// TODO Auto-generated method stub
		return mapper.selectsHouse(vo);
	}

	@Override
	public int addOne(House house) {
		// TODO Auto-generated method stub
		return mapper.addOne(house);
	}

	@Override
	public int addAll(List<House> houses) {
		// TODO Auto-generated method stub
		return mapper.addAll(houses);
	}

}
