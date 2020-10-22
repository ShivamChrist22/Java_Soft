package cia;

import java.util.Random;
import java.util.Scanner;
import java.io.*;
class Person{
	String name=null;
	int age=0;
	String addrs;
	
	public Person() {
		
	}
	//CONSTRUCTOR OVERLADING
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	//COPY CONSTRUCTOR
	public Person(Person p) {
		this.name=name;
		this.age=age;
		this.addrs=addrs;
	}
	
	void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of a Person:");
		name=sc.nextLine();
		System.out.println("Enter age of a Person:");
		age=sc.nextInt();
		System.out.println("Enter Address of a Person:");
		addrs=sc.next();
		//sc.close();
		
	}
	void show() {
		
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+this.age);
		System.out.println("Height:"+this.addrs);
	}
}

class Employee extends Person{
	int EmployeeID;
	String companyName,Department, Designation;
	
	void read() {
		super.read();
		Random rand =new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID of a Employee:");
		EmployeeID=rand.nextInt();
		System.out.println("Enter Compnay Name of a Employee:");
		companyName=sc.next();
		System.out.println("Enter Department of a Employee:");
		Department=sc.next();
		System.out.println("Enter Designation of a Employee:");
		Designation=sc.next();
		//sc.close();
		
	}
	void display() {
		super.show();
		System.out.println("ID:"+this.EmployeeID);
		System.out.println("Compnay Name:"+this.companyName);
		System.out.println(" Department:"+this.Department);
		System.out.println("Designation:" +this.Designation);
	}
}

class EmployeeSalary extends Employee{
	int Basic,DA,HRA,PF,IT;
	void read() {
		super.read();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Salary:");
		Basic=sc.nextInt();
		System.out.println("Enter DA Salary:");
		DA=sc.nextInt();
		System.out.println("Enter HRA Salary:");
		HRA=sc.nextInt();
		System.out.println("Enter PF Salary:");
		PF=sc.nextInt();
		System.out.println("Enter IT Salary:");
		IT=sc.nextInt();
		//sc.close();
		
	}
	
	int Gross_salary;
	int Deduction;
	int Net_Salary;
	void Net_Salary() {
		
		 Gross_salary=Basic +DA+HRA;
		 Deduction=Gross_salary-PF-IT;
		 Net_Salary=Gross_salary-Deduction;
		
	}
	void show_salary() {
		System.out.println("Gross_salary :"+Gross_salary);
		System.out.println(" Deduction :"+ Deduction);
		System.out.println(" Net_Salary :"+ Net_Salary);
	}
	
}


public class CIA_Exam {
	public static void main(String[] agrs) {
		int MAX,MIN;
		int temp1,temp2,temp3,temp4;
		EmployeeSalary[] es=new EmployeeSalary[3];
		for(int i=0;i<2;i++) {
			es[i]=new EmployeeSalary();
			es[i].read();
		}
		for(int i=0;i<2;i++) {
			es[i].Net_Salary();
		}
		for(int i=0;i<2;i++) {
			es[i].show_salary();
		}
		for(int i=0;i<2;i++) {
			System.out.println("############MAXIMUM #############");
			temp1=Math.max(es[i].Basic , es[i].DA);
			temp2=Math.max(es[i].HRA , es[i].PF);
			MAX=Math.max(temp1,temp2);
			if(MAX > es[i].IT) {
				MAX=es[i].IT;
				System.out.println("ID OF A EMPLOYEE :"+es[i].EmployeeID+"\nNAME OF A EMPLOYEE :"+es[i].name+  "\nMaximum Salary :"+ MAX);
			}
			else
				System.out.println("ID OF A EMPLOYEE : "+es[i].EmployeeID+"\nNAME OF A EMPLOYEE : "+es[i].name+  "\nMaximum Salary :"+ MAX);
			System.out.println("############MINIMUM #############");
			temp3=Math.min(es[i].Basic , es[i].DA);
			temp4=Math.min(es[i].HRA , es[i].PF);
			MIN=Math.min(temp3,temp4);
			if(MIN > es[i].IT) {
				MIN=es[i].IT;
				System.out.println("ID OF A EMPLOYEE : "+es[i].EmployeeID+"\nNAME OF A EMPLOYEE : "+es[i].name+  "\nMiniimum Salary :"+ MIN);
			}
			else
				System.out.println("ID OF A EMPLOYEE : "+es[i].EmployeeID+  "\nNAME OF A EMPLOYEE : "+es[i].name+  "\nMinimum Salary :"+ MIN);
			
		}
		
	}

}
