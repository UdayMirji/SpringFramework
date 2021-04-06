package com.xworkz.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.roket.Rocket;

public class RocketTester {

	public static void main(String[] args) {
		String xmlfile="rocketxml.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(xmlfile);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Rocket bean = context.getBean(Rocket.class);
		System.out.println(bean);
		

	}

}
