package com.xworkz.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.wardencomponent.PGComponent;
import com.xworkz.spring.component.wardencomponent.WardenComponent;

public class PGTester {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("camera-spring.xml");
		// container.getBean(WardenComponent.class);

		container.getBean(PGComponent.class);

	}

}
