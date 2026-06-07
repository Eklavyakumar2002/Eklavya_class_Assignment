//develop payment system using interface and default method.
package Day5_Class_Assignment;

interface Payment {
    void pay(double amount);
    default void transactionStatus() {
        System.out.println("Transaction completed");
    }
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card.");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + "using UPI.");
    }
}

public class payment_test {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.pay(4300);
        p1.transactionStatus();

        System.out.println();

        Payment p2 = new UPIPayment();
        p2.pay(1200);
        p2.transactionStatus();
    }
}
