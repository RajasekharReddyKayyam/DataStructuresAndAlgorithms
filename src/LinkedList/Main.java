package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList();
		list.add(10);
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(4);
		list.add(140);
		list.add(104);
		System.out.println(list);
		CustomLinkedList  clist=new CustomLinkedList();
		clist.insert(10);
		clist.insert(1);
		clist.insert(13);
		clist.insert(5);
		System.out.println(clist);
		
	}

}
