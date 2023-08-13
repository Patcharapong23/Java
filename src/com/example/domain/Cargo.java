package com.example.domain;
import java.util.Scanner;
public class Cargo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner item = new Scanner (System.in);
		int n;
		System.out.print("จำนวนสินค้า : ");
		n = item.nextInt();
		
		
		if(n>=5) //ซื้อมากกว่าหรือเท่ากับ 5 ราคาชิ้นละ 2 บาท
		System.out.print("ราคา : "+n*2+" บาท"); 
		else//ซื้อน้อยกว่า 5 ราคาชิ้นละ 5 บาท
			System.out.print("ราคา : "+n*5+" บาท");

	}

}
