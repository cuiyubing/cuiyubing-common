package com.cuiyubing.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtil2Test {

	@Test//测试月初
	public void testGetDateByInitMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil2.getDateByInitMonth(new Date());
		System.out.println(df.format(date));
	}

	@Test//测试月末
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, 1);
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=DateUtil2.getDateByFullMonth(c.getTime());
		System.out.println(df.format(date));
	}

}