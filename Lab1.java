import java.util.*;
import java.lang.*;
class Student{
	//    CLASS MEMBERS 
	int rno;
	String name;
	// ACCESS SPECIFIERS AKA PUBLIC I HAVE USED :):):):)
	public Student() {
		
	}
	public Student(int rno,String name) {
		this.rno=rno;
		this.name=name;
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
	void display(Student[] s) {
		for(int i=0;i<10;i++) {
			System.out.print(s[i].name+"  ");
			for(int j=0;j<10;j++) {
				System.out.print("\t"+" *  ");
			}
			System.out.println("");
		}
	}
}// CLASS END

public class Lab_1 {
	public static void main(String[] args) {
		
		// ARRAY OF OBJECTS 
		Student[] s=new Student[10];   
//		for(int i=0;i<2;i++) {
//			s[i]=new Student();
//			s[i].read();
//		}
		
		System.out.println("STUDENT HAVE TO LOGIN FIRST IN ORDER TO ACCESS YOUR 'KP'");
		
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
			System.out.println("\n#########   LOGIN SUCCESSFULL   ##########");
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
		//STOP
		
		String names[]= {"Shivam Tyagi","Dev Yadav","S Rudy","Laxmy Narayan","Manayank","Paridhi Shah","Nayanika P","Abhi C","G Rohan","Naived :)"};
		int roll[]= {1,2,3,4,5,6,7,8,9,10};
		
		while(true) {
			System.out.println("\n##########   MENU DRIVEN   ##########");
			System.out.println("\n1.Accept \n2.Display Your Attendance \n3.Update ur Attendance \n4.Exit \nEnter your choice:");
			Scanner sc = new Scanner(System.in);
			ch=sc.nextInt();
			
			switch(ch) {
				case 4:
					System.out.println("##### OUTSIDE #####");
					System.exit(0);
				case 1:
					for(i=0;i<10;i++) {
						s[i]=new Student();
						s[i].name=names[i];
						s[i].rno=roll[i];
					}
					break;
				case 2:
					System.out.println("###################     ATTENDANCE SHEET    ############### ");
					System.out.println("\n\t"+"Dates->");
					i=1;
					System.out.print("\t");
					while(i<11) {
						System.out.print("\t"+i+" ");
						i++;
					}
					System.out.println("\nNames");
					for(i=0;i<1;i++) {
						s[i].display(s);
					}
				
			}
		
		}
		
	}
}
