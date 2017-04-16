package thisKeyword;

public class CurrentClassObject {
	
	void method1(){
		System.out.println("This is Method1.");
	}
	
	void method2(){
		System.out.println("This is Method2.");
		this.method1();
	}

	public static void main(String[] args) {
		CurrentClassObject obj1 = new CurrentClassObject();
		obj1.method2(); //  If you don't use the this keyword, compiler automatically adds this keyword while invoking the method.
	}

}
