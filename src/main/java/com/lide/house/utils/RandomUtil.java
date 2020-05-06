package com.lide.house.utils;

import java.util.Random;

public class RandomUtil {
	public static Integer random(Integer min,Integer max) {
		Random r = new Random();
		Integer i  = r.nextInt(max-min+1)+min;
		return i ;
	};
	
}
