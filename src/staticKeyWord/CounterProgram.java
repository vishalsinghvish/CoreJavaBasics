package staticKeyWord;

public class CounterProgram {
	static int count = 0;
	// If you remove static keyword output will be 1
	void counter(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		CounterProgram c1 = new CounterProgram(),c2 =new CounterProgram(),c3=new CounterProgram();
		c1.counter();
		c2.counter();
		c3.counter();
	}

}
