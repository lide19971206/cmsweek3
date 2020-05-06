package com.lide.house.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void test() {
		String num = StringUtil.randomNum(11);
		System.out.println(num);
	}

}
