package com.bawei.util;

import java.util.Date;

public class DataUtil {
   
	//方法1：根据传入的日期获取年龄
	//示例:
	public static int getAge (Date src) {
		 Date date = new  Date();
		 int year = date.getYear();
		return year;
	//TODO
	}

	//方法2：根据传入的参数获取该日期的月初日期，
	//例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	//示例:
	public static Date getDateByMonthInit (Date src) {
            Date date = new Date();
            long time = date.getTime();
            System.out.println(time);
		return src;
	//TODO
	}
	
	//方法3 :根据传入的参数获取该日器的月末日期，
	//例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	//示例:
	public static Date getDateByMonthLast(Date src) {
		Date date = new Date();
		int month = date.getMonth();
		System.out.println(month);
		return src;
	//TODO
	}	
	
	
	//方法4：求未来日期离今天还剩的天数
	//示例:
	public static int getDaysByFuture (Date future) {
		Date date = new Date();
		int day = date.getDay();
		int date2 = date.getDate();
	      int s=date2-day;
	      return s;
	//TODO
	}

 
	//方法5：求过去日期离今天过去的天数
	//示例:
	public static int getDaysByDeparted (Date departed) {
		Date date = new Date();
		long time = date.getTime();
		int day = date.getDay();
		int  s=(int) (time-day);
		return s;
	//TODO
	}


}
