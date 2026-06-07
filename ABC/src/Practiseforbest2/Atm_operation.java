package Practiseforbest2;
import java.util.*;
public class Atm_operation {
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		double balance=1500;
		int choice;
		do {
		System.out.println("1.check balace");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("4. exit");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("balance:" + balance);
			break;
		case 2:
			System.out.println("enter deposited amount: ");
			double deposit=sc.nextDouble();
			if(deposit >0) {
				balance +=deposit;
				System.out.println("success deposit");
			}
			else {
				System.out.println("invalid amount");
			}
			break;
		case 3:
			System.out.println("enter withdrawn amount");
			double withdraw=sc.nextDouble();
			if(balance >= withdraw) {
				balance-=withdraw;
				System.out.println("withdraw success");
			}
			else {
				System.out.println("insufficient amount");
			}
			break;
		case 4:
			System.out.println("thank you for using atm");
			break;
		default :
			System.out.println("invalid choice");
		}
		}
		while(choice !=4);
	}
}
	
