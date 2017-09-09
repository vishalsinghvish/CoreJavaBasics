package DataStructure;

public class LinkedList<T extends Comparable<T>> {
	Node head;
	public void insert(T data){
		data.compareTo(data);
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
		}else{
			Node iterator= head;
			while(iterator.next!=null){
				iterator=iterator.next;
			}
			iterator.next=newNode;
		}
	}
	
	public void insert(int index,T data){
		Node newNode=new Node(data);
		int i;
		if(index==0){
			newNode.next=head;
			head=newNode;
		}else{
			Node iterator= head;
			Node prv=new Node();
			for(i=0;i<index && iterator!=null;i++){
				prv=iterator;
				iterator=iterator.next;
			}
			if(i==index){
				newNode.next=iterator;
				prv.next=newNode;
			}else{
				System.out.println("Hey ! check the valaues please");
				
			}
		}
	}
	
	public void delete(int index){
		int i;
		if(index==0){
			head=head.next;
		}else{
			Node iterator=head;
			Node prv=iterator;
			for(i=0;i<index && iterator!=null;i++){
				prv=iterator;
				iterator=iterator.next;
			}
			if(i==index){
				prv.next=iterator.next;
			}else{
				System.out.println("Bro.. index out of bound");
			}
		}
		
	}
	
	public void printLinkedList(){
		Node iterator=head;
		while(iterator!=null){
			System.out.print(iterator.data+" ");
			iterator=iterator.next;
		}
		System.out.println();
	}
	public T find(int pos){
		int i;
		if(pos==0){
			return (T) head.data;
		}else{
			Node iterator= head;
			for(i=0;i<pos && iterator!=null;i++){
				iterator=iterator.next;
			}
			if(i==pos){
				return (T) iterator.data;
			}else{
				System.out.println("Hey ! check the valaues please");
				return null;
			}
		}
	}
}
