package cia;
import java.util.*;

import Dhiru.InsuffiecientBalanceException;
import Dhiru.Person;

import java.io.*;

interface Bank{
	public void creatAccount();
	public void withdraw(double amt) throws InsuffiecientBalanceException;
	public void deposit(double amt);
	public double getBalance();
	public double getAnnualInterest();
	
}

class SBI implements Bank{
	int bid;
	String branch;
	String location;
	double interestrate;
	
	double total_amt;
	
	SBI(){
		interestrate=5.1;
	}
	
	void creatAccount() {
		System.out.println("Account Created!!!!!!!!!!!!!");
	}
	
	public void setBankID(int id) {
        bid = id;
    }

    public int getBankId() {
        return bid;
    }

    public String getBankName() {
        return "SBI";
    }


    public void deposit(double amount) {
        total_amt += amount;
    }

    public void withdraw(double amount) throws InsuffiecientBalanceException {
        if (amount > total_amt) {
            throw new InsuffiecientBalanceException("Insufficient Balance!!");
        } else {
            total_amt -= amount;
        }
    } 
    
    public double getBalance() {
        return total_amt;
    }

    public double getAnnualInterest() {
        return interestrate;
    }

	
}


class ICICI implements Bank{
	int bid;
	String branch;
	String location;
	double interestrate;
	
	double total_amt;
	
	ICICI(){
		interestrate=5.5;
	}
	
	void creatAccount() {
		System.out.println("Account Created!!!!!!!!!!!!!");
	}
	
	public void setBankID(int id) {
        bid = id;
    }

    public int getBankId() {
        return bid;
    }

    public String getBankName() {
        return "SBI";
    }


    public void deposit(double amount) {
        total_amt += amount;
    }

    public void withdraw(double amount) throws InsuffiecientBalanceException {
        if (amount > total_amt) {
            throw new InsuffiecientBalanceException("Insufficient Balance!!");
        } else {
            total_amt -= amount;
        }
    } 
    
    public double getBalance() {
        return total_amt;
    }

    public double getAnnualInterest() {
        return interestrate;
    }


	
	
}

class HDFC implements Bank{
	
	int bid;
	String branch;
	String location;
	double interestrate;
	
	double total_amt;
	
	HDFC(){
		interestrate=7.2;
	}
	
	void creatAccount() {
		System.out.println("Account Created!!!!!!!!!!!!!");
	}
	
	public void setBankID(int id) {
        bid = id;
    }

    public int getbid() {
        return bid;
    }

    public String getbanknm() {
        return "SBI";
    }


    public void deposit(double amount) {
        total_amt += amount;
    }

    public void withdraw(double amount) throws InsuffiecientBalanceException {
        if (amount > total_amt) {
            throw new InsuffiecientBalanceException("Insufficient Balance!!");
        } else {
            total_amt -= amount;
        }
    } 
    
    public double getbalance() {
        return total_amt;
    }

    public double getAnnualInterest() {
        return interestrate;
    }


	
}

class InsuffiecientBalanceException extends Exception {
    
    String message;
    
    public InsuffiecientBalanceException(String message) {
        super(message);
        this.message = message;
        
    }
    
    public String getMessage() {
        return message;
    }
}

class Personn extends HDFC{
	int pid;
	String nm;
	int acc_no;
	String type_acc;
	String email;
	
	Personn(int pid,String nm,int acc_no, String type_acc, String email){
		this.pid=pid;
		this.nm=nm;
		this.acc_no=acc_no;
		this.type_acc=type_acc;
		this.email=email;
		
	}
	public int getpid() {
        return this.pid;
    }

    public String getnm() {
        return this.nm;
    }
	
	public void acc_details() {
		System.out.println("Person's ID :"+ getpid());
		System.out.println("Name of a Person :"+ getnm());
		System.out.println("Bank's Id :"+ getbid());
		System.out.println("Bank's Name :"+ getbanknm());
		System.out.println("Bank Balance Of "+ getbanknm()+"\t:"+ getbalance());
		System.out.println("Annual Interest is :"+getAnnualInterest());
		
	}
}

public class CIA2 {
	public static void main(String[] args) {
		
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of records you want to enter : ");
	        int n = sc.nextInt();
	        
	        Personn personWithMaxAmount = null;
	        double max_amt = 0;
	        
	        for (int i=1; i<=n; i++) {
	            System.out.println("Enter Person id : ");
	            int pid = sc.nextInt();
	            System.out.println("Enter Person name : ");
	            sc.nextLine();
	            String nm = sc.next();
	           // sc.next();
	            System.out.println("Enter Person email : ");
	            String email = sc.next();
	            System.out.println("Enter your type of account : ");
	            String type_acc = sc.next();
	            System.out.println("Enter Person account number : ");
	            int acc_no = sc.nextInt();
	            System.out.println("Enter your bank name : ");
	            String banknm = sc.next();    

	            Personn p = new Personn(pid,nm,acc_no,type_acc,email);
	            
	            
                int ch=0;
                while(ch!=5) {
                	System.out.println("-----------------MENU DRIVEN PROG----------------------");
    	            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Print Account Details\n5.Exit");
    	            System.out.println("-------------------------------------------------------\n");
                    System.out.println("Enter Your choice : "); 
                    ch = sc.nextInt();
                    
                    switch(ch) {
                    case 1:
                    	System.out.println("Enter ur amount to be desposited:");
                    	double amt= sc.nextDouble();
                    	p.deposit(amt);
                    	break;
                    	
                    case 2:
                    	System.out.println("Enter the amount to be withdrawed :");
                    	double amtt= sc.nextDouble();
                    	try {
                            p.withdraw(amtt); 
                         } 
                    	catch(InsuffiecientBalanceException e) {
                             System.out.println(e.getMessage());
                         }
                    	break;
                    	
                    case 3:
                    	System.out.println("Your Bank Balance is :"+ p.getbalance());
                    	System.out.println("------THANK U FOR VISITING US ----------------");
                    	break;
                    	
                    case 4:
                    	p.acc_details();
                        break;
                        
                    case 5:
                    	System.out.println("Good bye...");
                    	System.out.println("------THANK U FOR VISITING US ----------------");
                    	
                        break;

                   
                    }
                    
                    if(p.getbalance() > max_amt) {
                    	max_amt = p.getbalance();
                    	personWithMaxAmount = p;
                    	
                    }
                    
                }
                
                System.out.println("Person with maximum amount : " + personWithMaxAmount.getnm());
                System.out.println("                                              ~ SHIVAM TYAGI");
                System.out.println("------------------------------------------- ----------------");
                
            }


		
	}

}
