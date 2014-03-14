package com.spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Testclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Resource res= new FileSystemResource(".\\src\\Beans.xml");
			BeanFactory fac=new XmlBeanFactory(res);
			Emplyee e=(Emplyee)fac.getBean("emp");
			System.out.println(e);
		
			Customer c=(Customer)fac.getBean("cust");
			System.out.println(c);
	}

}
