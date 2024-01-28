package lca;

import java.util.LinkedHashSet;
import java.util.Set;

public class AncestorNodesFinder {

	private Node aNode;
	
	public AncestorNodesFinder(Node aNode) {
	
		this.aNode = aNode;
	}
	
	public Set<Integer> findAncestorNodes() {
		
		Set<Integer> ancestorNodes = new LinkedHashSet<>();
		
		
		Node tempNode = aNode;
		
		while (tempNode != null) {
			
			ancestorNodes.add(tempNode.getData());
			
			Node tempParentNode = tempNode.getParent();
			
			tempNode = tempParentNode;			
		}
		
		return ancestorNodes;
	}
}
