package com.zhengshenlong.goods;

import java.io.IOException;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageInfo;
import com.zhengshenlong.goods.entity.AddressEnum;
import com.zhengshenlong.goods.entity.CategoryEnum;
import com.zhengshenlong.goods.entity.Goods;
import com.zhengshenlong.goods.service.GoodsService;
 
/** 
 * @ClassName: BootStart 
 * @Description: TODO
 * @author:郑申龙
 * @date: 2019年9月6日 上午10:03:55  
 */
public class BootStart {
	public static void main(String[] args) throws IOException {
		System.out.println("开始");
		//org.apache.ibatis.type.JdbcType.INTEGER
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		/*GoodsService gs = context.getBean(GoodsService.class);
		PageInfo<Goods> pageInfo = gs.list(1, 3);
		System.out.println("pageinfo is " + pageInfo);
		
		Goods goods = new Goods();
		goods.setAddress(AddressEnum.国外);
		goods.setCategory(CategoryEnum.家用);
		goods.setName("skii");
		goods.setCreateDate(new Date(102,3,23));
		gs.create(goods);
		*/
		
		System.in.read();
		
		
		
	}

}
