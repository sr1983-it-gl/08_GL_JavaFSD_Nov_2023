package lca;

import java.util.Iterator;
import java.util.Set;

public class LCAFinder {

	private BinaryTree binaryTree;
	private Integer n1;
	private Integer n2;
	
	public LCAFinder(BinaryTree binaryTree, 
		Integer n1, Integer n2) {
	
		this.binaryTree = binaryTree;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	public Integer find() {
		
		NodeFinder nodeFinder1 = new NodeFinder(binaryTree, n1);		
		Node node1 = nodeFinder1.find();

		NodeFinder nodeFinder2 = new NodeFinder(binaryTree, n2);		
		Node node2 = nodeFinder2.find();
		
		
		AncestorNodesFinder ancestorNodesFinder1	
			= new AncestorNodesFinder(node1);
		Set<Integer> ancestorNodes1 = 
			ancestorNodesFinder1.findAncestorNodes();
		System.out.println(ancestorNodes1);

		AncestorNodesFinder ancestorNodesFinder2	
			= new AncestorNodesFinder(node2);
		Set<Integer> ancestorNodes2 = 
				ancestorNodesFinder2.findAncestorNodes();
		System.out.println(ancestorNodes2);
		
		Set<Integer> biggerNodeSet;
		Set<Integer> smallerNodeSet;
		
		// 
		if (ancestorNodes1.size() >= ancestorNodes2.size()) {
			
			biggerNodeSet = ancestorNodes1;
			smallerNodeSet = ancestorNodes2;
		}else {

			biggerNodeSet = ancestorNodes2;
			smallerNodeSet = ancestorNodes1;			
		}
		
		Integer leastCommonAncestor = null;
		
		Iterator<Integer> biggerNodeSetIterator 
			= biggerNodeSet.iterator();
		while (biggerNodeSetIterator.hasNext()) {
			
			Integer bigElement = biggerNodeSetIterator.next();
			
			if (smallerNodeSet.contains(bigElement)) {
			
				leastCommonAncestor = bigElement;
				break;
			}
		}
		
		return leastCommonAncestor;
	}
	
}
