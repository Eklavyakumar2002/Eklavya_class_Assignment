package practise_useCase;
import java.util.*;
class Bankaccount{
	private String name;
	private double balance=10000;
	private double accno;
	
	public Bankaccount(String name,double accno){
		this.name=name;
		this.accno=accno;
	}
	
	public String getname() {
		return name;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public double getaccno() {
		return accno;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}
		else {
			System.out.println("enter valid amount");
		}
	}
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("withdraw success" + balance);   
		}
		else {
			System.out.println("NOT ENOUGH");
		}
		
	}
	public void getdetails() {
		System.out.println("name"+ getname());
		System.out.println("accout no"+ getaccno());
	}
}

public class bank {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Bankaccount b1=new Bankaccount("eklavya", 02345);
		System.out.println("enter the choice from 1 to 4");
		while(true) {
			System.out.println("1.check balance");
			System.out.println("2.withdraw balance");
			System.out.println("3.deposit");
			System.out.println("4.details");
			System.out.println("5.exit");
			
			int choice=sc.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("total balance" + " "+ b1.getbalance());
				break;
			case 2:
				System.out.println("enter withdrawl amount");
				double withdrawamt=sc.nextDouble();
				b1.withdraw(withdrawamt);
				//System.out.println("withdrawl success");
				break;
			case 3:
				System.out.println("enter deposit amount");
				double depositamt=sc.nextDouble();
				b1.deposit(depositamt);
				System.out.println("deposit success");
				break;
			case 4:
				System.out.println("DETAILS"); 
				b1.getdetails();
				break;
			case 5:
				System.out.println("exit");
				return;
			default :
				System.out.println("enter the right choice");
			}
		}
	
	}
}
