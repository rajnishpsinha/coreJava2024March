package data.structure;

public class LinkedList {
	Node start = new Node();

	public void addLinkedList(String inputString) {

		Node node = new Node();
		node.setName(inputString);
		node.setNode(null);
		if (this.start.getNode() == null) {
			this.start.setNode(node);
		} else {
			Node lastNode = this.start.getNode();

			while (lastNode.getNode() != null) {
				lastNode = lastNode.getNode();
			}
			lastNode.setNode(node);
		}
	}

	public void display() {
		if (this.start.getNode() != null) {
			Node nextNode = this.start.getNode();
			System.out.println(nextNode.getName());

			do {
				nextNode = nextNode.getNode();
				System.out.println(nextNode.getName());
			} while (nextNode.getNode() != null);
		}

	}

	public void remove(String removeString) {

		if (this.start.getNode() != null) {
			Node previousNode = this.start;
			Node nextNode = previousNode.getNode();

			do {
				if (nextNode.getName().equalsIgnoreCase(removeString)) {
					previousNode.setNode(nextNode.getNode());
					break;

				} else {
					previousNode = nextNode;
					nextNode = previousNode.getNode();

				}
			} while (nextNode.getNode() != null);

			if (nextNode.getNode() == null) {
				/* checking for last node */
				if (nextNode.getName().equalsIgnoreCase(removeString)) {
					previousNode.setNode(null);

				}
			}
		}
	}

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.addLinkedList("Ramesh");
		linkedList.addLinkedList("Ajay");
		linkedList.addLinkedList("Suresh");
		linkedList.addLinkedList("Ashwini");
		linkedList.display();
		System.out.println("------------");
		linkedList.remove("Ramesh");
		linkedList.display();
		System.out.println("------------");
		linkedList.addLinkedList("Rajesh");
		linkedList.display();

	}

}
