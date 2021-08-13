package com.eitan.lookup;

import com.eitan.lookup.entity.FruitPlate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("lookup-method.xml");
		FruitPlate fruitPlate = ac.getBean(FruitPlate.class);
		fruitPlate.getFruit();
	}
}
