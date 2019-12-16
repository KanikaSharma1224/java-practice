package practice.linkedlist;

public class InsertAtFront {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;			
		}
	}
	void printlist(){
		Node n = head;
		while(n!= null) {
			System.out.print(n.data+ " ");
			n = n.next;
		}
	}
	void insertNode(Node new_node) {
		new_node.next = head;
		head = new_node;	
	}
	public static void main(String[] args) {
		InsertAtFront ll  = new InsertAtFront();
		ll.head = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth  = new Node(5);
		ll.head.next = third;
		third.next = fourth;
		fourth.next = fifth;
		System.out.print("LinkedList before Insertion:");
		ll.printlist();
		Node new_node = new Node(1);
		ll.insertNode(new_node);
		System.out.println("After Insertion:");
		ll.printlist();
	}

}
