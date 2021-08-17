package com.eitan.beforeinstantiation;

import com.eitan.beforeinstantiation.entity.BeforeInstantiation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beforeInstantiation.xml");
		BeforeInstantiation bean = ac.getBean(BeforeInstantiation.class);
		bean.doSomeThing();
	}
}
