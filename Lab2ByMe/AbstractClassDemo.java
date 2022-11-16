abstract class Maps{
    abstract void show();
}

class WebMaps extends Maps{
    void show()
    {
        System.out.println("web maps: Bing map, google map");
    }
}
public class AbstractClassDemo{
    public static void main (String[] args){
        WebMaps w = new WebMaps();
        w.show();
    }
}
