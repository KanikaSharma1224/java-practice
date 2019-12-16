package practice.linkedlist;

public class InsertAtEnd {
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next =null;
		}
	}
	Node head;
	void printList() {
		Node n = head;
		while(n!= null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
		void insertNode(Node new_node) {
			Node temp = head;
			while(temp.next!= null) {
				temp = temp.next;
			}
			temp.next = new_node;	
	}
	public static void main(String[] args) {
		InsertAtEnd iae = new InsertAtEnd();
		iae.head = new Node(1);
		Node second = new Node(2);
		Node third  = new Node(3);
		Node fourth = new Node(4);
		Node fifth  = new Node(5);
		Node sixth  = new Node(6);
		Node seventh = new Node(7);
		iae.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		System.out.println("Before Insertion: ");
		iae.printList();
		iae.insertNode(seventh);
		System.out.println("++++");
		System.out.println();
		System.out.println("After Insertion: ");
		iae.printList();
	}

}
