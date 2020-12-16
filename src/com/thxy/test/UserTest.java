package com.thxy.test;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thxy.service.UserService;

public class UserTest {

	@Test
	public void sayHello() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//����getBean("userService", UserService.class)�еġ�userService����applicationContext.xml��<bean id="userService" class="com.thxy.service.UserService"></bean>��idֵ��
		UserService userService = applicationContext.getBean("userService", UserService.class);
		userService.sayHello();

	}
}
