class Maps{
    void show()
    {
        System.out.println("Maps");
    }
}

class WebMaps extends Maps{
    void show()
    {
        System.out.println("Web maps : Bing Map, Google map");
    }
}

class PaperMaps extends Maps{
    void show()
    {
        System.out.println("paper map: all maps printed in paper ");
    }
}

public class RunTimePolyDemo{
    public static void main(String [] args){
        Maps m = new Maps();
        WebMaps w = new WebMaps();
        PaperMaps p = new PaperMaps();
        m=w; 
        m.show();
        m=p;
        m.show();
    }
}