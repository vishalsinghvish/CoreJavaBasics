package DataStructure;

public class RunThisQueue {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.print();
		q.add(0);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.print();
		System.out.println("Removed Element: "+q.remove());
		q.print();
		System.out.println("Removed Element: "+q.remove());
		q.print();
		System.out.println("Removed Element: "+q.remove());
		q.print();
		System.out.println("Removed Element: "+q.remove());
		q.print();
		System.out.println("Removed Element: "+q.remove());
		q.print();
		System.out.println("Removed Element: "+q.remove());
		q.print();
	}

}
