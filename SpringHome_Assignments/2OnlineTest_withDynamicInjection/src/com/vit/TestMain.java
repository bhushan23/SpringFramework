package com.vit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app= new ClassPathXmlApplicationContext("Beans.xml");
		TestService ts=(TestService) app.getBean("test");
		ts.tg.starttest();
		
	}

}
