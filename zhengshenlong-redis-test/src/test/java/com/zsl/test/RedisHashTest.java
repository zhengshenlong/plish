package com.zsl.test;

import java.io.Serializable;

import java.util.HashMap;
 
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zsl.bean.User;
import com.zsl.utils.RandomUitl;
import com.zsl.utils.StringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class RedisHashTest {

	  @Resource
	  private RedisTemplate<String,Serializable> redisTemplate;
	  
	  @Test
	  public void redis_test_hash(){
	 
		  //使用循环输出十万条数据
	     Map<String,Serializable> user=new HashMap<String, Serializable>();
	     for (int i = 0; i <100000; i++) {
			User user2 = new User(i,StringUtil.generateChineseName()+StringUtil.randomChineseString(2),"13"+RandomUitl.randomString(9)
			,StringUtil.randomChineseString(13),StringUtil.randomChineseString(1), StringUtil.randomChineseString(18));
			 //往集合里面添加数据
			  user.put("h_"+i,user2);
	      }
	     //定义开始的时间
	     long startTime = System.currentTimeMillis();
	     
	     redisTemplate.opsForHash().putAll("redis_test_hash",user);
	   //定义运行结束的时间
	     long endTime = System.currentTimeMillis();
	     //使用结束的时间减去开始的时间剩下的就是运行十万条数据的时间
	     System.out.println("输出十万条Hash数据"+(endTime-startTime));
	  }
}
