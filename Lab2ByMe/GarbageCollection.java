import java.util.*;

class GarbageCollection{
public static void main(String args[]) throws Exception
{
    Runtime rs = Runtime.getRuntime();
    System.out.println(" Free memory in JVM before Garbage collection = " +rs.freeMemory());
    rs.gc();
    System.out.println("Free memory in JVM after Garbage collection = "+ rs.freeMemory());
}
}
