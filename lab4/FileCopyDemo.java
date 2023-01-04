//After you've run the program, you should find an exact copy of  inputFile.txt in a file named outputFile.txt in the same directory.

import java.io.*; 
public class FileCopyDemo { 

    public static void main(String[] args) throws IOException { 

        File inputFile = new File("inputFile.txt"); 
        File outputFile = new File("outputFile.txt"); 

        FileReader in = new FileReader(inputFile); 
      
	  FileWriter out = new FileWriter(outputFile); 
        int c; 

        while ((c = in.read()) != -1) { 
            out.write(c); 
        } 
        in.close(); 
        out.close(); 
    } 
} 
