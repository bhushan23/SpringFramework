package com.vit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("beans.xml");
		Account ac=(Account)ap.getBean("acnt");
		//System.out.println(ac);
		System.out.println("Account details");
		System.out.println("Account Number: "+ac.getAccno()+"         TYPE:"+ac.getType());
		System.out.println("BAL: "+ac.getBal());
		System.out.println("This account is shared by "+ac.customer.size()+" people");
		for(int i=0;i<ac.customer.size();i++){
			System.out.println("NAME: "+ac.customer.get(i).getName()+  "   SSN: "+ac.customer.get(i).getSsn());
		}
	}

}
