package com.cuiyubing.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 字符串工具类的编写
 * @author:cyb 
 * @date: 2019年7月17日 上午8:15:08
 */
public class DateUtil3 {
	
	/**
	 * 
	 * @Title: getAge 
	 * @Description: 方法1：根据传入的日期获取年龄
	 * @param src
	 * @return
	 * @return: int
	 */
	public static int getAge (Date src) {
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		long timeInMillis = c.getTimeInMillis();
		
		c.setTime(new Date());
		long timeInMillis2 = c.getTimeInMillis();
		
		return (int) ((timeInMillis2-timeInMillis)/60/60/24/1000/365);
		
	}

	/**
	 * 
	 * @Title: getDateByMonthInit 
	 * @Description: 方法2：根据传入的参数获取该日期的月初日期，
	 * 例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByMonthInit (Date src) {
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		
		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
	}

	/**
	 * 
	 * @Title: getDateByMonthLast 
	 * @Description: 方法3 :根据传入的参数获取该日器的月末日期，
	 * 例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByMonthLast(Date src) {
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		c.add(Calendar.MONTH, 1);
		
		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}

	/**
	 * 
	 * @Title: getDaysByFuture 
	 * @Description: 方法4：求未来日期离今天还剩的天数
	 * @param future
	 * @return
	 * @return: int
	 */
	public static int getDaysByFuture (Date future) {
		Calendar c = Calendar.getInstance();
		c.setTime(future);
		
		long timeInMillis = c.getTimeInMillis();
		System.out.println("未来"+timeInMillis);
		
		c.setTime(new Date());
		long timeInMillis2 = c.getTimeInMillis();
		System.out.println("现在"+timeInMillis2);
		
		return (int) ((timeInMillis-timeInMillis2)/60/60/24/1000);
	}

	/**
	 * 
	 * @Title: getDaysByDeparted 
	 * @Description: 方法5：求过去日期离今天过去的天数
	 * @param departed
	 * @return
	 * @return: int
	 */
	public static int getDaysByDeparted (Date departed) {
		Calendar c = Calendar.getInstance();
		c.setTime(departed);
		long timeInMillis = c.getTimeInMillis();
		c.setTime(new Date());
		long timeInMillis2 = c.getTimeInMillis();
		
		
		return (int) ((timeInMillis2-timeInMillis)/60/60/24/1000);
	}
}
