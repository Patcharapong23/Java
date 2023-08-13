package studyTool;
import java.util.Scanner;
public class information {

	public static void main(String[] args) {
		Scanner scnemef = new Scanner (System.in);
		String fName;
		System.out.print("Student FName: ");
		fName = scnemef.nextLine();
	
		Scanner sceNameL = new Scanner (System.in);
		String lName;
		System.out.print("Student lName: ");
		lName = sceNameL.nextLine();
		
		Scanner styID = new Scanner (System.in);
		String ID;
		System.out.print("Student ID: ");
		ID = styID.nextLine();
		
		Scanner stuStatus = new Scanner (System.in);
		String Status;
		System.out.print("Student Status: ");
		Status = stuStatus.nextLine();
		
		System.out.println("Student Name :" + fName + " " + lName);
		System.out.println("Stydent ID : " + ID);
		System.out.println("Stydent Status : " + Status);
		
	}

}

