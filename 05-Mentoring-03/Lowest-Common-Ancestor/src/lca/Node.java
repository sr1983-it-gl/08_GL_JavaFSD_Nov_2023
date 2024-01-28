package lca;

public class Node {

	private Integer data;
	private Node left;
	private Node right;
	private Node parent;
	
	public Node(Integer data) {
		
		this.data = data;
	}
	
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	
	public String toString() {
		
		return String.format("[%d]", data);
	}
	
}
