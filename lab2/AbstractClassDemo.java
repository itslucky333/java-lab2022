abstract class Maps{

    abstract void show(); 
}
// The class which inherits this base class  "Maps" must provide 
//the body of show() method, otherwise that sub class will also be abstract.

class WebMaps extends Maps {
    
    void show()
    {
        System.out.println("Web Maps: Bing Map, Google Map");
    }
}


public class AbstractClassDemo{
    
    public static void main (String[] args) {
        
        // Maps m = new Maps();
        // Uncommenting the above statelemt will induce
        // compiler error as it to create an
        // instance of abstract class ( which is illegal).

        WebMaps w = new WebMaps();
        
        w.show();     
        }
}


