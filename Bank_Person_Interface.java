package Work;

import java.util.*;

interface Bank{
	void createAccount();
	void Deposit(double amount);
	void Withdraw(double amount);
	double GetBalance();
	double GetAnnualInterest();
}


class SBI implements Bank{
	int BankId;
	String Branch;
	String Location;
	
	double rate=5.2;
	double amt=5000;
	
	public void createAccount() {
		System.out.println("Account Created !!!!!!!!!!!!!");
	}
	public 	void Deposit(double amount) {
		amt+=amount;
		
	}
	public void Withdraw(double amount) {
		amt-=amount;
	}
	public double GetBalance() {
		return amt;
		
	}
	public double GetAnnualInterest() {
		return ((amt *rate)/100);
		
	}
	
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		Random rand =new Random();
		System.out.println("Enter Bank Details-------------->");
		System.out.println("Enter Bank Id :");
		BankId=rand.nextInt();
		System.out.println("Enter Bank of a Branch :");
		Branch=sc.next();
		System.out.println("Enter Location :");
		Location=sc.next();
		
	}
	
	
	public void  SetMonthlyInterest ( ) {
		rate=(amt*100*rate)/12;
		System.out.println("Monthly Interest : "+rate);
	}
}

class ICICI implements Bank{
	int BankId;
	String Branch;
	String Location;
	
	double rate=5.87;
	double amt=5000;
	
	public void createAccount() {
		System.out.println("Account Created !!!!!!!!!!!!!");
	}
	public 	void Deposit(double amount) {
		amt+=amount;
		
	}
	public void Withdraw(double amount) {
		amt-=amount;
	}
	public double GetBalance() {
		return amt;
		
	}
	public double GetAnnualInterest() {
		return ((amt *rate)/100);
		
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		Random rand =new Random();
		System.out.println("Enter Bank Details-------------->");
		System.out.println("Enter Bank Id :");
		BankId=rand.nextInt();
		System.out.println("Enter Bank of a Branch :");
		Branch=sc.next();
		System.out.println("Enter Location :");
		Location=sc.next();
		
	}
	
	
	public void  SetMonthlyInterest ( ) {
		rate=(amt*100*rate)/12;
		System.out.println("Monthly Interest : "+rate);
	}
}

class HDFC implements Bank{
	int BankId;
	String Branch;
	String Location;
	
	double rate=6.67;
	double amt=5000;
	
	public void createAccount() {
		System.out.println("Account Created !!!!!!!!!!!!!");
	}
	public 	void Deposit(double amount) {
		amt+=amount;
		
	}
	public void Withdraw(double amount) {
		amt-=amount;
	}
	public double GetBalance() {
		return amt;
		
	}
	public double GetAnnualInterest() {
		return ((amt *rate)/100);
		
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		Random rand =new Random();
		System.out.println("Enter Bank Details-------------->");
		System.out.println("Enter Bank Id :");
		BankId=rand.nextInt();
		System.out.println("Enter Bank of a Branch :");
		Branch=sc.next();
		System.out.println("Enter Location :");
		Location=sc.next();
		
	}
	public void display() {
		System.out.println("Bank ID :" + BankId);
		System.out.println("Bank Name :" +this.getClass().getName() );
		System.out.println("Bank Balance :" +this.GetBalance() );
		System.out.println("Bank Annual Interest :" +this.GetAnnualInterest() );
		
	}
	
	public void  SetMonthlyInterest ( ) {
		rate=(amt*100*rate)/12;
		System.out.println("Monthly Interest : "+rate);
		
	}
}

class Person extends HDFC{
	int pid;
	String name;
	long AccountNo;
	String TypeOfAccount;
	String Email;
	
	public void read() {
		super.read();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Person Details -------------->");
		System.out.println("Enter Name of a Person:");
		name=sc.next();
		System.out.println("Enter Account Number :");
		AccountNo=sc.nextLong();
		System.out.println("Enter Type of Account (Savings/Current)?:");
		TypeOfAccount=sc.next();
		System.out.println("Enter Email of a Person:");
		 Email=sc.next();
		
	}
	public void Account_details() {
		super.display();
		System.out.println("Person ID :" + pid);
		System.out.println("Name of a Person :" + name);
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


public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
      
        
        Person personWithMaxAmount = null;
        double maxAmount = 0;
       

    
            Person p = new Person();
            System.out.println("Enter amount to deposit : ");
            double amount = scn.nextDouble();
            p.Deposit(amount);
            System.out.println("Enter amount to withdraw : ");
            double money = scn.nextDouble();  
            try {
                p.Withdraw(money); 
             } catch(InsuffiecientBalanceException e) {
                 System.out.println(e.getMessage());
             }
           //  System.out.println("Balance : " + p.GetBal

            if (p.GetBalance() > maxAmount) {
                maxAmount = p.GetBalance();
                personWithMaxAmount = p;
            }
        System.out.println("Person with maximum amount : " + personWithMaxAmount.name);
    }
}
	}

}
