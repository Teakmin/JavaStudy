package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileExceptionTest5 {
	// 잡는 거 여러 개 가능하듯이 던지는 것도 여러 개 가능
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String path = "C:\\Users\\taekm\\OneDrive\\바탕 화면\\FIle.txt";
		FileReader fr = null;
		
		System.out.println("1.FileReader 객체 생성");
		fr = new FileReader(path);
			
		System.out.println("2. FileReader의 기능으로 파일 내용을 읽어들입니다.");
		System.out.println((char) fr.read());
			
		fr.close();
	}
}
