
public class QueueP {
	
	int count;
	Nodep head;
	Nodep tail;
	
	public QueueP()
	{
		head = null;
		tail = null;
		count = 0;
	}
	public void push(int val,int p)
	{
		Nodep temp = new Nodep(val,p);
		count++;
		if(count == 1)
		{
			head = temp;
			tail = temp;
		}
		else
		{
		Nodep temp2 = tail;
		while(temp2!=null)
		{
			if(temp.p>temp2.p)
			{
				Nodep temp3 = temp2.prev;
				if(temp3!=null)
				{
					temp3.next =temp;
					temp.prev= temp3;
				}
				else
					temp.prev = null;
				temp.next =temp2;
				temp2.prev = temp;
				break;
			}
			else
			{
				if(temp2.p == temp.p)
				{
					int x = temp2.p;
					while(temp2.p==x)
					{
						temp2 =temp2.next;
					}
					Nodep temp3 = temp2.prev;
					temp3.next = temp;
					temp.prev= temp3;
					temp.next =temp2;
					temp2.prev = temp;
					break;
				}
				else
				{
					if(temp2.next == null)
					{
						temp.prev= temp2;
						temp2.next =temp;
						temp.next = null;
						break;
					}
					else
						temp2 = temp2.next;
				}
			}
		}
		Nodep temp4 = temp2;
		while(temp2.prev!= null)	
			temp2 = temp2.prev;
		tail = temp2;
		while(temp4.next != null)
			temp4 =temp4.next;
		head= temp4;
		}		
	}
	
	public Nodep pop()
	{
		if(count == 0)
		{
			return null;
		}
		else
		{
			Nodep temp = tail;
			if(count ==1)
			{
				count--;
				head = null;
				tail = null;
				return temp;
			}
			else
			{
				Nodep temp2 =tail.next;
				tail.next = null;
				tail = temp2;
				tail.prev = null;
				count--;
				return temp;
			}
		}
	}
}

