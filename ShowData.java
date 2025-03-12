package NewAssign1;

public class ShowData {
	
	public static void main(String arg[]) {
		Engine e = new Engine("Hybride",2000);
		Car c = new Car("Tata","2020 model",e);
		c.display();
		
	}

}
