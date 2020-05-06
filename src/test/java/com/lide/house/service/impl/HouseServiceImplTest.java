package com.lide.house.service.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.internal.builders.JUnit4Builder;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.lide.house.domain.House;
import com.lide.house.domain.HouseVo;
import com.lide.house.service.HouseService;
import com.lide.house.utils.DateUtils;
import com.lide.house.utils.RandomUtil;
import com.lide.house.utils.StringUtil;

import junit.framework.JUnit4TestAdapter;
import junit.framework.JUnit4TestAdapterCache;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:spring-beans.xml"})
public class HouseServiceImplTest {


	@Resource
	private HouseService service;
	
	@Test
	public void test() {
		//预订日期   模拟从2020年5月1日至今任意随机日期（4分） 
		//姓名       调用StringUtil.generateChineseName()创建（4分）
		//手机       11位数字（4分）
		//房型id    来自房型类型表（4分）
		//备注       随机汉字（4分）
		List<House> houses = new ArrayList<House>();
		for (int i = 0; i < 100; i++) {
			House house = new House();
			Calendar c = Calendar.getInstance();
			c.set(2020,4,1);
			house.setCreatedata(DateUtils.randomDate(c.getTime(), new Date()));
			house.setName(StringUtil.generateChineseName());
			house.setPhone(StringUtil.randomNum(11));
			house.setTypeid(RandomUtil.random(1,3));
			house.setShowtext(StringUtil.randomChineseString(50));
			System.out.println(house);
			houses.add(house);
			
		}
		service.addAll(houses);
		
	}

}
