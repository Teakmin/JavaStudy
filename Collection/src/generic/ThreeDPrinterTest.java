package generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter printer = new ThreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());

		Powder powder = printer.getMaterial();  // Powder�� ĳ���� ������ϴµ� T�� �վ���� �������� Ÿ�� ����ְ� �������ٰ� T�� ������ ĳ������ �����൵ ��
	}

}
