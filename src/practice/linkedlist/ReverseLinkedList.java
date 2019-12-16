package practice.linkedlist;

public class ReverseLinkedList {
	Node head;
	public static void main(String[] args) {
		ReverseLinkedList ll = new ReverseLinkedList();
		ll.head= new Node(1);
		ll.insertNodes(ll.head);
		ll.printList();
		ll.reverseTheList();
		System.out.println();
		System.out.println("Printing the reverse list :");
		ll.printList();
		
	}
	void insertNodes(Node new_node) {		
		for(int i=2;i<11;i++) {
			new_node.next = new Node(i);
			new_node = new_node.next;
		}
	}
	void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	void reverseTheList() {
		Node previous= null;
		Node next = null;
		Node current  = head;
		while(current!=null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;		
		}
		head = previous;
	}
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	

}
