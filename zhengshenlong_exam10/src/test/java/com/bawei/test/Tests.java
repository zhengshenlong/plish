package com.bawei.test;

import java.util.Date;

import org.junit.Test;

import com.bawei.util.DataUtil;

public class Tests {
  
	 @Test
	 public void fun1(){
		Date src = new  Date();
		src.getHours();
		DataUtil.getAge(src);
	 }
	 
	 @Test
	 public void fun2(){
		 Date date = new Date ();
		 date.getMonth();
		DataUtil.getDateByMonthInit(date);
	 }
	 
	 @Test
	 public void fun3(){
		 Date src = new Date();
		 src.getMonth();
		 DataUtil.getDateByMonthLast(src);
	 }
	 
	 @Test
	 public void  fun4(){
		Date date = new Date();
		date.getDay();
		DataUtil.getDaysByFuture(date);
	 }
	 
	 @Test
	 public void fun5(){
		 Date date = new Date ();
		 date.getDate();
		DataUtil.getDaysByDeparted(date);
	 }
}
