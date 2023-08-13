package com.example.domain;
import java.util.Scanner;
public class Datatype {

	
	public static void main (String[]args){
	{	
	String name; // Point A
	boolean gameOver = true;
	int score = 50;
	int highScore = 20;
	//String reader;
	if (gameOver && score > highScore)
	{
	Scanner cname = new Scanner(System.in);
	System.out.println("Please enter your name : ");
	name = cname.next();
	
	System.out.println("Thank you" + name +",");
	System.out.println("Your high Score has bee saved.");
	}	
	
	}//end method
	
	
	}

	
		
	}

