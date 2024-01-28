package lca;

public class NodeFinder {

	private BinaryTree bt;
	private Integer value;
	private Node resultNode;
	
	public NodeFinder(BinaryTree bt, Integer value) {
		
		this.bt = bt;
		this.value = value;		
	}
	
	public Node find() {
		
		findInternal(bt.getRoot());
		return resultNode;
	}
	
	private void findInternal(Node aNode) {
		if (aNode != null) {

//			System.out.println(aNode);

			if (aNode.getData() == value) {
				this.resultNode = aNode;
				return;
			}			
			findInternal(aNode.getLeft());
			findInternal(aNode.getRight());					
		}		
	}
}
