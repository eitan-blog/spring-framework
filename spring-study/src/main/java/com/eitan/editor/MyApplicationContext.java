package com.eitan.editor;

import com.eitan.editor.entity.Customer;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("selfEditor.xml");
		String[] beanNamesForType = ac.getBeanNamesForType(CustomEditorConfigurer.class);
		for (String s : beanNamesForType) {
			System.out.println(s);
		}
		Customer customer = ac.getBean(Customer.class);
		System.out.println(customer);
	}
}
