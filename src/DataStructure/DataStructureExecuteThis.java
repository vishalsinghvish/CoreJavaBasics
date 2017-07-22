package DataStructure;

public class DataStructureExecuteThis {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insert(1);
		l.insert(2);
		l.insert(3);
		l.insert(4);
		l.insert(5);
		l.insert(6);
		l.insert("abhi");
		l.printLinkedList();
		System.out.println(l.find(2));
		System.out.println(l.find(1));
		System.out.println(l.find(10));
		l.insert(0, 0);
		l.printLinkedList();
		l.insert(3, 10);
		l.printLinkedList();
		l.delete(3);
		l.printLinkedList();
	}

}
