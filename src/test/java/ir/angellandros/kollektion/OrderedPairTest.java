package ir.angellandros.kollektion;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedPairTest
{

	@Test
	public void test()
	{
		OrderedPair<Integer, Integer> pair = new OrderedPair<Integer, Integer>(12, 16);
		assertEquals((int) pair._1, 12);
		assertEquals((int) pair._2, 16);
	}

}
