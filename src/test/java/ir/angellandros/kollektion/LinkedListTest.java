package ir.angellandros.kollektion;

import java.util.ArrayList;
import java.util.List;

public class LinkedListTest
{

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		LinkedList<Integer> ll = new LinkedList<Integer>(list);
		
		System.out.println(ll);
		
		ll.next();
		ll.next();
		ll.next();
		ll.remove();
		ll.remove();
		ll.insert(10);
		ll.restart();
		
		System.out.println(ll);
	}

}
