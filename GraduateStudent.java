//package Work;

import java.util.Random;
import java.util.Scanner;
//import java.io.*;
class Person{
	String name=null;
	int age=0;
	int height=0; // in cm
	void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of a Person:");
		name=sc.nextLine();
		System.out.println("Enter age of a Person:");
		age=sc.nextInt();
		System.out.println("Enter Height of a Person(in cm):");
		height=sc.nextInt();
		//sc.close();
		
	}
	void display() {
		
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.height);
	}
}

class Student extends Person{
	int studentId;
	String instituteName;
	long  phoneNumber;
	
	void read() {
		super.read();
		Scanner sc = new Scanner(System.in);
		Random rand =new Random();
		System.out.println("Enter Student ID:");
		studentId=rand.nextInt();
		System.out.println("Enter name of a Institue:");
		instituteName=sc.nextLine();
		System.out.println("Enter Phone Number of a Student:");
		phoneNumber=sc.nextLong();
	}
	void display() {
		super.display();
		System.out.println("ID of a Student:"+this.studentId);
		System.out.println("Name of a Institute:"+this.instituteName);
		System.out.println("Phone Number:"+this.phoneNumber);
	}
}

class GraduateStudent extends Student{
	String program;
	int noOfSubjects;
	String classTeacher;
	void read() {
		super.read();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Program:");
		program=sc.nextLine();
		System.out.println("Enter no. of Subjects:");
		noOfSubjects=sc.nextInt();
		System.out.println("Enter Class Teacher's Name:");
		classTeacher=sc.nextLine();
	}
	void display() {
		super.display();
		System.out.println("Program of a Student:"+this.program);
		System.out.println("Number of Subjects:"+this.noOfSubjects);
		System.out.println("Class Teacher:"+this.classTeacher);
	}
	
}





public class Prabhu_Sir1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraduateStudent[] gs=new GraduateStudent[3];
		for(int i=0;i<1;i++) {
			gs[i]=new GraduateStudent();
			gs[i].read();
		}
		for(int i=0;i<1;i++) {
			if(gs[i].height > 150 && (gs[i].program.equals("BCA") || gs[i].program.equals("bca"))) {
				System.out.println(gs[i].name +" is Very TALLLLL");
				
			}
		}
	}

}









