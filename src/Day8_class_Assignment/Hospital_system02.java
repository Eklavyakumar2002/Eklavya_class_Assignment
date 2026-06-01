package Day8_class_Assignment;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
class Patient {
    int id;
    String name;
    int age;

 Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


public boolean equals(Object obj) {
        if (this == obj) return true;
        Patient p = (Patient) obj;
        return this.id == p.id;
   }



 public int hashCode() {
        return Objects.hash(id);
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
public class Hospital_system02 {
    public static void main(String[] args) {
        HashSet<Patient> patients = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    Patient newPatient = new Patient(id, name, age);
                    if (patients.contains(newPatient)) {
                        System.out.println("Patient already registered");
                    } else {
                        patients.add(newPatient);
                        System.out.println("Patient added successfully");
                    }
                    break;
                case 2:
                    if (patients.isEmpty()) {
                        System.out.println("No patients found");
                    } else {
                        System.out.println("Patient List:");
                        for (Patient p : patients) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (Patient p : patients) {
                        if (p.id == searchId) {
                            System.out.println("Patient Found: " + p);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Patient not found");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
        sc.close();
    }
}
