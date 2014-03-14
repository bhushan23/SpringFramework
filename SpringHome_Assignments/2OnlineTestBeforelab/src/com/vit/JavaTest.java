package com.vit;

import java.util.Random;
import java.util.Scanner;

public class JavaTest implements Test{

	@Override
	public void starttest() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("JAVA TEST STARTED");
		int qs=0;
		int score=0;
		Random r=new Random();
		while(qs++ < 5){
			int a=r.nextInt(10);
			int b=r.nextInt(20);
			int c=r.nextInt(6);
			if(c==0)
				c=1;
			int rans=a+b/c;
			System.out.println("("+qs+")"+"what is the ans: a+b/c  where a=" + a+"  b="+b+"  c="+c);
			int ans=sc.nextInt();
			if(ans==rans){
				score++;
			}
		}
		System.out.println("\n\n::::Your Score is "+score+" ::::");
	}

	public JavaTest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
