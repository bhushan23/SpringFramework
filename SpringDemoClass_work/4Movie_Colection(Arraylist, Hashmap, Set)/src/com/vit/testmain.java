package com.vit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app=new ClassPathXmlApplicationContext("bean.xml");
		Movie m=(Movie) app.getBean("movie");
		System.out.println(m.getName()+"  "+m.getLeadactor() +"   "+m.getLeadactress()+"   "+m.getSongs());
	System.out.println(m.info);
	}

}
