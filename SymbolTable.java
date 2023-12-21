package AssemblyProject;

import java.util.HashMap;

public class SymbolTable {
	private HashMap<String, Integer> symbolTable;
    private int nextAvailableAddress;

    public SymbolTable() {
        symbolTable=new HashMap<>();
        initialize();
        nextAvailableAddress=16; // Start with the next available address after predefined symbols
    }

    private void initialize(){
        // Add predefined symbols
        symbolTable.put("SP",0);
        symbolTable.put("LCL",1);
        symbolTable.put("ARG",2);
        symbolTable.put("THIS",3);
        symbolTable.put("THAT",4);
        for (int i=0; i<=15; i++) {
            symbolTable.put("R" + i, i);
        }
        symbolTable.put("SCREEN",16384);
        symbolTable.put("KBD",24576);
    }

    public void addEntry(String symbol, int address) {
        symbolTable.put(symbol, address);
    }

    public boolean contains(String symbol) {
        return symbolTable.containsKey(symbol);
    }

    public int getAddress(String symbol) {
        return symbolTable.get(symbol);
    }

    public int getNextAvailableAddress() {
        int address = nextAvailableAddress;
        nextAvailableAddress++;
        return address;
    }


}
