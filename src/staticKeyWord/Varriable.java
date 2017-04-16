package staticKeyWord;

public class Varriable {
	int studId;
	String studName;
	String college="KNMIET";
	
	void student(int id, String name){
		studId = id;
		studName  = name;
	}
	
	void display(){
		System.out.println(studId+" "+studName+" "+college);
	}

	public static void main(String[] args) {
		Varriable s1 = new Varriable(), s2 = new Varriable();
		s1.student(500293, "Saurabh");
		s2.student(500294, "Vishal");
		s1.display();
		s2.display();
	}

}
