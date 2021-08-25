package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileExceptionTest4 {

	public static void main(String[] args) {
		
		String path = "C:\\";
		FileReader fr = null;
		
		System.out.println("1.FileReader ��ü ����");
		try {
			fr = new FileReader(path);
			
			System.out.println("2. FileReader�� ������� ���� ������ �о���Դϴ�.");
			System.out.println((char) fr.read());
		} catch(FileNotFoundException e) {
			System.out.println("3-1. FileNotFoundException");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();         //�ݾ���� ��. �߿�! ������ �߻��� �� ����
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
	}
}
