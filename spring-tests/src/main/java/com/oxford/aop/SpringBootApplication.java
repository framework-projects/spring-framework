package com.oxford.aop;

import com.oxford.aop.service.LoginService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 主类
 *
 * @author Chova
 * @date 2020-11-10
 */
@ComponentScan("com.oxford.aop.*")
@EnableAspectJAutoProxy
public class SpringBootApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringBootApplication.class);
		LoginService loginService = annotationConfigApplicationContext.getBean(LoginService.class);
		loginService.login("用户");
	}
}
