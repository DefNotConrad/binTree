package binTree;

/**
 * @author Britain Mackenzie
 * @author A00561831
 */
public class BinTree implements IBinTree {
	/**
	 * holds tree root value
	 */
	Node root;
	
	/**
	 * Adds node to binary tree
	 * 
	 *Saves value to root if initial node
	 *If smaller value assigned to left child
	 *and larger values assigned to right child 
	 *
	 *@param Node object
	 */
	public void insertNode(Node newNode) {
		
		if (root==null) {
			root=newNode;
		}
		else {
			Node focusNode = root;
			Node parent;
		
			while(true) {
				parent = focusNode;
			
				if(newNode.key<focusNode.key) {
					focusNode=focusNode.leftChild;
				
					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					}	
				}
				else {
					focusNode=focusNode.rightChild;
					if(focusNode == null) {
							parent.rightChild = newNode;
							return;
					}
				}
			}
		}
	}
	
	/**
	 * Initializes treeWalk to root input value if no parameter
	 */
	public void treeWalk() {
		treeWalk(root);
	}
	
	/**
	 * traverses tree and prints keys in increasing order
	 * @param Node object
	 */
	public void treeWalk(Node focusNode) {
		if(focusNode != null) {
			treeWalk(focusNode.leftChild);
			
			System.out.println(focusNode.key);
			
			treeWalk(focusNode.rightChild);
		}
		
	}		
	
	/**
	 * solely for testing classes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		//testcase2
		System.out.println();
		System.out.println("testcase 1:");
		BinTree binTree2 = new BinTree();
		binTree2.insertNode(new Node(3));
		binTree2.insertNode(new Node(201));
		binTree2.insertNode(new Node(60));
		binTree2.insertNode(new Node(30));
		binTree2.insertNode(new Node(45));
		binTree2.treeWalk();
		
		// testcase 3
				System.out.println();
				System.out.println("testcase 2_1:");
				BinTree binTree3 = new BinTree();
				binTree3.insertNode(new Node(-10));
				binTree3.insertNode(new Node(-150));
				binTree3.insertNode(new Node(4));
				binTree3.insertNode(new Node(300));
				binTree3.insertNode(new Node(45));
				binTree3.treeWalk();
				binTree3.insertNode(new Node(-50));
				binTree3.insertNode(new Node(200));
				System.out.println();
				System.out.println("testcase 2_2:");
				binTree3.treeWalk();
	}

}
