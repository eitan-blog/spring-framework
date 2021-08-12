package com.eitan.factorybean;

import com.eitan.factorybean.entity.User;
import com.eitan.factorybean.factorybean.UserFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factorybean.xml");
		UserFactoryBean userFactoryBean = (UserFactoryBean) context.getBean("&userFactoryBean");
		System.out.println(userFactoryBean);
		User user = (User) context.getBean("userFactoryBean");
		System.out.println(user);
	}
}
