
package Day10_class_assignment;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
class Student implements Serializable{
		String name;
		int age;
		
		Student(String name, int age){
			this.name=name;
			this.age=age;
		}
	}
	public class serealization_rg{
		public static void main(String args[]) {
			try {
				Student s1=new Student("eklavya", 23);
				ObjectOutputStream oos = new ObjectOutputStream(
	                    new FileOutputStream("student.txt"));
				
				oos.writeObject(s1);
				oos.close();
				System.out.println("object stored");
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}

}
