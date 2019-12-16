package practice.linkedlist;

public class DeleteGivenNode {
	Node head;

	public static void main(String[] args) {
		DeleteGivenNode del = new DeleteGivenNode();
		del.head = new Node(1);
		del.insertNodes();
		del.printList();
		int nodeKey = 4;
		del.deleteNode(nodeKey);
		System.out.println();
		del.printList();
	}

	void insertNodes() {
		Node n = head;
		for (int i = 2; i < 10; i++) {
			n.next = new Node(i);
			n = n.next;
		}
	}

	void printList() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

	void deleteNode(int key) {
		Node current = head;
		Node prev = null;
		if (current.data == key) {
			head = current.next;
			return;
		}
		while (current.next != null) {
			if (current.next.data == key) {
				prev = current;
				current = current.next;
				prev.next = current.next;
			}
			current = current.next;
		}

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
