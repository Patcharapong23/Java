package studyTool;//โฟลเดอร์ที่มีไฟล์เกี่ยวข้องไว้ด้วยกัน
import java.util.Scanner;//import มาใช้เพื่อรับข้อมูลผ่านทางคีบอร์ด
public class StudyPage { //เป็นclass สาธารณะ public class มีได้ class เดียวถ้าจะมีเพิ่มเติมต้องไม่ใส่ public

	public static void main(String[] args) { //เป็นเม็ดตอด(method) จะมีคำว่า void เสมอ คือการแสดงการพฤติกรรม
		Scanner scanterm = new Scanner	(System.in);//มีการรับค้าข้อมูลคีบอร์ดมา 2 อัน สิ่งที่เปลี่ยนได้คือชื่อของ Scanner 
		String termvar;
		System.out.println("Enter a study term");//แสดงผลผ่านทางหน้าจอ
		termvar	=	scanterm.nextLine();	//ผู้ใช้งานกรอกข้อมูลอะไรเข้ามาเป็นข้อความหรือตัวเลข scanterm.nextLine ใช้ได้เฉราะตัวอักษร
		
		Scanner scandef	= new Scanner(System.in);
		String termdef;
		System.out.println("Enter a definition");
		termdef = scandef.nextLine();
		System.out.println(termvar + ":" + termdef);
		
	
				}

} //end Study Page
