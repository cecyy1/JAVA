package Project_3;

public class Car extends Vehicle{
	
	
	public Car(String make, int year, int maxnumberofPassenger ) {
		super(make, year);
		this.maxnumberofPassenger=maxnumberofPassenger;
	}
	
	private int maxnumberofPassenger;
	
	public int getmaxnumberofPassenger() {
		return maxnumberofPassenger;
	}
	public void setxmaxnumberofPassenger() {
		this.maxnumberofPassenger=maxnumberofPassenger;
	}
	
	
	public String toString () {
		return"vehicle make is " + make + " and the maximum number of passengers in this car is " + maxnumberofPassenger;
	 
		
	}

}
