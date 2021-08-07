package com.eitan.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class MyApplicationContext {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.eitan.condition");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
}
