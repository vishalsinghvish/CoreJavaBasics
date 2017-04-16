package staticKeyWord;

//The static method can not use non static data member or can not call non-static method directly.
//this and super cannot be used in static context.

public class Restriction {
	int a= 50;  // not Static

	void message(){
	System.out.println("This msg can't be printed.");	
	}
	
	public static void main(String[] args) {
		//****** uncomment the below lines 
//		System.out.println(a);
//		restriction.message();
	}

}
