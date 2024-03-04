package data.structure;

public class Node{
	String name;
	Node node;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Node getNode() {
		return node;
	}	
	public void setNode(Node node) {
		this.node = node;
	}
}