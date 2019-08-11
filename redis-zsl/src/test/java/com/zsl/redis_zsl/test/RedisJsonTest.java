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
@ContextConfiguration(locations="classpath:spring-beans2.xml")
public class RedisJsonTest {
   
	/**
     *	如果我使用eclipse结合jvm做 第一步 我要检查我的防火墙是否关闭
	 *  如果没有关闭 就使用 service iptables stop来关闭防火墙
	 *  这样就可以正常是用了
	 */
	
	
	@Resource
	private RedisTemplate<String, Serializable> redisTemplate;
	
	@Test
	public void test_Json(){
        
		    List<User> user=new ArrayList<User>();
		    
		    for (int i = 0; i <10000; i++) { 
		    	 //generateChineseName获取名称
		    	//randomChineseString(2)设置名称的长度
		    	//randomString(9)随机获取9个数字
		    	//generateChineseName获取地址名称
			   User user2 = new User(i,StringUtil.generateChineseName()+StringUtil.randomChineseString(2),
			 	 "13"+RandomUitl.randomString(9),StringUtil.randomChineseString(10));
			   //使用user.add把对象放入到集合中
				user.add(user2);
			}
		     //使用 system.currentTimeMillis()来获取时间
		    long startTime = System.currentTimeMillis();
	   
		    for (User user2 : user) {
		    	//使用foreach增强循环来遍历输出
		    	//根据上面的集合来使用对应的方法 首先我要获取他的id然后在输出他
				 redisTemplate.opsForValue().set("u_"+user2.getId(),user2);
			}
		     //再次使用 system.currentTimeMillis()来获取时间
		    long endTime = System.currentTimeMillis();
	       
		   //用结束的时间减去开始的时间 剩下的时间就是电脑运行的时间  
		    System.out.println("采用json序列化存储的时间"+(endTime-startTime));
	    }
	
	@Test
	public void test_hash_Json(){
         
		Map<String,Serializable> user=new HashMap<>();
		    
		    for (int i = 0; i <10000; i++) {
				User user2 = new User(i,StringUtil.generateChineseName()+StringUtil.randomChineseString(2),
						 "13"+RandomUitl.randomString(9),StringUtil.randomChineseString(10));
				user.put("e_"+i,user2);
			}
		    long startTime = System.currentTimeMillis();
	    
		 
		  redisTemplate.opsForHash().putAll("user_json_keys",user);
		    
		    long endTime = System.currentTimeMillis();
	        
		    System.out.println("采用json序列化存储的时间"+(endTime-startTime));
	    }
	
	
}
