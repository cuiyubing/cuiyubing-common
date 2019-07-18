package com.cuiyubing.common.utils;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;


public class StreamUtil2Test {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testCopy() throws IOException {
		InputStream src = new FileInputStream("f:/1.txt");
		OutputStream out = new FileOutputStream("f:/2.txt");
		StreamUtil2.copy(src, out, true, true);
	}

	@Test
	public void testReadTextFileInputStream() throws IOException {
		InputStream src = new FileInputStream("f:/1.txt");
		System.out.println(StreamUtil2.readTextFile(src));
	}

	@Test
	public void testReadTextFileFile() throws IOException {
		InputStream src = new FileInputStream("f:/1.txt");
		System.out.println(StreamUtil2.readTextFile(src));
	}

	@Test
	public void testReadStringFromSystemIn() throws IOException {
		String str = StreamUtil2.readStringFromSystemIn("请输入姓名");
		System.out.println(str);
	}

	@Test
	public void testReadIntFromSystemIn() throws IOException {
		int i = StreamUtil2.readIntFromSystemIn("请输入年龄");
		System.out.println("输入的年龄"+i);
	}

}