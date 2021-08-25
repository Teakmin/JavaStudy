package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileExceptionTest4 {

	public static void main(String[] args) {
		
		String path = "C:\\";
		FileReader fr = null;
		
		System.out.println("1.FileReader 객체 생성");
		try {
			fr = new FileReader(path);
			
			System.out.println("2. FileReader의 기능으로 파일 내용을 읽어들입니다.");
			System.out.println((char) fr.read());
		} catch(FileNotFoundException e) {
			System.out.println("3-1. FileNotFoundException");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();         //닫아줘야 됨. 중요! 누수가 발생할 수 있음
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
}
