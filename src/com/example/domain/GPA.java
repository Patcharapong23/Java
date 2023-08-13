package com.example.domain;
import java.util.Scanner;
public class GPA {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double gpa;
		System.out.print("กรอกคะแนนที่ได้ : ");
		gpa = in.nextDouble();
		
		if(gpa>=80)
		System.out.print("ได้เกรด A ");
		else if (gpa>=70)
		System.out.print("ได้เกรด B ");
		else if (gpa>=60)
		System.out.print("ได้เกรด C ");
		else if (gpa>=50)
		System.out.print("ได้เกรด D ");
		else
		System.out.print("ได้เกรด F ");
		
	}

}
