package com.zhengshenlong.goods.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhengshenlong.goods.dao.GoodsMapper;
import com.zhengshenlong.goods.entity.Goods;
 
/** 
 * @ClassName: GoodsServiceImpl 
 * @Description: TODO
 * @author:郑申龙
 * @date: 2019年9月6日 上午10:06:32  
 */
@Service(interfaceClass=GoodsService.class)
@Transactional
public class GoodsServiceImpl  implements GoodsService{
	
	@Autowired
	GoodsMapper goodsMapper;
	
	public int create(Goods goods) {
		
		int result = goodsMapper.create(goods);
		result += goodsMapper.createGoodsShop(goods.getId(), goods.getShopIdArr());
		return result;
	}
	
	public int deleteById(Integer id) {
		
		return goodsMapper.deleteById(id) + goodsMapper.deleteGoodsShop(id);
		
		
	}
	public int deleteBatch(Integer[] ids) {
		return goodsMapper.deleteBatch(ids)+ goodsMapper.deleteBatchGoodsShop(ids);
		
	}
	
	public int update(Goods goods) {
		 
		int result = goodsMapper.update(goods);
		result+=goodsMapper.deleteGoodsShop(goods.getId());
		result += goodsMapper.createGoodsShop(goods.getId(), goods.getShopIdArr());
		 return result;
	}
	
	public Goods findById(Integer id) {
		
		return  goodsMapper.findById(id);
		
	}
	
	public  PageInfo<Goods> list(int pageNum,int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Goods>(goodsMapper.list());
		
	}

}
