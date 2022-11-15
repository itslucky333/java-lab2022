// Pagkages: to encapsulate a group of classes, interfaces, and sub-packages
//  It is a container of a group of related classes where some classes are made public and others are not exposed.
/* File name : myPackage/Foods.java */
package myPackage;	// if we omit the package statement, the class names are put into the default package, which has no name.

import java.util.Scanner;

public class Foods {
	
	protected String foodName;
	protected int foodID;

	public void show()
	{
		System.out.println("Show method in Food Class");
	}
	
	public int getFoodID()
	{	
		int id;
		Scanner b = new Scanner (System.in);
		System.out.print("Enter id: ");
		id = Integer.parseInt( b.nextLine() );
		return(id);
	}
	
	public String getFoodName()
	{
		String  name;
		Scanner b = new Scanner (System.in);
		System.out.print("Enter Food Name: ");
		name =  b.nextLine() ;
		return(name);
		
	}
	
	public void setFoodID(int fID, String fName){
		
		this.foodName = fName;
		this.foodID = fID;
		System.out.println( this.foodID  +": "+  this.foodName   );
	}
}
