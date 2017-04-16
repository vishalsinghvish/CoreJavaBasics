package staticKeyWord;

//A static method belongs to the class rather than object of a class.
//A static method can be invoked without the need for creating an instance of a class.
//static method can access static data member and can change the value of it.

public class Method {
	int studId;
	String studName;
	static String college="NIT";
	
	static void changeCollege(){
		college="IIT";
	}
	
	void student(int id,String name){
		studId=id;
		studName=name;
	}
	
	void display(){
		System.out.println(studId+" "+studName+" "+college);
	}

	public static void main(String[] args) {
		Method s1 = new Method(),s2= new Method();
		s1.student(123, "Billu");
		s1.display();
		// If you write the above line below the next line .. The value of college will be changed
		Method.changeCollege();
		s2.student(987, "Tillu");
		s2.display();
	}

}
