package csc123;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder myBuilder      = new StringBuilder();  //empty string
		StringBuilder otherBuilder   = new StringBuilder(10);//empty string
		StringBuilder myStringBuilder= new StringBuilder("Hello"); //Hello
		
		for(int i = myStringBuilder.length() - 1; i >= 0; i--) {
			System.out.print(myStringBuilder.charAt(i));
		}
		System.out.println();
		
		myBuilder.append(5);   //5 is int
		myBuilder.append(7.0); //7 is double/float
		myBuilder.append(true);
		myBuilder.append('C'); // 'C' is a char
		
		myStringBuilder.append(" There"); //adds to the end
		myStringBuilder.insert(0, "Hi, ");//with index 0, adds to start
		System.out.println(myStringBuilder);
		myStringBuilder.replace(0, 2, "Everyone ");
		
		myStringBuilder.deleteCharAt(1); //deletes 'E'
		
		// Create a String to tokenize.
		String str = "one two three four";
		// Get the tokens from the string.
		String[] tokens = str.split(" ");
		// Display each token.
		
		//Regular for loop implementation

		for(int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		//Enhanced for loop implementation
		for (String i : tokens) {
			System.out.println(i);
		}
		
		
		
		// "0H1i2,3 4"
		
		
		System.out.println(myStringBuilder);
		System.out.println(myBuilder);
		
		//Conversion(StringBuilder -> String)
		String myUpdatedString = myBuilder.toString();
		//Conversion(String -> StringBuilder)
		StringBuilder myNewBuilder = new StringBuilder(myUpdatedString);
	}
}