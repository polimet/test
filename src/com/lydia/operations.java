package com.lydia;
import java.util.Scanner;
public class operations {

    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
			System.out.print("Input 1st integer: ");
			int firstInt = input.nextInt();
			System.out.print("Input 2nd integer: ");
			int secondInt = input.nextInt();

			System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
			System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
			System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
			System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
			System.out.printf("Distance of two integers: %d%n", Math.abs(firstInt - secondInt));
			System.out.printf("Max integer: %d%n", Math.max(firstInt, secondInt));
			System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
		}
    }
}

