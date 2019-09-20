package com.zhengshenlong.common.utils;

/** 
 * @ClassName: FileUtils 
 * @Description: TODO
 * @author:郑申龙
 * @date: 2019年9月20日 上午8:32:02  
 */
public class FileUtils {

	public static String getExtendName(String fileName) {
		 //定义字符串
		  String a = new String("aaa.jsp");
		  
		  //开始截取字符
		  String b = a.substring(0,2);
		  
		  System.out.println(b);
		  
		  return fileName;
		  
	}

}
