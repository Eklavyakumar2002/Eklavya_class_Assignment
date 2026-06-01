package Day10_class_assignment;

import java.io.*;
import java.io.IOException;
 
public class readfiledemo {
public static void main(String[] args)
	{
 
		try {
			FileReader reader = new FileReader("renu.txt");
            int ch;
            
            while((ch=reader.read()) !=-1)
            {
            System.out.println((char) ch);
            }
			reader.close();
			}
 
		 	catch(IOException e)
            {
            	System.out.println(e);
            }
	}
	}