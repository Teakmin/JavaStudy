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
			 *  1. ����ΰų�
			 *  2. printStackTrace(), getMessage()�� ���µ�
			 *     printStackTrace()...������ �߻��� ������ �����ؼ� ������ ���
			 *   		**-> ������ ���� printStackTrace()��  (���� ������ �ڵ� ������ �巯���� ��Ŀ�� �ǿ� ���ɼ�)
			 *   		**-> �����ÿ��� ����ΰų� getMessage()�� �����
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
