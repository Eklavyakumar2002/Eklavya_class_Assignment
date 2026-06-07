package Day3_class_Assignment;

class account {
	    private int bal = 1000;

	    public void deposit(int amt){
	        if(amt > 0){
	            bal = bal + amt;
	            System.out.println("Deposited");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	    }
	    public void withdraw(int amt){
	        if(amt <= bal){
	            bal = bal - amt;
	            System.out.println("Withdrawn");
	        }else{
	            System.out.println("No balance");
	        }
	    }
	    public void checkBal(){
	        System.out.println("Balance: " + bal);
	    }
}
	public class Bankaccount{
	    public static void main(String[] args){
	        account b = new account();
	        b.checkBal();
	        b.deposit(1500);
	        b.withdraw(270);
	        b.checkBal();
	    }
}
