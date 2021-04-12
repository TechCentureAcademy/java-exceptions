package exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {

	
	public static void main(String[] args) {
		
		
		
		File file = new File("date.txt");
		
	
		try {
			FileReader reader = new FileReader(file);
			BufferedReader bf = new BufferedReader(reader);
			String line = null;
			while( (line =  bf.readLine()) != null) {
				System.out.println(line);
			}
		}catch (Exception e) {
			System.out.println("I caught an exception in this block");
		}

		System.out.println("end of program");
			
		
	}
}
