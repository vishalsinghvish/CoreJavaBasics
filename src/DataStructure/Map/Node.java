package DataStructure.Map;

public class Node<T> {
	int key;
	T value;
	Node next;
	public Node(int key,T value,Node next){
		this.value=value;
		this.next=next;
		this.key=key;
	}
	public Node(int key,T value){
		this.key=key;
		this.value=value;
		this.next=null;
	}
	public Node(){
		
	}
}
