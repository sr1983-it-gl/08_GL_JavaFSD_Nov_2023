package dsa.bst;

public class BinarySearchTree {

	Node root;
	
	void insert(int value) {
		
		// Root is NULL
			// Create the new-node
			// Make root to point to new-node
		
		// Root is NOT Null
			
			// Create the new-node
			// Call the constructNodeDetails
			
			// Set the relationship between parent-node and the new-node
			// Left - Child / Right-Child
			

		Node newNode = new Node(value);

		if (root == null) {
			root = newNode;
		}else {
			
			NodeInsertionDetails nodeDetails 
				= constructNodeDetails();
			
			// 30
			Node parentNode = nodeDetails.getParentNode();
			
			// RIGHT
			String direction = nodeDetails.getDirection();
			
			if (direction.equals("LEFT")) {
				
				parentNode.setLeft(newNode);
			}else if (direction.equals("RIGHT")) {
				parentNode.setRight(newNode);
			}
		}
		
	}
	
	NodeInsertionDetails constructNodeDetails(){
		
		NodeInsertionDetails nid = new NodeInsertionDetails();
		
		return nid;
	}
}
