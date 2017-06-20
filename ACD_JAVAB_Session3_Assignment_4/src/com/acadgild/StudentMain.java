package com.acadgild;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentResultProcessing student=new StudentResultProcessing();
		System.out.println("Please enter Student's Information:");
		
		System.out.println("Name:");
		Scanner scanName=new Scanner(System.in);
		student.setName(scanName.next());
		
		System.out.println("Phone No:");
		Scanner phNumber=new Scanner(System.in);
		student.setPhoneNumber(phNumber.next());
		
		System.out.println("Roll No:");
		Scanner rollNumber=new Scanner(System.in);
		student.setRollNumber(rollNumber.nextInt());
		
		System.out.println("Class No:");
		Scanner classNumber=new Scanner(System.in);
		student.setClassNumber(classNumber.nextInt());
		
		System.out.println("Please enter Physics Marks:");
		Scanner physcan=new Scanner(System.in);
		student.setPhysicsmarks(physcan.nextInt());
		
		System.out.println("Please enter Chemistry Marks:");
		Scanner chemscan=new Scanner(System.in);
		student.setChemistrymarks(chemscan.nextInt());
		
		System.out.println("Please enter Maths Marks:");
		Scanner mathscan=new Scanner(System.in);
		student.setMathsmarks(mathscan.nextInt());
		
		System.out.println("*********************************************");
		System.out.println("Name: "+student.getName()+" "+"PhoneNumber:"+student.getPhoneNumber()+" "+"Roll Number:"+student.getRollNumber()+" "+"Class Number:"+student.getClassNumber());
		System.out.println("Physics: "+student.getPhysicsmarks()+" Chemistry: "+student.getChemistrymarks()+" Maths: "+student.getMathsmarks());
		System.out.println("*********************************************");
		
		if(student.processResult()<50)
			System.out.println("Sorry "+student.getName()+" .You have scored average "+student.processResult()+" in all the 3 subjects .You have Failed the exam");
		else
			System.out.println("Congratulations "+student.getName()+" .You have scored average "+student.processResult()+" in all the 3 subjects.You have Passed the exam");

	}

}
