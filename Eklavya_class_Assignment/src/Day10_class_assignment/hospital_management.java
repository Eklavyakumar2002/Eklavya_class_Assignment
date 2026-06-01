//3.Hospital Management System How will you implement Java IO classes to maintain patient records and generate medical reports?
package Day10_class_assignment;

import java.io.*;

class Hospital{

    int patientId;
    String patientName;
    String disease;
    double bill;

    Hospital(int patientId,String patientName,String disease,double bill){

        this.patientId=patientId;
        this.patientName=patientName;
        this.disease=disease;
        this.bill=bill;
    }

    void saveRecord(){

        try(PrintWriter printWriter=new PrintWriter(new FileWriter("patient.txt",true))){

            printWriter.println("PatientId:"+patientId);
            printWriter.println("PatientName:"+patientName);
            printWriter.println("Disease:"+disease);
            printWriter.println("Bill:"+bill);
            System.out.println("PatientRecordSaved");
        }
        catch(IOException exception){
            System.out.println(exception);
        }
    }
    void generateReport(){

        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("patient.txt"))){

            String line;

            System.out.println("\n=====MEDICALREPORT=====\n");

            while((line=bufferedReader.readLine())!=null){

                System.out.println(line);
            }
        }

        catch(IOException exception){

            System.out.println(exception);
        }
    }
}

public class hospital_management{
    public static void main(String[] args){
        Hospital hospital=new Hospital(101,"Rahul","Fever",2500);
        hospital.saveRecord();
        hospital.generateReport();
    }
}