package thisKeyword;

//Here is given the 6 usage of java this keyword.
//this can be used to refer current class instance variable.
//this can be used to invoke current class method (implicitly)
//this() can be used to invoke current class constructor.
//this can be passed as an argument in the method call.
//this can be passed as argument in the constructor call.
//this can be used to return the current class instance from the method.

//parameters (formal arguments) and instance variables are same.
//So, we are using this keyword to distinguish local variable and instance variable.

public class InstanceVariable {
	
	int id;
	String name;
	double fee;
	
	void student(int id, String name, double fee){
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	
	void display(){
		System.out.println(id+" "+name+" "+fee);
	}

	public static void main(String[] args) {
		InstanceVariable s1 = new InstanceVariable(), s2 = new InstanceVariable();
		s1.student(23, "Mintu", 23234.50);
		s2.student(21, "Bitto", 12323.21);
		s1.display();
		s2.display();
	}

}
