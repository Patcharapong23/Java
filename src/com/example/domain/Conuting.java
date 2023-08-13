package com.example.domain;



public class Conuting {
	public static int counter=2;
	public static void main(String[] args){
	System.out.println("At the start of this program, counter is "+ counter);//1
	count();
	System.out.println("At the end of this program, counter is "+ counter);//3
	}//end method main
	public static void count(){
	int counter=10;
	System.out.println("At the end of this method, counter is "+ counter);//2
	}//end method count

}
