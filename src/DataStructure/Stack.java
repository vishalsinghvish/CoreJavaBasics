package DataStructure;

public class Stack<T> {
	Node head =null;
	public void push(T data){
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
	public T pop(){
		Node iterator=head;
		if(head==null){
			System.out.println("Stack is Empty");
			return null;
		}else{
			Node prv=new Node();
			while(iterator.next!=null){
				prv=iterator;
				iterator=iterator.next;
			}
			if(iterator==head){
				head=null;
				return (T) iterator.data;
			}else{
				prv.next=null;
				return (T)iterator.data;
			}
		}
	}
	public void print(){
		Node iterator=head;
		if(iterator==null){
			System.out.println("Told you..! stack is Empty");
		}
		while(iterator!=null){
			System.out.print(iterator.data+" ");
			iterator=iterator.next;
		}
		System.out.println();
	}
}
