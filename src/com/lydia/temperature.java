package com.lydia;
import java.util.Scanner;
public class temperature {

    public static void main(String[] Strings) {

    	try {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        
        System.out.println("==================================");
        
        Scanner input1 = new Scanner(System.in);
        System.out.println("Input a degree in Celsius:");
        
        double celsius1 = input1.nextDouble();
        
        
        double fahrenheit1 = ((9* celsius1 + (32*5))/5);
        
        System.out.println(celsius1 + " degree Celsius is equal to " + fahrenheit1 + " in fahrenheit");
  
    
    	}catch(Exception e) {
    		e.printStackTrace();
    		
    	}
    }
    
    

}
