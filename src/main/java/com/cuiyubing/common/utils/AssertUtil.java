package com.cuiyubing.common.utils;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	/**
	 * 
	 * @Title: isTrue 
	 * @Description: 断言为真
	 * （就是表达结果或参数必须为真， 否则抛出自己的自定义 异常）；
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isTrue(boolean exp,String message){
		if(!exp) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isFalse 
	 * @Description: 断言为假
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isFalse(boolean exp,String message) {
		if(exp) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNotNull 
	 * @Description: 断言对象不为空
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNotNull(Object obj,String message) {
		if(obj==null) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNull 
	 * @Description: 断言为空
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNull(Object obj,String message) {
		if(obj!=null) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNotEmpty 
	 * @Description:断言 List 或 Set 集合不为空，没有元素也算空； 
	 * @param c
	 * @param message
	 * @return: void
	 */
	public static void isNotEmpty(Collection c,String message) {
		if(c==null||c.size()==0) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isNotEmpty 
	 * @Description: 断言 Map 集合不为空，没有元素也算空
	 * @param map
	 * @param message
	 * @return: void
	 */
	public static void isNotEmpty(Map<?,?> map,String message) {
		if(map==null||map.isEmpty()) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: hasText 
	 * @Description: 断言字符串必须有值，去掉空格后，长度必须大于 0；
	 * @return: void
	 */
	public static void hasText(String src,String message) {
		if(null==src || src.trim().length()==0) {
			throw new CMSRuntimeException(message);
		}
	}
	/**
	 * 
	 * @Title: isPostive 
	 * @Description:断言值必须是正数(值大于 0)
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isPostive(boolean exp,String message) {
		if(!exp) {
			throw new CMSRuntimeException(message);
		}
	}
	
	
}
