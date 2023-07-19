package Project_4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numWings = 0;
        int numDroids = 0;

        System.out.print("Enter number of wings: ");
        numWings = sc.nextInt();
        System.out.print("Enter number of droids: ");
        numDroids = sc.nextInt();

        try {
            XWing xWing = new XWing(numWings, numDroids);
            System.out.println("XWing created with " + xWing.getNumWings() + " and " + xWing.getNumDroids() + " droids.");
        } catch (WrongNumberOfWings | WrongNumberOfDroids e) {
            System.out.println(e.getMessage());
        }
    
		

	}

}
