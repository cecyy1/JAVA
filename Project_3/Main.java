package Project_3;

public class Main {

	public static void main(String[] args) {
		 Vehicle[] vehicles = new Vehicle[2];

	        Car car = new Car("camero", 2021, 4);
	        BigRig bigRig = new BigRig("toyota", 2022, 2);

	        vehicles[0] = car;
	        vehicles[1] = bigRig;

	        for (Vehicle v : vehicles) {
	            System.out.println(v);
	        }
	}

}
