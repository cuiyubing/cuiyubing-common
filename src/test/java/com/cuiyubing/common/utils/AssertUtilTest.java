package com.cuiyubing.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AssertUtilTest {

	@Test
	public void testIsTrue() {
		String pwd ="123";
		String repwd="321";
		AssertUtil.isTrue(pwd.equals(repwd), "两次密码不一致");
	}

	@Test
	public void testIsFalse() {
		AssertUtil.isFalse(0>1, "这是真的");
	}

	@Test
	public void testIsNotNull() {
		AssertUtil.isNotNull("hhh", "这个对象为空");
	}

	@Test
	public void testIsNull() {
		AssertUtil.isNull(null, "这个对象不为空");
	}

	@Test
	public void testIsNotEmptyCollectionString() {
		List list=new ArrayList();
		list.add(1);
		AssertUtil.isNotEmpty(list, "集合不能为空");
	}

	@Test
	public void testIsNotEmptyMapOfQQString() {
		Map map = new HashMap();
//		map.put("姓名", "冰冰");
		AssertUtil.isNotEmpty(map, "amp不能为空");
	}

	@Test
	public void testHasText() {
		AssertUtil.hasText("", "不符合");
	}

	@Test
	public void testIsPostive() {
		AssertUtil.isPostive(-1>0, "不是正数");
	}

	@Test
	public void testDouble() {
		double x=66.77;
		double y=100;
		System.out.println(x*y);
		System.out.println(66.24*100);
		
		BigDecimal b = new BigDecimal("66.23");
		BigDecimal b2 = new BigDecimal("100");
		
		System.out.println(b.multiply(b2));
		System.out.println(b.subtract(b2));
		System.out.println(b.add(b2));
		System.out.println(b.divide(b2));
		
	}
}
