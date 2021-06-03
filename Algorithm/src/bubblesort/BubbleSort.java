package bubblesort;

class Node{
	int data;
	Node nextNode;
	
	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}
	
	public int getData() {
		return this.data;
	}
	
}

class Linkedlist{
	public Node head;
	public int length;
	
	public Linkedlist() {
		this.head = null;
		this.length = 0;
	}
	
	public void add(int data) {
		Node node = new Node(data);
		if(length == 0) {
			this.head = node;
		}else {
			Node currentNode = head;
			while(currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = node;
		}
		length++;
	}
	
	public void sort() {
		if(length > 1) {
			for(int i = 0; i < length; i++) {
				Node currentNode = head;
				Node next = head.nextNode;
				for(int j = 0; j < length-1; j++) {
					if(currentNode.data > next.data) {
					int temp = currentNode.data;
                    currentNode.data = next.data;
                    next.data = temp;
				}
				  currentNode = next;
	              next = next.nextNode; 
			}
		  }	
		}
	}
	
	public void printData() {
		Node currentNode = head;
		while(currentNode  != null) {
			int data = currentNode.getData();
			System.out.println(data);
			currentNode = currentNode.nextNode;
		}
	}
	
}


public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist l1 = new Linkedlist();
		l1.add(2);
		l1.add(1);
		l1.add(9);
		l1.add(6); 
		l1.add(8);
		
	    l1.sort();
		l1.printData();
		
	}

}
