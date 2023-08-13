package studyTool;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("พื้นที่ฐาน : ");
		Scanner Key = new Scanner (System.in);
		double base = Key.nextDouble();
		
		System.out.print("สูง : ");
		Scanner Key1 = new Scanner (System.in);
		double high = Key1.nextDouble();
		
		Double capacitance = (1*base*base*high)/3;
		System.out.println("ปริมาตรที่ได้ = "+capacitance+"cc");

		

		

	}

}
