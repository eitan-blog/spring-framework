package com.eitan.condition;

import com.eitan.tag.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MyApplicationContext {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.eitan.condition");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
