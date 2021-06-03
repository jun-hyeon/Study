package insertionsort;

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
		Node currentNode = head.nextNode;
		while(currentNode != null) {
			
			Node key = currentNode;
			Node j = head;
	
			while(j!=currentNode) {
				if(key.data < j.data) {
					int temp = key.data;
					key.data = j.data;
					j.data = temp;
				}
				j = j.nextNode;
			}
			currentNode = currentNode.nextNode;
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


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist l1 = new Linkedlist();
		l1.add(2);
		l1.add(1);
		l1.add(7);
		l1.add(6);
		l1.add(4);
		
    	l1.sort();
		l1.printData();
		
	}

}