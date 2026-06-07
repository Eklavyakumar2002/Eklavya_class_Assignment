package Day7_Class_Assignment;
class Bank {

    int balance = 1000;
    public synchronized void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName() + " wants to withdraw " + amount);
        if(balance >= amount) {
            System.out.println("Processing...");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Thread was interrupted during processing");
            }
            balance = balance - amount;

            System.out.println(Thread.currentThread().getName() + " withdrawal done");
            System.out.println("Remaining balance: " + balance);
        }
        else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
    }
}

class Customer extends Thread {
    Bank b;
    int amt;
    Customer(Bank b, int amt, String name) {
        this.b = b;
        this.amt = amt;
        setName(name);
    }
    public void run() {
        b.withdraw(amt);
    }
}

public class synchornization_eg{
    public static void main(String[] args) {

        Bank b = new Bank();
        Customer c1 = new Customer(b, 800, "User1");
        Customer c2 = new Customer(b, 500, "User2");
        c1.start();
        c2.start();
    }
}
