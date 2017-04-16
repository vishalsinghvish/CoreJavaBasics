package staticKeyWord;

//Is used to initialize the static data member.
//It is executed before main method at the time of classloading.

public class StaticBlock {
	
	static{
		System.out.println("This is static block so will execute first");
	}

	public static void main(String[] args) {
		System.out.println("This is main method block");
	}

}
