package maven1;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car mycar = new Car("honda", "jetta", 2023);
		System.out.println("model" + mycar.getmodel());
		System.out.println("model" + mycar.getcompany());
		System.out.println("model" + mycar.year());

		mycar.setmodel("mazada");
		mycar.setcompany("volkswagon");
		mycar.setyear(2021);
		System.out.println("model" + mycar.getmodel());
		System.out.println("model" + mycar.getcompany());
		System.out.println("model" + mycar.year());

	}

}
