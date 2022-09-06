


import java.util.ArrayList;
import java.util.List;

public class Queue implements IQueue 
{
	private List contents;

	public Queue()
	{
		contents = new ArrayList();
	}
	
	@Override
	public void enqueue(Object item)
	{
		contents.add(item);

	}

	@Override
	public Object peek() throws QueueEmpty 
	{
		if (isEmpty())
			throw new QueueEmpty();

		return contents.get(0);
	}

	@Override
	public Object dequeue() throws QueueEmpty {
		if (isEmpty())
			throw new QueueEmpty();

		Object retVal = contents.get(0);
		contents.remove(0);
		
		return retVal;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return contents.size() == 0;
	}
	
	@Override
	public String toString()
	{
		int size = contents.size();
		
		String retString = "";
		
		for(int i=0; i<size; i++)
		{
			retString += contents.get(i) + "\n";
		}
		
		return retString;
	}

}

