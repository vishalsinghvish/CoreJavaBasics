package DataStructure;

public class RunThisStack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push("7");
		s.print();
		System.out.println("Poped out: "+s.pop());
		s.print();
		System.out.println("Poped out: "+s.pop());
		s.print();
		System.out.println("Poped out: "+s.pop());
		s.print();
		System.out.println("Poped out: "+s.pop());
		s.print();
		System.out.println("Poped out: "+s.pop());
		s.print();
		System.out.println("Poped out: "+s.pop());
		s.print();
	}

}
