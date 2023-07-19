package Project_3;

public class BigRig extends Vehicle{

	public BigRig(String make, int year, double cargocapacity) {
		super(make, year);
		this.cargocapacity=cargocapacity;
		
	}

	private double cargocapacity;
	
	public double getCargocapacity() {
		return cargocapacity;
	}
	public void setCargocapacity() {
		this.cargocapacity=cargocapacity;
		
	}
	public String toString() {
	return 	"the Vehicle make is " +make +" and the cargo capacity is "+ cargocapacity;
	
	}
	
}
