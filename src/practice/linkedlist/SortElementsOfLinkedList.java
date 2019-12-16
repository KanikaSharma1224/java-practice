package practice.linkedlist;

public class SortElementsOfLinkedList {
	Node head;
	public static void main(String[] args) {
		SortElementsOfLinkedList sortelements = new SortElementsOfLinkedList();
		sortelements.head = new Node(7);
		Node node2 = new Node(3);
		Node node3 = new Node(6);
		Node node4 = new Node(11);
		Node node5 = new Node(2);
		Node node6 = new Node(4);
		sortelements.head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		sortelements.printList();
		sortelements.sortList();
		System.out.println();
		sortelements.printList();
		
	}
	void printList() {
		Node n = head;
		while(n!= null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	void sortList() {
		Node current = head;
		Node index;
		while(current!=null) {
			index = current.next;
			while(index!= null) {
				if(current.data>index.data) {
					int d = current.data;
					current.data = index.data;
					index.data = d;
				}
				index = index.next;
			}
			current = current.next;			
		}
		
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
