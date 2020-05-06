package com.lide.house.dao;

import java.util.List;

import com.lide.house.domain.House;
import com.lide.house.domain.HouseVo;

public interface HouseMapper {
	List<House> selectsHouse(HouseVo vo);
	int addOne(House house);
	int addAll(List<House> houses);
}
