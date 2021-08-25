package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading3 {
	
	public void readFile(String filename) throws FileNotFoundException {
		
			FileReader fr = new FileReader(filename);
			System.out.println("1...new FileReader()...filename...");
		    
			System.out.println("2...FileReader Creating....");
	}
	
}

public class CompileExceptionTest3 {

	public static void main(String[] args) throws FileNotFoundException{
		
		FileReading2 f = new FileReading2();
		String path = "C://nofile";
		
			f.readFile(path);
			
		System.out.println("4...the end...");
		
	}

}
