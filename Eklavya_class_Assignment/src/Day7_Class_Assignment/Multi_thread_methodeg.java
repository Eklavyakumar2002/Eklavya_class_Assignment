package Day7_Class_Assignment;
import java.lang.*;
class MyThread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(500);
            }
        } catch(Exception e) {
            System.out.println("Error");
        }
    }
}
public class Multi_thread_methodeg {
    public static void main(String[] args) throws Exception {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Both threads finished");

        System.out.println("Is Thread-1 alive" + t1.isAlive());
    }
}
