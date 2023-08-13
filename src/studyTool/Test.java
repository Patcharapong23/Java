package studyTool;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numgallons = 0;
		Scanner scannumgallons = new Scanner(System.in);
		System.out.print("Enter Number Gallons : ");
		numgallons = scannumgallons.nextInt();
		
		Double converttoliters = numgallons*3.785;
		System.out.println("Result convert gallons to liters ? : "+converttoliters+"");		
	
		
		
		
		
	}

}
