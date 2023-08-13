package com.example.domain;
import java.util.Scanner;
public class LeapYearCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the month : ");
		int month = in.nextInt();
		System.out.print("Enter the year: ");
		int year = in.nextInt();
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11: System.out.print("That month has 30 days");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 12: System.out.println("That month has 31 days");
			break;
			
		case 2: if((year % 4 == 0 && year % 100 !=0) ||
				year % 400 == 0)	
			System.out.print("That month has 29 days");
		else
			System.out.print("That month has 28 days");
		break;
	default:System.out.print("Invalid Input");
		
		
		}
	}

}
