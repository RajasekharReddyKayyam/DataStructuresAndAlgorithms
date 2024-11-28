package LinkedList;

public class CustomLinkedList {
	Node head=null;
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
		}
		
		
	}
public void insert(Object obj) {
	Node n= new Node(obj);
	if(head==null) {
		head=n;
	}
	else {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		head.next=n;
	}
	
}
}
