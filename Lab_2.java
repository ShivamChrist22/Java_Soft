package Prabhu_Sir;


import java.util.*;
import java.lang.*;
class Student1{
	//    CLASS MEMBERS 
	int rno;
	String name;
	int noOfSubjects;
	// ACCESS SPECIFIERS AKA PUBLIC I HAVE USED :):):):)
	public Student1() {
		
	}
	//CONSTRUCTOR OVERLOADING !!!!!!!!!!!
	public Student1(int rno,String name) {
		this.rno=rno;
		this.name=name;
	}
	
	//CONSTRUCTOR OVERLOADING !!!!!!!!!!!
	public Student1(int rno,String name,int noOfSubjects) {
		this.rno=rno;
		this.name=name;
		this.noOfSubjects=noOfSubjects;
	}
	
	
//	void read() {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Roll No. :");
//		rno=sc.nextInt();
//		System.out.println("Enter Name of a Student :");
//		name=sc.next();
//		//sc.close();
//	}
	
	//    MEMBER FUNCTIONS 
	void display() {
		System.out.println("\n########## DETAILS OF A "+name+"##########");
		System.out.println("Name :"+name);
		System.out.println("Roll/Seat Number :"+rno);
		System.out.println("No. of Subjects :"+ noOfSubjects);
	}
	
	//FUNCTION OVERLOADING !!!!!!!!!!!
	void display(String[] attendance) {
		System.out.println("\n########## DETAILS OF A "+name+"##########");
		System.out.println("Name :"+name);
		System.out.println("Roll/Seat Number :"+rno);
		System.out.println("No. of Subjects :"+ noOfSubjects);
		System.out.println("Attendace of 1st 10 days of a lab:\n");
		System.out.print("Dates------------------------>\n");
		for(int i=0;i<10;i++) {
			System.out.print(attendance[i]+"\t");
		}
	}

}// CLASS END








public class Lab_2 {
	//STATIC VARIABLES!!!!!!!!!!
	static String status="Domain Based Program ";
	
	//MULTIPLE STATIC BLOCKS!!!!!!!!!!!!! 
	//First static block
	  static{
	      System.out.println("\nStatic Block 1");
	      System.out.println("Static Block 1");
	      System.out.println(status);
	    
	  } 
	  //Second static block
	  static{
	      System.out.println("\nStatic Block 2");
	      System.out.println("Static Block 1");
	      System.out.println(status);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\nSTUDENT HAVE TO LOGIN FIRST IN ORDER TO ACCESS YOUR 'KP'");
		
		int ch=0,i;
		
		//LOGIN CODE IS WRITTEN >>>>>>>>>>>>>>>>>>>>>>>
		String Password = "root";
		String Username = "Student";

		Scanner input1=new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = input1.next();

		Scanner input2=new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = input2.next();
		
		// CONTROL STATEMENTS 
		if(username.equals(Username)&& Password.equals(password)){
			System.out.println("\n#########   LOGIN SUCCESSFULL   ##########\n");
		}
		else if(!(Username.equals(username))){
			System.out.println("\nInvaild Username!");
		}
		else if(Password!=password){
			System.out.println("\nInvaild Password!");
		}
		else{
			System.out.println("\nInvalid Username & Password!");
		}
		Student1 s1=new Student1(1,"Shivam Tyagi");
		Student1 s2=new Student1(1,"Shivam Tyagi",6);
		String attd[]= {"P","A","P","P","P","P","P","P","P","A"};
		
		s1.display();
		s2.display();
		s2.display(attd);

	}

}

//OUTPUT AS FOLLOWS------------>


Static Block 1
Static Block 1
Domain Based Program 

Static Block 2
Static Block 1
Domain Based Program 

STUDENT HAVE TO LOGIN FIRST IN ORDER TO ACCESS YOUR 'KP'
Enter Username: 
Student
Enter Password: 
root

#########   LOGIN SUCCESSFULL   ##########


########## DETAILS OF A Shivam Tyagi##########
Name :Shivam Tyagi
Roll/Seat Number :1
No. of Subjects :0

########## DETAILS OF A Shivam Tyagi##########
Name :Shivam Tyagi
Roll/Seat Number :1
No. of Subjects :6

########## DETAILS OF A Shivam Tyagi##########
Name :Shivam Tyagi
Roll/Seat Number :1
No. of Subjects :6
Attendace of 1st 10 days of a lab:

Dates------------------------>
P	A	P	P	P	P	P	P	P	A	

