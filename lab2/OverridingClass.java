// Inheritance and Overriding, super

class Book{

	int pages ;	 String author;	
	Book(int p,  String a){
		pages=p;	 author = a;		
	}

	void openBook(){ 
		System.out.println ("Parent Class: Opening the book!!!");
	}
	
	void showBookDetails(){ 
		System.out.println ("Author: "+ author+"\t Pages : "+pages );
	}
}

class Java extends Book{
	
	Java(int p, String a){
		super(p,a);	
	}	
	void openBook(){//overrides the method in the super class
		System.out.println ("Child Class: Opening the book: Java!!!");
	}	
}

class OverridingClass{ 

	public static void main(String [] args){		
		Book b= new Book(0,"None");
		b.openBook();		
		b.showBookDetails();
		System.out.println();
		Java j= new Java(234, "Bidur");
		j.openBook();
		j.showBookDetails();			
	} 
 }
