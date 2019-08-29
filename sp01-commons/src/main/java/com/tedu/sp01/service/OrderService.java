package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * @Description 根据订单编号获取订单
	 * @param orderId 订单id
	 * @return 获取的订单信息
	 */
	Order getOrder(String orderId);
	
	/**
	 * @Description 保存订单
	 * @param order 要保存的订单对象
	 */
	void addOrder(Order order);
}
