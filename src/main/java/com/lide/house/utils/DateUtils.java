package com.lide.house.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DateUtils {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生一个在startDate和endDate的随机日期
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDate) {
		//从1970年到startDate的毫秒数
		long endTime = endDate.getTime();
		long startTime = startDate.getTime();
		if(endTime<startTime) {
			throw new IllegalArgumentException("开始日期不能大于结束日期");
		}
		//随机产生一个在t1和t2之间的毫秒数
		long t = (long) ((Math.random() * (endTime-startTime+1)) +startTime);
		return new Date(t);
	}
	
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回传入日期的月初 如传入2020/3/27 返回2020/3/01 00:00:00
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date) {
		//获取一个日历类，相当于空白的东西，你去给它赋值
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//设置日历的开始日期为第一天
		c.set(Calendar.DAY_OF_MONTH, 1);
		//设置天的第0个小时
		c.set(Calendar.HOUR_OF_DAY, 0);
		//设置天的0分钟
		c.set(Calendar.MINUTE, 0);
		//设置天的0秒
		c.set(Calendar.SECOND, 0);
		return c.getTime();
		
	}
	
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 返回一个月的月末，返回2020/3/31 23:59:59
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		//让当前月份加1变成4/27  变成月初2020/4/1 00:00:00 再减去1秒
		c.add(Calendar.MONTH, 1);
		//变成月初
		Date initMonth = getInitMonth(c.getTime());
		//先再次初始化，给值
		c.setTime(initMonth);
		//减1秒
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	public static int getAgeByBirthday(Date date) {
		Calendar c = Calendar.getInstance();
		int sysYear = c.get(Calendar.YEAR);
		int sysMonth  = c.get(Calendar.MONTH);
		int sysDay = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(date);
		int myYear = c.get(Calendar.YEAR);
		int myMonth  = c.get(Calendar.MONTH);
		int myDay = c.get(Calendar.DAY_OF_MONTH);
		if (myYear>sysYear) {
			throw new RuntimeException("输入的日期不合法");
		}
		int  age =sysYear-myYear;
		if (myMonth > sysMonth) {
			age--;
		}
		if (myMonth==sysMonth && myDay > sysDay) {
			age--;
		}
		return age;
	}
}
