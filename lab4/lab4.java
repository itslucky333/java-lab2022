Java LAB 4
Bidur Devkota
GCES 2015

/*1. Example for User Defined Exception class */

class NonGCESException extends Exception{  
	NonGCESException(String s){  
	super(s);  
 }  
}  

class TestCustomException1{  
  
   static void checkStudent(String collage)throws NonGCESException{  
     if( collage != "GCES")  
      throw new NonGCESException(" not a GCES buddy");  
     else  
      System.out.println("welcome to GCES");  
   }  
     
   
public static void main(String args[]){  
	   
      try{  
			checkStudent("PEC");  
      }
      catch(Exception e){
			System.out.println("Exception occured: "+ e);
	  }  
  
      System.out.println("END");  
  }  
}  


/*2. Write a program to input a integer and string from keyboard and print then on the  console .  Use exception handling as well .  */

import java.io.*;
public class ConsoleData {	

	public int getInt() {
	
	System.out.println("Write an integer:");
    String line = null;
    int val = 0;
    try {
      BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
      line = is.readLine();
      val = Integer.parseInt(line);
    } catch (NumberFormatException ex) {
      System.err.println("Not a valid number: " + line);
    } catch (IOException e) {
      System.err.println("Unexpected IO ERROR: " + e);
    }
    return val;
  }	
	
	public String getString(){
		
	    System.out.println("Write an String:");
	    String strValue; 
	    try {	   
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      strValue = br.readLine();	  
	    } catch (IOException e) {
	      strValue="";
	    }	    
		return strValue ;
	}

  public static void main(String[] args) {	
	ConsoleData c=new ConsoleData();
	System.out.println(" String: " + c.getString());
	System.out.println(" Integer: " + c.getInt());  
  }   
}
//  Add additional code in the above program to read data of type Float as well.

/* 3. Write a program to open a file name input.txt and copy its content to another file output.txt */
import java.io.*; 
public class Copy { 
    public static void main(String[] args) throws IOException { 
        File inputFile = new File("input.txt"); 
        File outputFile = new File("outagain.txt"); 
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

/*4. Object Serialization: The object of class Student is serialized and kept into Student.ser file. Next, the file is read and the deserialization is done to obtain the original object.
Observe the behaviour of the transient variable used in the program.
*/
// Student.java   
public class Student implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int regNum;
   public int number;
   public void mailResult()
   {
      System.out.println("Result of " + name  + " " );
   }
}

//SerializeDemo.java
import java.io.*;
public class SerializeDemo
{
   public static void main(String [] args)
   {
      Student e = new Student();
      e.name = "Tom Swayer";
      e.address = "Pokhara, Nepal";
      e.regNum = 123456;
      e.number = 101;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("Student.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved as Student.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}

//DeserializeDemo.java
import java.io.*;
public class DeserializeDemo
{
   public static void main(String [] args)
   {
      Student e = null;
      try
      {
         FileInputStream fileIn = new FileInputStream("Student.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Student) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Student class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Student...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("Reg Num: " + e.regNum);
      System.out.println("Number: " + e.number);
    }
}


/*
5.  Write two interfaces in java. Create a class to implement the interface. 
*/

/* File name : HumanInterface.java */
interface HumanInterface {
   String type ="Human"; // constant
   public void study(String qualification);
   
}

/* File name : AnimalInterface.java */
interface AnimalInterface {

   public void eat();
   public void travel();
}

/* File name : PersonClass.java */
public class PersonClass implements AnimalInterface, HumanInterface{

   public void eat(){
      System.out.println("Person eats");
   }

   public void travel(){
      System.out.println("Person travels");
   } 
   
    public void study(String qualification){
      System.out.println(type +" studying " + qualification);
   } 

   public int noOfLegs(){
      return 0;
   }

   public static void main(String args[]){
      PersonClass m = new PersonClass();
      m.eat();
      m.travel();
      m.study("BE");
   }
} 







