package com.vit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");
Student st=(Student)ap.getBean("student");
System.out.println(st);
Faculty fac=(Faculty)ap.getBean("faculty");
System.out.println(fac);
	}

}
