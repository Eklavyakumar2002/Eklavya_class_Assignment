package Day5_Class_Assignment;
class bankacc{
	private final double account_no;
	private String name;
	
	public bankacc(double account_no , String name) {
		this.account_no=account_no;
		this.name=name;
	}
	
	public void display() {
		System.out.println("account no :" + account_no);
		System.out.println("Name :" + name);
	}
}
public class final_variable_eg {
	public static void main(String args[]) {
		bankacc acc1=new bankacc(1250," eklavya");
		acc1.display();
	}
}
