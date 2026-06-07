//5.How will you use Serialization in Java to save and retrieve employee objects from files?
package Day10_class_assignment;

import java.io.*;

class Employee implements Serializable {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("ID  : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary:" + salary);
    }
}

public class employee_management{
    public static void main(String[] args) {
        String fileName = "employeed.txt";

        System.out.println("Creating and Saving Employee");
        Employee newEmp = new Employee(101, "eklavya", 65000.50);

        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(newEmp);
            System.out.println("Employee saved successfully to: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }

        System.out.println("taking emp data from file");
        Employee loadedEmp = null;
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            loadedEmp = (Employee) ois.readObject();
            System.out.println("Employee loaded successfully!");
            System.out.println("Here are the details:");
            loadedEmp.displayInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}