package com.vit;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app= new ClassPathXmlApplicationContext("Beans.xml");
		Test jt;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Which Test You Want to Give? 0 JAVA 1 SPRING 2 EXIT");
			int in=sc.nextInt();
			if(in==2){
				System.out.println("IT WAS NICE TO HAVE CONVERSATION WITH YOU");
				break;
			}else if(in==0){
					jt=(JavaTest) app.getBean("java");
					jt.starttest();
			}
			else if(in==1){
				jt=(SpringTest) app.getBean("spring");
				jt.starttest();
				
			}
			else{
				System.out.println("INVALID INPUT PLEASE TYPE AGAIN");
			}
		}
	}

}
