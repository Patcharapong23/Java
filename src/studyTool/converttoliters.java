package studyTool;
import java.util.Scanner;
public class converttoliters {

	public static void main(String[] args) {
		Scanner scagallons= new Scanner (System.in);
		double gallons;
		double liters;
		gallons=10;
		liters=gallons*3.7854;
		System.out.print("gallons ");
		
	System.out.println("Result convert gallons to liters : " + gallons);
		System.out.println(gallons +"gallons is"+ liters+ "gallons.");
	}

}
