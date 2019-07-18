package com.cuiyubing.common.utils;
/**
 * 
 * @ClassName: CMSRuntimeException 
 * @Description: 自定义异常
 * @author:cyb 
 * @date: 2019年7月12日 下午7:52:14
 */
public class CMSRuntimeException extends RuntimeException {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	public CMSRuntimeException() {
		super();
	}
	public CMSRuntimeException(String message) {
		super(message);
	}
	
	
}
