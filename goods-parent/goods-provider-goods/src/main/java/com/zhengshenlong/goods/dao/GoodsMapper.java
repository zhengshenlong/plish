package com.zhengshenlong.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhengshenlong.goods.entity.Goods;

@Mapper
public interface GoodsMapper {
	
	int create(Goods goods);
	 
	int createGoodsShop(@Param("goodsId") Integer goodsId,@Param("shopIds") Integer[] shopIds);
	
	@Delete("delete from tb_goods where id=#{value}")
	int deleteById(Integer id);
	
	@Delete("delete from tb_goods_shop where goodsId=#{value}")
	int deleteGoodsShop(Integer id);
	
 
	int deleteBatch(Integer[] ids);
	
	 
	int deleteBatchGoodsShop(Integer[] ids);
	
	int update(Goods goods);
	
	
	Goods findById(Integer id);
	
	List<Goods> list();

	
}
