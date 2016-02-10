package ir.angellandros.kollektion;

import java.util.Collection;
import java.util.Iterator;

/**
 * 
 * @author Muhammad-Ali A'rabi <A HREF="me@angellandros.ir"> me@angellandros.ir
 *         </A>
 * 
 * @param <E>
 * 
 * @version June 04, 2015
 */
public class LinkedList<E> implements Iterator<E>
{
	private Node<E> head;
	private Node<E> current;

	public LinkedList()
	{
		head = null;
		current = head;
	}

	public LinkedList(Collection<E> c)
	{
		Node<E> last = null;

		for (E e : c)
		{
			if (last == null)
			{
				head = new Node<E>(e, null, null);
				last = head;
			} else
			{
				Node<E> current = new Node<E>(e, null, last);
				last.setNext(current);
				last = current;
			}
		}

		restart();
	}
	
	public LinkedList(Iterator<E> c)
	{
		Node<E> last = null;

		while (c.hasNext())
		{
			E e = c.next();
			
			if (last == null)
			{
				head = new Node<E>(e, null, null);
				last = head;
			} else
			{
				Node<E> current = new Node<E>(e, null, last);
				last.setNext(current);
				last = current;
			}
		}

		restart();
	}
	
	public LinkedList<E> clone()
	{
		return new LinkedList<E>(this);
	}

	@Override
	public boolean hasNext()
	{
		return (current != null && current.hasNext());
	}

	@Override
	public E next()
	{
		current = current.getNext();
		return current.getData();
	}

	public boolean hasPrevious()
	{
		return (current != null && !current.isFirst());
	}

	public E previous()
	{
		current = current.getPrevious();
		return current.getData();
	}

	/**
	 * check whether there is a valid current node
	 * 
	 * @return true if current node exists and is valid, false otherwise
	 */
	public boolean hasCurrent()
	{
		return (current != null && current.getData() != null);
	}

	/**
	 * @return the data of current node
	 */
	public E current()
	{
		return current.getData();
	}

	/**
	 * remove current node
	 */
	@Override
	public void remove()
	{
		try
		{
			current.getPrevious().setNext(current.getNext());
		} catch (NullPointerException e)
		{
			// no previous, eh? so, you are the head
			head = head.getNext();
		}
		try
		{
			current.getNext().setPrevious(current.getPrevious());
		} catch (NullPointerException e)
		{
			// no next, eh?
		}
		current = current.getPrevious();
	}

	/**
	 * replace the current node with another new one
	 * @param data
	 */
	public void replace(E data)
	{
		current.setData(data);
	}

	/**
	 * insert a node after the current node, and move cursor to it
	 * 
	 * @param oth2
	 *            data of new node
	 */
	public void insert(E data)
	{
		Node<E> node;
		
		try
		{
			node = new Node<E>(data, current.getNext(), current);
			current.setNext(node);
		}
		catch(NullPointerException e)
		{
			// no current? hence an empty list
			node = new Node<E>(data, null, null);
			head = node;
		}
		
		try
		{
			current.getNext().setPrevious(node);
		}
		catch (NullPointerException e)
		{
			// dear boy is the last node
		}
		current = node;
	}

	/**
	 * move the cursor the very beginning of linked list, before the head. use
	 * next() to get data of head after this method is called.
	 */
	public void restart()
	{
		current = new Node<E>(null, head, null);
	}

	public String toString()
	{
		StringBuffer toReturn = new StringBuffer();
		Node<E> it = new Node<E>(null, head, null);
		while (it.hasNext())
		{
			if (it.getData() != null)
			{
				toReturn.append(", ");
			}
			it = it.getNext();
			toReturn.append(it.getData().toString());
		}
		return toReturn.toString();
	}

}
