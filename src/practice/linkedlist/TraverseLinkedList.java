package practice.linkedlist;

public class TraverseLinkedList {
	Node head;

	public void printList(Node head) {
		if (head == null)
			return;
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;

		}
	}

	public static void main(String[] args) {
		TraverseLinkedList meill = new TraverseLinkedList();
		meill.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		meill.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;

		meill.printList(meill.head);

	}

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

}
