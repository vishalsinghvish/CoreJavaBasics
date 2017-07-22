package DataStructure.Trees;

public class RunThisBST {

	public static void main(String[] args) {
		BST b=new BST();
		b.insert(50);
		b.insert(25);
		b.insert(30);
		b.insert(15);
		b.insert(75);
		b.insert(85);
		b.inOrder(b.root);
		System.out.println();
		b.preOrder(b.root);
		System.out.println();
		b.postOrder(b.root);
		System.out.println();
		System.out.println(b.remove(15));
		b.postOrder(b.root);
		
	}

}
