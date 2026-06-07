package Day9_class_assignment;
import java.util.*;
class Patient {
    private int id;
    private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}

public class Hospital_management_usecase{
    private TreeSet<Patient> registeredPatients;

    public Hospital_management_usecase() {
        registeredPatients = new TreeSet<>((p1, p2) -> Integer.compare(p1.getId(), p2.getId()));
    }

    public void registerPatient(Patient patient) {
        if (registeredPatients.add(patient)) {
            System.out.println("Patient added to the system: " + patient);
        } else {
            System.out.println("Patient with ID " + patient.getId() + " is already registered.");
        }
    }

    public void viewRegisteredPatients() {
        System.out.println("List of unique registered patients:");
        for (Patient patient : registeredPatients) {
            System.out.println(patient);
        }
    }

    public static void main(String[] args) {
    	Hospital_management_usecase hospital = new Hospital_management_usecase();
        hospital.registerPatient(new Patient(1, "raju"));
        hospital.registerPatient(new Patient(2, "Anjan"));
        hospital.registerPatient(new Patient(1, "Raju")); 

        hospital.viewRegisteredPatients();
    }
}
