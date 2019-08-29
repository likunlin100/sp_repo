 package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	/**
	 * @Description 根据用户id获取用户信息
	 * @param id 用户id
	 * @return 用户信息对象
	 */
	User getUser(Integer id);
	/**
	 * @Description 增加用户积分
	 * @param id 用户id
	 * @param score 加多少积分
	 */
	void addScore(Integer id, Integer score);
}
