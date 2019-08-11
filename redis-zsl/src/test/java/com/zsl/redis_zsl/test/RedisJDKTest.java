package com.zsl.redis_zsl.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zsl.redis_zsl.bean.User;
import com.zsl.redis_zsl.utils.RandomUitl;
import com.zsl.redis_zsl.utils.StringUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-beans.xml")
public class RedisJDKTest {

	 @Resource
	 private RedisTemplate<String,Serializable> redisTemplate;
	 
	 @Test
	 public void test_randome(){
		 
			 List<User> user=new ArrayList<User>();
			  //循环输出十万条数据
			 for (int i = 0; i <100000; i++) {
		          User u=new User(i,StringUtil.generateChineseName()+StringUtil.randomChineseString(2),"13"+RandomUitl.randomString(9),StringUtil.randomChineseString(10));
			   user.add(u);
			 }
         long   stratTimeMillis = System.currentTimeMillis();
         for (User user2 : user) {
			redisTemplate.opsForValue().set("u_"+user2.getId(), user2);
		}
         long entTimeMillis = System.currentTimeMillis();
         
         System.out.println("采用jdk序列化存储的时间"+(entTimeMillis-stratTimeMillis));
	 }
	 
	 
	 @Test
	 public void test_hash_jdk(){
		 
		 Map<String,Serializable> user=new HashMap<String, Serializable>();
			  //循环输出十万条数据
			 for (int i = 0; i <100000; i++) {
		          User u=new User(i,StringUtil.generateChineseName()+StringUtil.randomChineseString(2),"13"+RandomUitl.randomString(9),StringUtil.randomChineseString(10));
			   user.put("u_"+i,u);
			 }
         long   stratTimeMillis = System.currentTimeMillis();
 
		 redisTemplate.opsForHash().putAll("user_json_jdk",user);
 
         long entTimeMillis = System.currentTimeMillis();
         
         System.out.println("采用jdk序列化存储的时间"+(entTimeMillis-stratTimeMillis));
	 }
	 
}
