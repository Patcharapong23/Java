package com.example.domain;
import java.util.Scanner;
public class Student {

	//public static void main(String[] args) 
		// TODO Auto-generated method stub
		private int studentId;
		private String name;
		private String ssn;
		private double gpa;
		public final int SCHCODE = 34958;
		public Student()
		{		
	}
		public Student (int x, String n, String s, double g) {
			// TODO Auto-generated constructor stub
			studentId = x;
			name = n;
			ssn = s;
			gpa = g;
		}
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int x) {
			studentId = x;
		}
		public String getName() {
			return name;
		}
		public void setName(String n) { //n = name 
			name = n;
		}
		public String getSSN() {
			return ssn;
		}
		public void setSSN(String s) { //s = ssn
			ssn = s;
		}
		public double getGPA() {
				return gpa;
			}
		public void setGPA (double g) { //g = gpa
				gpa = g;
			
			}
		
		public String toString() {
		String s1 = "";
		s1 = " รหัสนักศึกษา : "+getStudentId()
		+ " ชื่อนักศึกษา : "+getName()
		+ " รหัสบัตรประชาชน : "+getSSN()
		+ " เกรดเฉลี่ยสะสม : "+getGPA();
		return s1;
		
		//System.out.print(name);
		
		     }
		}//end class Student
		
		
		

