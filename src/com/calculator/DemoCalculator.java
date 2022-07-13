package com.calculator;

public class DemoCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DemoCalculator :: 1st line");
		
		Calculator obj= new Calculator();
		int addTotal=obj.add(10, 10);
		System.out.println("DemoCalculator ::Add method ="+addTotal);
		
		
		int sub=obj.sub(10, 10);
		System.out.println("DemoCalculator ::sub  ="+sub);
		
		
		int mul=obj.mul(10, 10);
		System.out.println("DemoCalculator ::mul  ="+mul);
		
		
		int div=obj.div(10, 10);
		System.out.println("DemoCalculator ::div  ="+div);
		
		
		
		System.out.println("==========DOUBLE================");
		double addTotal1=obj.add(10.22, 10.22);
		System.out.println("DemoCalculator ::Add method ="+addTotal1);
		
		
		double sub1=obj.sub(10.33, 10.33);
		System.out.println("DemoCalculator ::sub  ="+sub1);
		
		
		double mul1=obj.mul(10.98, 10.08);
		System.out.println("DemoCalculator ::mul  ="+mul1);
		
		
		double div1=obj.div(10.9f, 10.6666);
		System.out.println("DemoCalculator ::div  ="+div1);
		
		
		
		
		System.out.println("==========FLOAT================");
		float addTotal2=obj.add(10.22f, 10.22f);
		System.out.println("DemoCalculator ::Add method ="+addTotal2);
		
		
		float sub3=obj.sub(10.33f, 10.33f);
		System.out.println("DemoCalculator ::sub  ="+sub3);
		
		
		float mul3=obj.mul(10.98f, 10.08f);
		System.out.println("DemoCalculator ::mul  ="+mul3);
		
		
		float div3=obj.div(10.9f, 10.6666f);
		System.out.println("DemoCalculator ::div  ="+div3);
		
		
		
		
	}

}
