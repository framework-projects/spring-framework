package com.oxford.aop.serviceImpl;

import com.oxford.aop.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * AOP - 登录操作实现类
 *
 * @author Chova
 * @date 2020-11-10
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public int login(String user) {
		System.out.println(user + "登录成功");
		return 1;
	}
}
