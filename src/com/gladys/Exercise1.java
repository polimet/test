package com.gladys;

import java.util.Scanner;

public class Exercise1 {

	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.print("Input a degree in Fahrenheit: ");
			double fahrenheit = input.nextDouble();

			double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
			System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

			System.out.println(" *****************************************");
			System.out.print("Input a degree in Celsius: ");
			float celsius1 = input.nextFloat();
			  float f = celsius1 * (9.0f/5.0f) + 32;

			//double  fahrenheit1 =(( celsius1 *(9/5)) / 32);
			System.out.println(celsius1 + " degree  Celsius is equal to " + f + " in Fahrenheit");
		}

	}

}