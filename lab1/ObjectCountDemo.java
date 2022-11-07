/*
Write a program to count the number of instances of a class using class variable(i.e. static variable).
Next, observe the use of finalize keyword with the static variable,
Author: Bidur Devkota
	Lecturer, GCES
Compile: <javac ObjectCountDemo.java>
Run: <java ObjectCountDemo>
*/


class SampleClass {
	
	// Set count to zero initially.
	static int count = 1;
	float data;
	
	
	public SampleClass() {
		
		// increment the count on each call to the constructor via any instance
		count = count + 1;
		
		System.out.print(" number: " + count);
	}
}

public class ObjectCountDemo {
	
	public static void main(String[] args) {
		SampleClass stuff1 = new SampleClass();
		stuff1.data = SampleClass.count;
		SampleClass stuff2 = new SampleClass();
		stuff2.data = SampleClass.count;
		stuff2.data +=  stuff1.data;
		System.out.println(" Final Data: " + stuff2.data +" "+ stuff1.data );
		
	}

}
