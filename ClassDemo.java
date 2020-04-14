
class Mobile {
	String ram;
	String rom;
	String model, processor, cam;
	double price;

	void display() {
		System.out.println("Model::" + model);
		System.out.println("RAM::" + ram);
		System.out.println("ROM::" + rom);
		System.out.println("Processor::" + processor);
		System.out.println("Price::" + price);

	}
}

public class ClassDemo {
	public static void main(String[] args) {
		Mobile d1 = new Mobile();
		d1.model = "XIAOMI Redmi Y2";
		d1.ram = "4GB";
		d1.rom = "64GB";
		d1.processor = "Snapdragon 630";
		d1.price = 8000;
		d1.display();

		Mobile d2 = new Mobile();
		d2.model = "XIAOMI Redmi Y3";
		d2.ram = "3GB";
		d2.rom = "32GB";
		d2.processor = "Snapdragon 730";
		d2.price = 9000;
		d2.display();
	}
}