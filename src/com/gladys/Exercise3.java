package com.gladys;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        System.out.println("first digit----> " + firstDigit );
        
        int remainingNumber = num / 10;
        System.out.println("remainingNumber----> " + remainingNumber );
        
        int SecondDigit = remainingNumber % 10;
        System.out.println("SecondDigit----> " + SecondDigit );

        remainingNumber = remainingNumber / 10;
        System.out.println("remainingNumber----> " + remainingNumber );
        int thirdDigit = remainingNumber % 10;
        System.out.println("thirdDigit----> " + thirdDigit );
        remainingNumber = remainingNumber / 10;
        System.out.println("remainingNumber----> " + remainingNumber );
        int fourthDigit = remainingNumber % 10;
        System.out.println("fourthDigit----> " + fourthDigit );
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

	}

}
