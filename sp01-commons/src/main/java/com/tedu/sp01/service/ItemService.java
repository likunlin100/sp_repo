package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * @Description 根据订单id获取商品列表
	 * @param orderId 订单ID
	 * @return 返回商品列表的list集合
	 */
	List<Item> getItems(String orderId);
	
	/**
	 * @Description 在保存订单时减少库存
	 * @param list 接收订单中的商品列表
	 */
	void decreaseNumbers(List<Item> list);
}