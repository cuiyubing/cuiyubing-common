package com.cuiyubing.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.cuiyubing.common.entity.Person;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasText() {
		fail("Not yet implemented");
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(4);
		System.out.println(string);
	}

	@Test
	public void testRandomChineseStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateChineseName() {
		String string=StringUtil.generateChineseName();
		System.out.println(string);
	}

	@Test
	public void testDateUtil() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0,1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < 1000; i++) {
			Date date=DateUtil.randomDate(c.getTime());
			System.out.println(df.format(date));
		}
	}
	@Test
	public void testPerson() {
		Calendar c = Calendar.getInstance();
		c.set(2010,0,1);
		for (int i = 0; i < 10000; i++) {
			Person person=new Person(StringUtil.generateChineseName(),RandomUtil.random(1, 120),StringUtil.randomChineseString(140),DateUtil.randomDate(c.getTime()));
			System.out.println(person);
		}
		
	}
}
