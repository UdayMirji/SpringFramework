package com.xworkz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.component.CameraComponent;

public class SpringCapture {

	public static void main(String[] args) {
		String xmlFileName="camera-spring.xml";
		ApplicationContext spring=new ClassPathXmlApplicationContext(xmlFileName);
		CameraComponent cameraComponent = spring.getBean(CameraComponent.class);
		cameraComponent.capture("wild animal");

	}

}
