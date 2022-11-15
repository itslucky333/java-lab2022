import myPackage.Foods;
 
public class Vegetables {

    public static void main(String args[])
    {
        Foods obj = new Foods();
        obj.show();
        int id = obj.getFoodID();
        String name = obj.getFoodName();
        System.out.println("\n Setting ID & Name : ");
        obj.setFoodID(id, name);
        
    }
}
