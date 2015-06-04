package ir.angellandros.kollektion;

/**
 * 
 * @author Muhammad-Ali A'rabi
 *	<A HREF="me@angellandros.ir"> me@angellandros.ir </A>
 *
 * @param <E>
 * 
 * @version
 * 	June 04, 2015
 */
public class Node<E>
{
	private E data;
	private Node<E> next;
	private Node<E> previous;
	
	public Node(E data, Node<E> next, Node<E> previous)
	{
		this.data = data;
		this.next = next;
		this.previous = previous;
	}

	public E getData()
	{
		return data;
	}

	public void setData(E data)
	{
		this.data = data;
	}

	public Node<E> getNext()
	{
		return next;
	}

	public void setNext(Node<E> next)
	{
		this.next = next;
	}
	
	public boolean hasNext()
	{
		return next != null;
	}

	public Node<E> getPrevious()
	{
		return previous;
	}

	public void setPrevious(Node<E> previous)
	{
		this.previous = previous;
	}
	
	public boolean isFirst()
	{
		return previous != null;
	}
}
