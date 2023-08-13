package com.example.domain;
import java.lang.Math;
public class testMathdd {

	public static void main(String[] args) {
		double x = 3.25;
		double y = -4.5;
		int m = 23;
		int n = 9;
		System.out.println(x+m*y-(y+n)*x);
		System.out.println(m / n + m% n);
		System.out.println(5*x-n/5);
		System.out.println(Math.sqrt(Math.sqrt(n)));
		System.out.println((int)x);
		System.out.println(Math.round(y));
		/*double x = 3.25; //มันซ้ำกับตัวแปรด้านบน
		double y = -4.5; //ซ้ำกับตัวแปรด้านบน
		int m = 23;//ซ้ำกับตัวแปรด้านบน
		int n = 9; //ซ้ำ
		กับตัวแปรด้านบน
		*/
		System.out.println((int)Math.round(x)+(int)Math.round(y));
		System.out.println(m+n);
		System.out.println(1-1-((1-(1-(1-n)))));
		
		
		
		
	}

}
