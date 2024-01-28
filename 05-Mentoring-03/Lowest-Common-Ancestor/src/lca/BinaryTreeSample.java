package lca;

public class BinaryTreeSample {

	public static BinaryTree sampleTree01() {
		
		Node _40 = new Node(40);
		
		Node _50 = new Node(50);

		Node _60 = new Node(60);

		Node _70 = new Node(70);

		// 20
		Node _20 = new Node(20);
		_20.setLeft(_40);
		_20.setRight(_50);
		
		_40.setParent(_20);
		
		_50.setParent(_20);
		
		// 30
		Node _30 = new Node(30);
		_30.setLeft(_60);
		_30.setRight(_70);
		
		_60.setParent(_30);
		
		_70.setParent(_30);
		
		// 10
		Node _10 = new Node(10);
		_10.setLeft(_20);
		_10.setRight(_30);
		
		_20.setParent(_10);
		
		_30.setParent(_10);
		
		BinaryTree bt = new BinaryTree(_10);
		return bt;		
	}
}
