package com.gladys;

import java.util.Scanner;
public class Exercise10{

    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        System.out.println("input>>>>>> " +input);
        System.out.println("100000%10>>>>>> " +100000%10);
        System.out.println("n1>>>>>> " +n1);
        int n2 = input / 10000 % 10;
        System.out.println("n2>>>>>> " +n2);
        int n3 = input / 1000 % 10;
        System.out.println("n3>>>>>> " +n3);
        int n4 = input / 100 % 10;
        System.out.println("n4>>>>>> " +n4);
        int n5 = input / 10 % 10;
        System.out.println("n5>>>>>> " +n5);
        int n6 = input % 10;

      }
}
