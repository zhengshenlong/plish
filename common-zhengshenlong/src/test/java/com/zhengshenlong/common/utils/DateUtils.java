package com.zhengshenlong.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * @ClassName: DateUtils 
 * @Description: TODO
 * @author:郑申龙
 * @date: 2019年9月20日 上午8:32:06  
 */
public class DateUtils {

	public static Date getDateByInitMonth(Date src) {

		// 设定一个时间
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			dateFormat.parse("2019-05-01 00:00:00");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return src;
	}

	public static Date getDateByFullMonth(Date src) throws ParseException {
		  
		   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  
               //开始判断如果月份等于2就指定月份开始计算
		         if(dateFormat.equals(2)){
		        	 dateFormat.parse("2019-02-28 23:59:59");
		         }else{
		        	 
		        	 dateFormat.parse("2019-05-31 23:59:59");
		        	 
		         }
		   
		return src;

	}

}
