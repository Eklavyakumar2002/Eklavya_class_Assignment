package Day5_Class_Assignment;

class login_system{
	public final void authentic_user() {
		System.out.println("authentic user with proper passwod");
	}
}
class admin extends login_system{
	public void admin_access() {
		System.out.println("Admin access granted");
	}
	
//	public void authentic_user() {
//		System.out.println("i know it will throw error because we cant override this class bcoz this is final method");
//	}
}

public class final_method_eg {
	public static void main(String args[]) {
		login_system user1=new login_system();
		user1.authentic_user();
		admin user2 = new admin();
		user2.admin_access();
	}
}
