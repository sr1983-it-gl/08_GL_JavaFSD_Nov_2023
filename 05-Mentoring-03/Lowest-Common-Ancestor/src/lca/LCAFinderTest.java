package lca;

import java.util.Set;

public class LCAFinderTest {

	public static void main(String[] args) {
		
		BinaryTree bt = BinaryTreeSample.sampleTree01();
	
//		NodeFinder finder = new NodeFinder(bt, 20);
//		
//		Node node1 = finder.find();
//	
//		System.out.println(node1);
//		
//		AncestorNodesFinder ancestorNodesFinder	
//			= new AncestorNodesFinder(node1);
//		Set<Integer> ancestorNodes1 = 
//			ancestorNodesFinder.findAncestorNodes();
//		System.out.println(ancestorNodes1);
		
		LCAFinder lcaFinder = new LCAFinder(bt, 20, 40);
		
		Integer lca = lcaFinder.find();
		System.out.println(lca);
	}
}
