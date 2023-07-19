package finalstudy;

public class sequential_Search {

	public static void main(String[] args) {
		int [] array= {45,67,23,50,1,505, 54, 40,90};
		System.out.println(search(array,54));

	}
public static int search(int [] x, int key) {
	for(int i=0; i<x.length; i++) {
		if (x[i]==key)
			return i;
		
	}
	return -1;
}
}
