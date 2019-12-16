package practice.linkedlist;

public class InsertInMiddle {
	Node head;
	public static void main(String[] args) {
		InsertInMiddle iim = new InsertInMiddle();
		iim.head = new Node(1);
		Node second = new Node(2);
		Node third  = new Node(3);
		Node fourth = new Node(4);
		Node sixth  = new Node(5);
		Node seventh= new Node(7);
		insertNodes(iim.head);
		iim.printList();
		iim.insertInBetween(fourth, seventh);
		System.out.println();
		iim.printList();
	}
	void insertInBetween(Node previous_node, Node new_node) {
		Node current = head;
		while(current!=null) {
			if(current.data == previous_node.data) {
				new_node.next = current.next;
				current.next = new_node;
			}
			current =current.next;
		}
		
	}
	static void insertNodes(Node temp) {			
			for(int i=2;i<7;i++) {
				temp.next = new Node(i);
				temp = temp.next;
			}		
	}
	 void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data +" ");
			n = n.next;
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
