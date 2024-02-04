package dsa.bst;

public class BSTPairFinder {

	BinarySearchTree bst;
	Integer sum;
	
	public BSTPairFinder(BinarySearchTree bst, Integer sum) {
		
		this.bst = bst;
		this.sum = sum;
	}
	
	void findPairs() {
		
		preOrderTraversal();
	}
	
	void preOrderTraversal() {
		
		// Outcome
		// 70, 50, 30, 20, 40, 60, 90, 80, 100
		
		// Pre order Travel
		// TODO
		
		preOrderTraveralInternal(bst.getRoot());
	}
	
	void preOrderTraveralInternal(Node aNode) {
		
		if (aNode == null) {
			return;
		}
		
		System.out.println(aNode);
		
		preOrderTraveralInternal(aNode.getLeft());
		preOrderTraveralInternal(aNode.getRight());
	}
}
