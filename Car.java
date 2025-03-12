package NewAssign1;

public class Car {
	
	String brand;
	String model;
	Engine e;
	
	public Car(String brand, String model , Engine e) {
		this.brand = brand;
		this.model = model;
		this.e =e;
	}
	
	
	
	public void startsCar() {
		System.out.println(brand+" "+model);
		e.startsEngine();
		
	}
	
	
	
	public void display() {
		e.startsEngine();
		System.out.println(brand);
		System.out.println(model);
		
	}

}


class Engine{
	
	String engineType;
	int horsePower;
	
	public Engine(String engineType, int horsePower) {
		
		this.engineType = engineType;
		this.horsePower = horsePower;	
	}
	
	
	
	public void startsEngine() {
		System.out.println(engineType);
		System.out.println(horsePower);
	}
	
	
	
}
