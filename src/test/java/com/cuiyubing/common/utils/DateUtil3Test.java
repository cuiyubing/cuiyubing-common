package com.cuiyubing.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


public class DateUtil3Test {

	@Test
	public void testGetAge() {
		
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1999);
		int age = DateUtil3.getAge(c.getTime());
		
		System.out.println(age);
		
	}

	@Test
	public void testGetDateByMonthInit() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, 3);
		
		Date date = DateUtil3.getDateByMonthInit(c.getTime());
		System.out.println(df.format(date));
	}

	@Test
	public void testGetDateByMonthLast() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, 3);
		Date date = DateUtil3.getDateByMonthLast(c.getTime());
		System.out.println(df.format(date));
	}

	@Test
	public void testGetDaysByFuture() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2019);
		c.set(Calendar.MONTH, 6);
		c.set(Calendar.DATE, 20);
		
		int i = DateUtil3.getDaysByFuture(c.getTime());
		System.out.println(i);
		
	}

	@Test
	public void testGetDaysByDeparted() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.MONTH, 6);
		c.set(Calendar.DATE, 17);
		
		int i = DateUtil3.getDaysByDeparted(c.getTime());
		System.out.println(i);
	}

}
