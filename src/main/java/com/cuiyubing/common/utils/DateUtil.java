package com.cuiyubing.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	//2010年1月1日至今任意随机时间
	public static Date randomDate(Date startDate) {
		//用当前时间获取日历类
		Calendar c = Calendar.getInstance();
		//当前时间的毫秒值,即从1970到现在的毫秒数
		long endMilis = c.getTimeInMillis();
		//用传入的日期初始化日历类Calendar
		c.setTime(startDate);
		//获取开始时间的毫秒数
		long startMillis = c.getTimeInMillis();
		long x=(long)(Math.random()*(endMilis-startMillis+1))+startMillis;
		//用时间差创建日历类
		c.setTimeInMillis(x);
		return c.getTime();
		
		
	}
}
