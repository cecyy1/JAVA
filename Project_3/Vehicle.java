package Project_3;

public class Vehicle {
	protected  String make;
	private  int year;
	
	public Vehicle (String make, int year) {
		this.make=make;
		this.year=year;
	}
	public  void setmake(String make) {
		 this.make=make;
	}
	public String getMake() {
		return make;
	}
	
	public String toString(String make,int year) {
		return "the vehicle year is" + year + "and the make is " + make;
		
	}

}
