package data.structure;

public class CircularLinkedList {
	Node start = new Node();
	

	public void addLinkedList(String inputString) {

		Node node = new Node();
		node.setName(inputString);
		node.setNode(null); 
		 
		 if(this.start.getNode()==null){
			 start =node;
			 node.setNode(node);
		 }
		 else{
			Node lastNode = this.start.getNode();

			while( !(lastNode.getNode() .equals(start))) {
				lastNode = lastNode.getNode();
			}
			lastNode.setNode(node);
			node.setNode(this.start);
		 }
		
	}

	public void display() {
		  
		if(this.start==null)
		{
			System.out.println("Circular list is empty");
		}
		else{
			Node nextNode = this.start;
			System.out.println(nextNode.getName());
			do {				
				nextNode = nextNode.getNode();
				System.out.println(nextNode.getName());
			} while (!(nextNode.getNode() .equals(this.start) ));
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
			} while (!(nextNode.getNode() .equals(this.start)));

			if (nextNode.getNode().equals(this.start)) {
				/* checking for last node */
				if (nextNode.getName().equalsIgnoreCase(removeString)) {
					previousNode.setNode(this.start);

				}
			}
		}
	}

	public static void main(String[] args) {
		CircularLinkedList linkedList = new CircularLinkedList();
		linkedList.addLinkedList("Ramesh");
		linkedList.addLinkedList("Ajay");
		linkedList.addLinkedList("Suresh");
		linkedList.addLinkedList("Ashwini");
		linkedList.addLinkedList("Krishan");
		System.out.println(linkedList);
		linkedList.display();
		System.out.println("------------");
	   linkedList.remove("Krishan");
		linkedList.display();
		System.out.println("------------");
		linkedList.addLinkedList("Rajesh");
		linkedList.display();

	}

}
