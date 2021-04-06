package com.xworkz.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.waschingmachine.WashingMachine;

public class TesterWashingMaching {

	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("washing-machine.xml");
		WashingMachine bean = container.getBean(WashingMachine.class);
		bean.wash();

	}

}
