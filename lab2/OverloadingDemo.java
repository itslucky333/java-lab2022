class Calculator{

	public void add(int a, int b){

		int sum= a+b;
		System.out.println("sum of integer a("+a+") and integer b("+b+") : "+ sum);
	}
	
	public void add(int a, double b){

		double sum= a+b;
		System.out.println("sum of int a("+a+") and double b("+b+") : "+ sum);
	}
	public void add(double a, double b){

		double sum= a+b;
		System.out.println("sum of double a("+a+") and double b("+b+") : "+ sum);
	}
	// add overloaded function here
}

public class OverloadingDemo{
	
	public static void main (String[] args) {

		Calculator oc= new Calculator();
		
		oc.add(3,5);//calling the first add() method
		oc.add(3,5.235);//calling the third add() method
		oc.add(3.25,5.25);//calling the second add() method
		oc.add(3.00005,5);//calling the ?? method		
	}
}
// Can we remove some add() function given above without getting errors?
//TO DO: Add overloaded methods like multiply() and subtract() in this code
