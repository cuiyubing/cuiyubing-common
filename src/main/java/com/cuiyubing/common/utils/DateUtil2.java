package com.cuiyubing.common.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil2 {

	/**
	 * 
	 * @Title: getDateByInitMonth 
	 * @Description: 给一个时间对象，返回该时间所在月的1日0时0分0秒。
	 * 例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByInitMonth(Date src){
		//获取Calendar对象
		Calendar c = Calendar.getInstance();
		//用传入的时间初始化日历对象
		c.setTime(src);
		//改变日期的日,时,分,秒
		c.set(Calendar.DATE,0);
		c.set(Calendar.HOUR,12);
		c.set(Calendar.MINUTE,0);
		c.set(Calendar.SECOND,0);

		return c.getTime();
	}
	/**
	 * 
	 * @Title: getDateByFullMonth 
	 * @Description: 给一个时间对象，返回该时间所在月的最后日23时59分59秒，
	 * 需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，
	* 则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，
	* 则返回的时间为2019-02-28 23:59:59
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByFullMonth(Date src){
		//用传入的日期初始化日历类,然后让当前日期设置为下个月的月初
		//最后在月初减去1秒
		Calendar c=Calendar.getInstance();
		c.setTime(src);
		//让月份加
		c.add(Calendar.MONTH, 1);
		//获取月份
		Date monthStart=getDateByInitMonth(c.getTime());
		//用月初初始化日历类
		c.setTime(monthStart);
		//用月初时间-1秒
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}
}
