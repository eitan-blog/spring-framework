package com.eitan.supplier;

import com.eitan.supplier.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("supplier.xml");
		User user = ac.getBean(User.class);
		System.out.println(user);
	}
}
