package com.oxford.aop.service;

/**
 * AOP - 执行登录操作
 *
 * @author Chova
 * @date 2020-11-10
 */
public interface LoginService {

	/**
	 * 登录操作
	 *
	 * @param user 登录人员
	 * @return int 是否登录成功
	 */
	int login(String user);
}
