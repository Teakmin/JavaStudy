package exception.compile.test;
// 1. try~catch 2. throws

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading2{
	public void readFile(String filename) throws FileNotFoundException{
		
		FileReader fr = new FileReader(filename);
		System.out.println("1...new FileReader()...filename...");
		
		System.out.println("2...FileReader Creating...");             // 여기는 당연히 실행 안되지. 던져서 실행이 안됐는데
		
	}
}
public class CompileExceptionTest2 {

	public static void main(String[] args) {
		
		FileReading2 f = new FileReading2();
		String path = "C://nofile";
		try {
			f.readFile(path);
			System.out.println("3...파일을 잘 읽어들였습니다...");
		} catch (FileNotFoundException e) {
			
		}
		System.out.println("4...the end...");
		
	}

}
