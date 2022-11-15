class Maps{

	void show()
    {
        System.out.println("Maps");
    }
}

class WebMaps extends Maps {
    void show()
    {
        System.out.println("Web Maps: Bing Map, Google Map");
    }
}


class  PaperMaps extends Maps {
    void show()
    {
        System.out.println("Paper Maps: All Maps printed on paper");
    }
}

public class RunTimePolyDemo{

	public static void main (String[] args) {

        // We can have references of Maps type.
        Maps m = new Maps(); 
        WebMaps w = new WebMaps();
        PaperMaps p = new PaperMaps();
        
        m = w ; // upcasting
        m.show();
        
        m = p; // upcasting
        m.show(); 
        // the show() method is called via the reference variable of the 
        //Parent class. Since it refers to the subclass object and subclass 
        // method overrides the Parent class method, the subclass method 
        // is invoked at runtime.
        //Each time during the call of show() method (e.g line 35 or line 38 ),
        // which method gets executed (show() mehtod in Maps, WebMaps or PaperMaps) 
        // depends on the type of the object being referred to at the time of the 
        // call (i.e. during runtime):
	}
}

//Runtime polymorphism is also known as Dynamic Method Dispatch.
// Here, call to an overridden method is resolved at runtime ( NOT at compile-time).
// During Runtime polymorphism, an overridden method is invoked via the reference variable of a superclass. 
// The object being referred by the reference variable determines which method will be called.
// Here, the method invocation is determined by the JVM and not by the compiler, it is the case of runtime polymorphism.


