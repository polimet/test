package com.gladys;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        System.out.print("Input a value for inch: ");
	        double inch = input.nextDouble();
	        double meters = inch * 0.0254;
	        System.out.println(inch + " inch is " + meters + " meters");
	        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	        
	        System.out.print("Input a value for meters: ");
	        
	        double m1=input.nextDouble();
	        double in1 =m1 * 39.370;
	        System.out.println(m1 + " meter is " + in1 + " inches");
	        
	}

}
