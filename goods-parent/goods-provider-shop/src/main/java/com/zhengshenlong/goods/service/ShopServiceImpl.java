package com.zhengshenlong.goods.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhengshenlong.goods.dao.ShopMapper;
import com.zhengshenlong.goods.entity.Shop;

@Service(interfaceClass=ShopService.class)
public class ShopServiceImpl  implements ShopService{
	
	@Autowired
	ShopMapper shopMapper;
	
	public List<Shop> getShopList(){
		return shopMapper.getAllShops();
	}
}
