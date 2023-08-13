package studyTool;
import java.util.Scanner;
public class information2 {

	public static void main(String[] args) {
		Scanner neme = new Scanner (System.in);
		String fName,lName;
		System.out.print("Student Name: ");
		System.out.print("");
		fName = neme.nextLine();
		lName = neme.nextLine();

		Scanner styID = new Scanner (System.in);
		String ID;
		System.out.print("Student ID: ");
		ID = styID.nextLine();
		
		Scanner stuStatus = new Scanner (System.in);
		String Status;
		System.out.print("Student Status: ");
		Status = stuStatus.nextLine();
		
		System.out.println("Student Name :" + fName+" "+lName);
		System.out.println("Stydent ID : " + ID);
		System.out.println("Stydent Status : " + Status);
		
	}

}

