package com.ifelse;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks for first subject");
		float sub1 = sc.nextFloat();
		
		System.out.println("Enter marks for second subject");
		float sub2 = sc.nextFloat();
		
		System.out.println("Enter marks for third subject");
		float sub3 = sc.nextFloat();
		
		System.out.println("Enter marks for fourth subject");
		float sub4 = sc.nextFloat();
		
		System.out.println("Enter marks for fifth subject");
		float sub5 = sc.nextFloat();
		
		System.out.println("Enter marks for sixth subject");
		float sub6 = sc.nextFloat();
		
		
		float per = (sub1+sub2+sub3+sub4+sub5+sub6)/6;
		
		System.out.println("Your percentage is :"+per+"%");
		
		if(per>=85)
		{
			System.out.println("Studet grade is a+");
		}
		   else if(per>=70) 
		   {
			   System.out.println("Student grade is b+");
		   }
		       else if(per>=60)
		       {
		    	   System.out.println("Student grade is c+");
		       }
		       else
		       {
		    	   System.out.println("You need to work hard");
		       }

	}

}
