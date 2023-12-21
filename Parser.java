package AssemblyProject;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
	private Scanner scanner;
    private String currentCommand;

    public Parser(String files) throws FileNotFoundException {
        File file=new File(files);
        scanner=new Scanner(file);
    }

    public boolean hasMoreCommand(){
        return scanner.hasNextLine();
    }

    public void advance(){
        currentCommand = scanner.nextLine().trim();
        // remove the comments
        if(currentCommand.contains("//")){
            currentCommand=currentCommand.substring(0, currentCommand.indexOf("//")).trim();
        }
    }

    public String commandType(){
        if(currentCommand.startsWith("@")){
            return "A_COMMAND";
        }else if (currentCommand.startsWith("(")) {
            return "L_COMMAND";
        }else if (!currentCommand.isEmpty()) {
            return "C_COMMAND";
        }else{
            return ""; 
        }
    }

    public String symbol() {
    	if (commandType().equals("A_COMMAND")){
            if (currentCommand.startsWith("@")) {
                return currentCommand.substring(1);
            }else{
                return currentCommand.substring(1, currentCommand.length());
            }
    	} else if (commandType().equals("L_COMMAND")) {
            return currentCommand.substring(1, currentCommand.length() - 1);
        }
        return null;
    }

    public String dest(){
        if (commandType().equals("C_COMMAND") && currentCommand.contains("=")) {
            return currentCommand.split("=")[0];
        }
        return null;
    }

    public String comp(){
        if (commandType().equals("C_COMMAND") && currentCommand.contains("=")) {
            return currentCommand.split("=")[1];
        } else if (commandType().equals("C_COMMAND") && currentCommand.contains(";")) {
            return currentCommand.split(";")[0];
        }
        return null;
    }

    public String jump(){
        if (commandType().equals("C_COMMAND") && currentCommand.contains(";")) {
            return currentCommand.split(";")[1];
        }
        return null;
    }
}
