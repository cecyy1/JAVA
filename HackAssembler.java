package AssemblyProject;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HackAssembler {
	public static void main(String[] args) throws IOException {

        String inputFilePath =args[0];
        String outputFilePath= inputFilePath.replace(".asm", ".hack");

        
            Parser parser=new Parser(inputFilePath);
            PrintWriter writer=new PrintWriter(new FileWriter(outputFilePath));

            SymbolTable symbolTable=new SymbolTable();

            // First Pass: Build the symbol table
            int romAddress=0;
            while(parser.hasMoreCommand()){
                parser.advance();
                if(parser.commandType().equals("L_COMMAND")){
                    // Handle label commands (pseudo-commands) by adding to the symbol table
                    symbolTable.addEntry(parser.symbol(), romAddress);
                } else{
                    romAddress++;
                }
            }

            // Second Pass: Translate the commands
            parser=new Parser(inputFilePath); // Reset the parser
            while(parser.hasMoreCommand()){
                parser.advance();
                String commandType=parser.commandType();
                if("A_COMMAND".equals(commandType)){
                    // A_COMMAND logic
                    String symbol=parser.symbol();
                    if(!Character.isDigit(symbol.charAt(0))){
                        // Symbolic A-instruction, look up in symbol table or add to it
                        if (!symbolTable.contains(symbol)) {
                            int address=symbolTable.getNextAvailableAddress();
                            symbolTable.addEntry(symbol, address);
                        }
                        symbol=Integer.toString(symbolTable.getAddress(symbol));
                    }
                    writer.println("0" + toBinary(symbol));
                } else if("C_COMMAND".equals(commandType)){
                    // C_COMMAND logic
                    writer.println("111" + Code.comp(parser.comp()) + Code.dest(parser.dest()) + Code.jump(parser.jump()));
                } else if("L_COMMAND".equals(commandType)){
                    // L_COMMAND logic
                    // Handle label commands (pseudo-commands) by adding to the symbol table
                    symbolTable.addEntry(parser.symbol(), romAddress);
                }
                romAddress++;
            }


            writer.close();
	}

    private static String toBinary(String decimal){
    	  int value=Integer.parseInt(decimal);
    	    return String.format("%15s", Integer.toBinaryString(value)).replace(' ', '0');
    	}
}
