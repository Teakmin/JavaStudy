package generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreeDPrinter printer = new ThreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());

		Powder powder = printer.getMaterial();  // Powder로 캐스팅 해줘야하는데 T로 뚫어놓고 유동적인 타입 집어넣고 싶은데다가 T를 넣으면 캐스팅을 안해줘도 됨
	}

}
