package practice.linkedlist;

public class MiddleElementInLinkedList {
	Node head;
	public static void main(String[] args) {
		MiddleElementInLinkedList ll = new MiddleElementInLinkedList();
		ll.head= new Node(1);
		ll.insertNodes(ll.head);
		ll.printList();
		ll.findMiddleNode();		
	}
	void insertNodes(Node new_node) {
		for(int i=2;i<10;i++) {
			new_node.next = new Node(i);
			new_node = new_node.next;			
		}
	}
	void printList() {
		Node n = head;
		while(n!= null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	void findMiddleNode() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		while(fast_ptr!=null && fast_ptr.next!=null) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;							
		}
		System.out.println();
		System.out.println("Middle Element is: "+ slow_ptr.data);
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