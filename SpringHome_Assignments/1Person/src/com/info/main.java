package com.info;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			ApplicationContext fac=new ClassPathXmlApplicationContext("bean.xml");
			
			Person per=(Person) fac.getBean("person");
			per.setIncome(10000);
			System.out.println(per);
			
	}

}
