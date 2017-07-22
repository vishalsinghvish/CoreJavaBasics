package DataStructure;

public class Queue<T> {
	Node head=null;
	
	public void add(T data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
		}else{
			Node iterator=head;
			while(iterator.next!=null){
				iterator=iterator.next;
			}
			iterator.next=newNode;
		}
	}
	
	public T remove(){
		Node n=head;
		head=head.next;
		return (T) n.data;
	}
	
	public void print(){
		Node iterator=head;
		if(iterator==null){
			System.out.println("Queue is Empty");
		}
		while(iterator!=null){
			System.out.print(iterator.data+" ");
			iterator=iterator.next;
		}
		System.out.println();
	}
}
