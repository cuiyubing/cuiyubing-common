package com.cuiyubing.common.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 封装一个工具类StreamUtil
 * @author:cyb 
 * @date: 2019年7月16日 上午8:43:13
 */
public class StreamUtil2 {

	/**
	 * 
	 * @Title: closeAll 
	 * @Description: 批量关闭流，参数能传无限个,例如传入FileInputStream对象、
	 * JDBC中Connection对象都可以关闭
	 * @param closeables
	 * @return: void
	 */
	public static void closeAll(Closeable... closeables) {
			if(null!=closeables) {
				for (Closeable closeable : closeables) {
					try {
						closeable.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	/**
	 * 
	 * @Title: copy 
	 * @Description: 拷贝流，将InputStream流拷到OutputStream，可以用于快速读与文件、上传下载，
	 * 为了提高性能，需要使用缓冲
	 * @param src 输入流
	 * @param out 输出流
	 * @param isCloseInputStream 处理完成后是否关闭输入流
	 * @param isCloseOutputStream 处理完成后是否关闭输出流
	 * @throws IOException
	 * @return: void
	 */
	public static void copy(InputStream src, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
			BufferedInputStream stream = new BufferedInputStream(src);
			
			BufferedOutputStream outputStream = new BufferedOutputStream(out);
			byte[] b=new byte[1024];
			int i=0;
			while((i=stream.read())!=-1) {
				outputStream.write(b);
			}
			if(isCloseOutputStream) {
				out.close();
				outputStream.close();
				if(isCloseOutputStream) {
					src.close();
					stream.close();
				}
			}
			
		}
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 传入一个文本文件对象，默认为UTF-8编码，
	 * 返回该文件内容，
	 * 要求方法内部调用上面第2个方法拷贝流，结束后第1个方法关闭流
	 * @param src
	 * @return
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(InputStream src) throws IOException{
			ByteArrayOutputStream out =new ByteArrayOutputStream();
			copy(src, out, true, true);
			return out.toString("UTF-8");
			
		}
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第3个方法
	 * @param txtFile
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
			
		return readTextFile(new FileInputStream(txtFile));
		}
	/**
	 * 
	 * @Title: readStringFromSystemIn 
	 * @Description: 从控制台读取用户输入的字符串
	 * @param message用于控制台提示。例如“请输出您的姓名：”，
	 * 然后用户输入姓名后回车，
	 * * 方法开始执行并读取姓名。
	 * @return
	 * @return: String
	 * @throws IOException 
	 */
	public static String readStringFromSystemIn(String message) throws IOException{
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		return str;
		}
	/**
	 * 
	 * @Title: readIntFromSystemIn 
	 * @Description: 从控制台读取用户输入的数字。 
	 * @param message用于控制台提示。例如“请输出您的年龄：”
	 * ，然后用户输入年龄后回车，* 方法开始执行并读取年龄，如何用户输出的不是数字，
	 * 或是空值（直接回车），则继续提示输入。
	 * @return
	 * @return: int
	 * @throws IOException 
	 */
	public static int readIntFromSystemIn(String message) throws IOException{
		System.out.println(message);
		Scanner sc = new Scanner(System.in);
		//判断输入的事否是数字
		boolean b=sc.hasNextInt();
		if(!b) {
			return readIntFromSystemIn(message);
		}
		int i=sc.nextInt();
		return i;
		}
}
