package finalstudy;

import java.util.Arrays;

public class Multiplication {

	public static void main(String[] args) {
		int[][]mulTable=new int[9][9];
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				mulTable[i][j]=(i+1)*(j+1);
				
			}
		}for(int [] array: mulTable)
			System.out.println(Arrays.toString(array));
		

	}


}


/*numbers= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
for(int i=0;i<numbers.length; i++) {
	int sum=0;
	for(int val:numbers[i])
		sum+=val;
	System.out.printf("sum on rows %d:%d\n",i,sum);
}
*/