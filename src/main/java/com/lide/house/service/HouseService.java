package com.lide.house.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.lide.house.domain.House;
import com.lide.house.domain.HouseVo;

public interface HouseService {
	@Transactional
	List<House> selectsHouse(HouseVo vo);
	@Transactional
	int addOne(House house);
	@Transactional
	int addAll(List<House> houses);
}
