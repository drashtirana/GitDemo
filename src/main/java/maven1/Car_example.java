package maven1;

public class Car_example {
	String model;
	int year;
	
	void start() {
		System.out.println("car is starting");
		model = "hundai";
		System.out.println(model);
	}
	
	void drive() {
		System.out.println("car is in motion");
	
	}
	public static void main(String[] args) {
		Car_example carobject = new Car_example();
		carobject.start();
		carobject.drive();
		
		
	}

	
	}


