package com.lydia;
import java.util.Scanner;

public class separate {
	
	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println(" Enter a six digit non negative Integer number");
		
		
			int number = input.nextInt();
			
			int n1 = (number /100000 % 10);
			int n2 = (number / 10000 % 10);
			int n3 = (number / 1000 % 10);
			int n4 = (number / 100 % 10);
			int n5 = (number / 10 % 10);
			int n6 = (number % 10);
			System.out.println( " "+ n1+ "\n " + n2 +" \n " + n3 + " \n " + n4+ " \n " + n5 +" \n " + n6);
		
		}
	}

}
