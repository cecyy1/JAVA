package csc123;
import java.util.Random;
import java.util.Scanner;


public class tictactoe_project {

	public static void main(String[] args) {
	       Scanner input=new Scanner(System.in);
	       System.out.println(" X or O;");
	       String pick=input.nextLine();


	   char[][] board =new char[3][3];
	   for (int i=0; i<3; i++) {
	       for (int j=0; j<3; j++) {
	           System.out.print ("|");
	           System.out.print( board[i][j]='-');
	           System.out.print ("|");
	           System.out.print ("\t");

	   }
	       System.out.println ();

	       }
	   char computer='O';
	   char symbol='X';

	   if(pick=="X") {
	       symbol='X';
	       computer='O';
	   }else if(pick=="O") {
	       symbol='O';
	        computer='X';
	   }
	   int counter=0;
	   while(counter !=6) {
		   counter++;
	   
	   

	   System.out.print("pick a row 0,1,2:" );
	   int row=input.nextInt();
	   System.out.print("pick a column 0,1,2:" );
	   int column=input.nextInt();

	   board[row][column]=symbol;

	   Random rand= new Random(); {
	       int pass=-1;
	       while(pass !=1) {
	           int computerrow=rand.nextInt(0,3);
	           int computercolumn=rand.nextInt(0,3);
	           if (board[computerrow][computercolumn] != 'X' && board[computerrow][computercolumn] != 'O') {
	               (board)[computerrow][computercolumn]=computer;
	               pass=1;
	           }

	       }
	   }

	   for (int i=0; i<3; i++) {
	       for (int j=0; j<3; j++) {
	           System.out.print ("|");
	           System.out.print( board[i][j]);
	           System.out.print ("|");
	           System.out.print ("\t");

	   }
	       System.out.println ();

	       }
	   if(Winner(board)=='X') {
		   System.out.println(pick +" you  won");
		   System.exit(0);
		   }else if(Winner(board)=='O'){
			   System.out.println(computer + " computer won");
			   System.exit(0);
			   }else {
				   if(tiedGame(board)) {
					   System.out.println("that is a tied game");
					   System.exit(0);
					   }else {
						   
					   }
				   }
	   }
	   }
	   

	public static char Winner(char[][] board) {
	//row check
		for(int i=0; i<3; i++) {
			if(board[i][0]==board[i][1] && board[i][1]== board
					[i][2] && board[i][0]!= '-') {
				return board[i][0];
				
				}
			}
	//col check
		for(int j=0; j<3; j++) {
			if(board[0][j]==board[1][j] && board[1][j]== board
					[2][j] && board[0][j]!= '-') {
				return board[0][j];
				}
			}
	//diagonal
		if(board[0][0]== board[1][1] && board[1][1]==board[2][2]
				&& board[0][0] !='-') {
			return board[0][0];
			}
		if(board[2][0]== board[1][1] && board[1][1]==board[2][2]
				&& board[0][2] !='-') {
			return board[2][0];
			}
		return'-';
		}
	public static boolean tiedGame(char [][]board) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(board[i][j]=='-') {
					return false;
					}
				}
			}
		return true;
		}
	}
