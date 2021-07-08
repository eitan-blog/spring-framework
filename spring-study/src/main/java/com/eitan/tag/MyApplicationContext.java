package com.eitan.tag;

import com.eitan.tag.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
		User user = ac.getBean(User.class);
		System.out.println(user);
	}
}
