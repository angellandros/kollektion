package ir.angellandros.kollektion;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LinkedListTest
{

	@Test
	public void test()
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		LinkedList<Integer> ll = new LinkedList<Integer>(list);
		
		assertEquals(ll.toString(), "1, 2, 3, 4");
		
		ll.next();
		ll.next();
		ll.next();
		ll.remove();
		ll.remove();
		ll.insert(10);
		ll.restart();
		
		assertEquals(ll.toString(), "1, 10, 4");
	}

}
