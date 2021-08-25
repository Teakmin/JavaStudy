package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading {
	
	public void readFile(String filename) {
		try {
			FileReader fr = new FileReader(filename);
			System.out.println("...new FileReader()...filename...");
		} catch (FileNotFoundException e) {
			/*
			 *  1. 비워두거나
			 *  2. printStackTrace(), getMessage()를 쓰는데
			 *     printStackTrace()...에러가 발생한 라인을 추적해서 원인을 출력
			 *   		**-> 개발할 때는 printStackTrace()를  (쓰지 않으면 코드 약점이 드러나고 해커가 악용 가능성)
			 *   		**-> 배포시에는 비워두거나 getMessage()를 사용함
			 */
		}
		System.out.println("FileReader Creating....");
	}
	
}

public class CompileExceptionTest1 {

	public static void main(String[] args) { 
			
		FileReading f = new FileReading();
		String path = "C:\\nofile";
		f.readFile(path);
		System.out.println("the end...");

	}

}
