package com.thxy.test;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thxy.service.UserService;

public class UserTest {

	@Test
	public void sayHello() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//这里getBean("userService", UserService.class)中的“userService”是applicationContext.xml中<bean id="userService" class="com.thxy.service.UserService"></bean>的id值。
		UserService userService = applicationContext.getBean("userService", UserService.class);
		userService.sayHello();

	}
}
