package com.ifelse;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are eligibale to vote");
		 
		}
		else
		{
			System.out.println("You are not eligibale to vote");
		}
		

	}

}
