package DataStructure.Trees;

public class Node<T> {
	T data;
	Node left;
	Node right;
	
	public Node(){
		
	}
	public Node(T data){
		this.data=data;
	}
	public Node(T data,Node left,Node right){
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
