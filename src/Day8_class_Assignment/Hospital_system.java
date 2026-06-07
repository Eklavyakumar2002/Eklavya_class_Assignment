package Day8_class_Assignment;
import java.util.HashSet;
import java.util.Scanner;
public class Hospital_system {
	public static void main(String args[]) {
		HashSet<Integer> patientsIDs=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("enter patients id");
			int id=sc.nextInt();
			
			if(patientsIDs.contains(id)) {
				System.out.println("patient already registered");
			}
			else {
				patientsIDs.add(id);
				System.out.println("patient added successfully");
				
			}
		}
		
		System.out.println("list of registers patients:");
		for(int pid: patientsIDs) {
			System.out.println(pid);
		}
		sc.close();
	}
}
