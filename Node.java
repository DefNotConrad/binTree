package binTree;
/**
 * 
 * @author DefNotConrad 
 */
public class Node{
	/**
	 * holds value of node
	 */
	int key;
	/**
	 * holds lesser value child
	 */
	Node leftChild;
	/**
	 * holds higher value child
	 */
	Node rightChild;

	/**
	 * constructor
	 * @param key
	 */
	Node(int key){
		this.key=key;
	}
}
