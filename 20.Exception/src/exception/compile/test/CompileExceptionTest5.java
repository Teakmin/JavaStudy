package exception.compile.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CompileExceptionTest5 {
	// ��� �� ���� �� �����ϵ��� ������ �͵� ���� �� ����
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String path = "C:\\Users\\taekm\\OneDrive\\���� ȭ��\\FIle.txt";
		FileReader fr = null;
		
		System.out.println("1.FileReader ��ü ����");
		fr = new FileReader(path);
			
		System.out.println("2. FileReader�� ������� ���� ������ �о���Դϴ�.");
		System.out.println((char) fr.read());
			
		fr.close();
	}
}
