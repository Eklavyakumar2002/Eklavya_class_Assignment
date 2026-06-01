//1.Banking Application How will you use Java IO File Handling to store customer transaction history and read account details from files?
package Day10_class_assignment;

import java.io.*;
import java.util.Scanner;

class BankAccount {

    int accNo;
    String name;
    double balance;

    BankAccount(int accNo, String name, double balance) {

        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(double amount) {

        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Number : " + accNo);
        System.out.println("Customer Name  : " + name);
        System.out.println("Balance        : " + balance);
    }

    void saveData() {

        try (PrintWriter pw = new PrintWriter(new FileWriter("bank.txt", true))) {

            pw.println("Account Number : " + accNo);
            pw.println("Customer Name  : " + name);
            pw.println("Balance        : " + balance);
            System.out.println("Data Saved Into File");
        }

        catch (IOException e) {

            System.out.println(e);
        }
    }
void readData() {
    try (BufferedReader br =new BufferedReader( new FileReader("bank.txt"))) {
        String line;
        System.out.println("\n===== FILE DATA =====\n");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
    catch (IOException e) {
        System.out.println(e);
    }
}
}

public class Banking_application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount(1211, "eklavya", 10000);
        int choice = 0;
        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account");
            System.out.println("4. Save Data Into File");
            System.out.println("5. read data from file");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    b1.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    b1.withdraw(withdrawAmount);
                    break;
                case 3:
                    b1.display();
                    break;
                case 4:
                    b1.saveData();
                    break;
                case 5:
                    b1.readData();
                    break;
                case 6:
                    System.out.println("Exiting Application...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

        
    }
    }