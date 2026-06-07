package Day9_class_assignment;
import java.util.*;
public class HospitalSystem {
    private Map<String, String> patientDatabase;

    public HospitalSystem() {
        this.patientDatabase = new HashMap<>();
    }

    public void addPatient(String patientID, String name) {
        if (patientDatabase.containsKey(patientID)) {
            System.out.println("Error: Patient ID " + patientID + " already exists.");
        } else {
            patientDatabase.put(patientID, name);
            System.out.println("Patient added: " + name);
        }
    }

    public void updatePatient(String patientID, String newName) {
        if (patientDatabase.containsKey(patientID)) {
            patientDatabase.put(patientID, newName);
            System.out.println("Patient name updated to: " + newName);
        } else {
            System.out.println("Error: Patient ID " + patientID + " not found.");
        }
    }
    public String getPatientDetails(String patientID) {
        return patientDatabase.getOrDefault(patientID, "Patient not found");
    }

    public void removePatient(String patientID) {
        if (patientDatabase.containsKey(patientID)) {
            String removedName = patientDatabase.remove(patientID);
            System.out.println("Removed patient: " + removedName);
        } else {
            System.out.println("Error: Patient ID " + patientID + " not found.");
        }
    }

    public void listAllPatients() {
        if (patientDatabase.isEmpty()) {
            System.out.println("No patients in the system.");
            return;
        }
        System.out.println("Patient List ");
        for (Map.Entry<String, String> entry : patientDatabase.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }

    public boolean checkExistence(String patientID) {
        return patientDatabase.containsKey(patientID);
    }

    public int countTotalPatients() {
        return patientDatabase.size();
    }

    public void clearSystem() {
        patientDatabase.clear();
        System.out.println("System cleared.");
    }

    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();

        system.addPatient("2002R", "Raju");
        system.addPatient("2001S", "Smith");

        System.out.println("2002R exists" + system.checkExistence("2002R"));

        System.out.println("Details 2001S: " + system.getPatientDetails("2001S"));

        system.updatePatient("2002R", "Rakesh");

        system.listAllPatients();

        System.out.println("Total patients: " + system.countTotalPatients());

        system.removePatient("2001S");

        system.listAllPatients();
    }
}