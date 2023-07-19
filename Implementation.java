package csc123;

public class Implementation{
	
	public static boolean isValidEmpNum(String phoneNumber) {
		boolean status=true;
		//example (765)764-8754
		//the length has to be 13
		//charAt(0) has to be '('
		//charAt(4) has to be ')'
		//charAt(8) has to be '-'
		//if it was (765) 764-8754 
		if (phoneNumber.length() != 13) {
			status=false;
			
		}
		if(	(phoneNumber.charAt(0)=='(')&&
			(Character.isDigit(phoneNumber.charAt(1)))&&
			(Character.isDigit(phoneNumber.charAt(2)))&&
			(Character.isDigit(phoneNumber.charAt(3)))&&
			(phoneNumber.charAt(4)==')')&&
			(Character.isDigit(phoneNumber.charAt(5)))&&
			(Character.isDigit(phoneNumber.charAt(6)))&&
			(Character.isDigit(phoneNumber.charAt(7)))&&
			(phoneNumber.charAt(8)=='-')&&
			(Character.isDigit(phoneNumber.charAt(9)))&&
			(Character.isDigit(phoneNumber.charAt(10)))&&
			(Character.isDigit(phoneNumber.charAt(11)))&&
			(Character.isDigit(phoneNumber.charAt(12)))){
				status=true; //return true;
				
				
			}else {
				status=false;
			}
			return status;

}

	

}
