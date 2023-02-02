package com.ifelse;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your height in feet");
		
		float height = sc.nextFloat();
		
		System.out.println("Enter your weight in kg");
		
		float weight = sc.nextFloat();
		
		height= height*0.3048f; // here we are converting height into meter
		
		float bmi = weight/(height*height);
		
		System.out.println("Your Bmi is:"+bmi);

	}

}
