// Write two interfaces "AnimalInterface" and "HumanInterface".
// Create a class "PersonClass" to implement the interface. 

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
class PersonClass implements AnimalInterface, HumanInterface{

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
} 

/* File name : InterfaceDemo.java */
public class InterfaceDemo{
   
   public static void main(String args[]){
      PersonClass m = new PersonClass();
      m.eat();
      m.travel();
      m.study("BESE");
   }
}
