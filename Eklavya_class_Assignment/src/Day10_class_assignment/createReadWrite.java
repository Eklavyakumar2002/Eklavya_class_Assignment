package Day10_class_assignment;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class createReadWrite {
	public static void main(String args[]) {
		try {
			File f=new File("eklavya.txt");
			if(f.createNewFile()) {
				System.out.println("file created");
			}
			else {
				System.out.println("file already exits");
			}
			
			FileWriter fw=new FileWriter("eklavya.txt");
			fw.write("hello eklavya");
			fw.close();
			System.out.println("Data written");
			
			FileReader fr=new FileReader("eklavya.txt");
			int i;
			while((i=fr.read())!=-1){
				System.out.println((char)i);
			}
			fr.close();
					
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
