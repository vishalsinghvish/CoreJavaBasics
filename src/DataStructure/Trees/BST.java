package DataStructure.Trees;

public class BST<T> {
	Node root=null;
	
	public void insert(T data){
		Node newNode=new Node(data);
		if(root==null){
			root=newNode;
		}else{
			Node iterator=root;
			Node prv=new Node();
			while(true){
				prv=iterator;
				if((int)data < (int)iterator.data){
					if(iterator.left==null){
						iterator.left=newNode;
						return;
					}
					iterator=iterator.left;
				}else{
					if(iterator.right==null){
						iterator.right=newNode;
						return;
					}
					iterator=iterator.right;
				}
			}
		}
	}
	public void inOrder(Node root){
		if(root!=null){
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public void preOrder(Node root){
		if(root!=null){
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void postOrder(Node root){
		if(root!=null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public boolean remove(int key){
		Node iterator=root;
		Node prv=iterator;
		boolean isNodeLeft=true;
		while((int)iterator.data!=key){
			prv=iterator;
			if((int)iterator.data<key){
				iterator=iterator.left;
				isNodeLeft=true;
			}else{
				iterator=iterator.right;
				isNodeLeft=false;
			}
			if(iterator==null){
				return false;
			}
		}
		if(iterator.right==null && iterator.left==null){
			if(iterator==root){
				root=null;
			}else if(isNodeLeft=true){
				prv.left=null;
			}else if(isNodeLeft=false){
				prv.right=null;
			}
		}else if(iterator.right==null){
			if(iterator==root){
				root=root.left;
			}else if(isNodeLeft){
				prv.left=iterator.left;
			}else{
				prv.right=iterator.left;
			}
		}else if(iterator.left==null){
			if(iterator==root){
				root=root.right;
			}else if(isNodeLeft){
				prv.left=iterator.right;
			}else{
				prv.right=iterator.right;
			}
		}
		else{
			Node replacement=getReplacementNode(iterator);
			if(iterator==root){
				root=replacement;
			}else if(isNodeLeft){
				prv.left=replacement;
			}else{
				prv.right=replacement;
			}
			replacement.left=iterator.left;	
			
		}
		return true;
	}
	public Node getReplacementNode(Node replaceNode) {
		Node ReplacementParent=replaceNode;
		Node replacement=replaceNode;
		Node iterator=replaceNode.right;
		
		while(iterator!=null){
			ReplacementParent=replacement;
			replacement=iterator;
			iterator=iterator.left;
		}
		
		if(replacement != replaceNode.right){
			ReplacementParent.left=replacement.right;
			replacement.right=replaceNode.right;
		}
		return replacement;

	}
}
