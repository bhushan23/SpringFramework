package com.DocDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainfun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
			Doctor doc=(Doctor)ap.getBean("doc");
			System.out.println(doc);
	}

}
