
public class Vehical {
	
	String make;
	String model;
	int year;
	int price;
	
	 public Vehical(String make, String model, int year, int price) {
		 
		 this.make = make;
		 this.model = model;
		 this.year = year;
		 this.price = price;
		 
		 
	 }
	 public void DisplayVehicalDetails() {
		 System.out.println(make);
		 System.out.println(model);
		 System.out.println(year);
	 }
	 
	 public void CalculateInsurance() {
		 
		 if(price >= 2000000) {
			 System.out.println("Insurance Premium is : " + (price/100)*11.2 );
		 }
		 else if(price >700000 && price <2000000) {
			 System.out.println("Insurance premium is : " + (price/100)*8.5);
		 }
		 else {
			 System.out.println("Not in Insurance slab");
		 }
	 }
		
}



class Car extends Vehical{
	
	int noOfDoors;
	
	public Car(String make, String model, int year,int price,int noOfDoors) {
		super(make, model, year, price);
		this.noOfDoors = noOfDoors;	
		
	}
	
	public void CarDetails() {
		System.out.println(noOfDoors);
	}
	
}



class Truck extends Vehical{
	
	double cargoCapacity = 10;
	
	public Truck(String make, String model, int year,int price, double cargoCapacity) {
		super(make, model, year, price);
		
		this.cargoCapacity = cargoCapacity;
		
	}
	
	public void TruckDetails() {
		System.out.println("No of vehical can load : "+cargoCapacity);
	}
	

	
}


class ShowVehicalData{
	public static void main(String args[]) {
		Vehical v = new Vehical("Mahindra", "Thar", 2017, 600000);
		Car c = new Car("Tata","Harrier",2018,2500000,4);
		Truck t = new Truck("Volvo","Wolf Series",2020,1500000,2);
		
		c.DisplayVehicalDetails();
		t.DisplayVehicalDetails();
		v.CalculateInsurance();
		
		
		
	}
}
