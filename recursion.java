package Project_5;

import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number you want to stop the addition: ");
		int number=input.nextInt();
		System.out.println("The sum from 1 to "+ number+ " is "+ SumOfNumbers(number));
		
	

	}
	public static int SumOfNumbers(int number) {
		if(number==1) {
			return 1;
		}else 
			return number + SumOfNumbers(number-1);
		
	}

}
