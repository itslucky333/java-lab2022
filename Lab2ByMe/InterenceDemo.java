
interface HumanInterface {
    String type ="Human";
    public void study(String qualification);
}

interface AnimalInterface{
    public void eat();
    public void travel();
}

class PersonClass implements AnimalInterface, HumanInterface{

    public void eat(){
        System.out.println("person eats ");
    }
    public void travel(){
        System.out.println("Person travels");
    }
    public void study(String qualification){
        System.out.println(type + " studying " + qualification);
    }
    public int noOflegs(){
        return 0;
    }
    
}


public class InterfaceDemo{
    public static void main (String args[]){
        PersonClass m= new PersonClass();
        m.eat();
        m.travel();
        m.study(qualification: "BESE");
    }
}