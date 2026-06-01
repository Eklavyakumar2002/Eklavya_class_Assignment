package Day7_Class_Assignment;
import java.lang.*;

class order implements Runnable{
	public void run() {
		try {
		for(int i=0;i<5;i++) {
			System.out.println("ordere is processing");
			Thread.sleep(1000);
		}
		}catch(InterruptedException e) {
			System.out.println("order intereputed");
		}
		}
	}
class payment implements Runnable{
	public void run() {
		System.out.println("payment recieved");
	}
}

class notification implements Runnable{
	public void run() {
		System.out.println("notification send");
	}
}
public class multi_thread_Dapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		order O=new order();
		payment p1=new payment();
		notification n=new notification();
		
		 Thread t1 = new Thread(O);
	     Thread t2 = new Thread(p1);
	     Thread t3 = new Thread(n);
		
		t1.start();
        t1.join();
		t2.start();
		t2.join();
		t3.start();

	}

}
