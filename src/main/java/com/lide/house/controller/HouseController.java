package com.lide.house.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lide.house.dao.HouseMapper;
import com.lide.house.domain.House;
import com.lide.house.domain.HouseVo;
import com.lide.house.service.HouseService;

@Controller
public class HouseController {
	
	@Resource
	private HouseService service;
	
	@RequestMapping("list")
	public String lists(Model model,@RequestParam(defaultValue = "1")Integer pageNum,HouseVo vo) {
		PageHelper.startPage(pageNum,10);
		List<House> list = service.selectsHouse(vo);
		PageInfo info = new PageInfo(list);
		model.addAttribute("vo",vo );
		model.addAttribute("info",info);
		model.addAttribute("list",info.getList());
		return "show";
	}
	
}
