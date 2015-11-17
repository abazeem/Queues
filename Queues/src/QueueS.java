public class QueueS {
	Stack stk1;
	Stack stk2;
	int cap;
	public QueueS(int c)
	{
		cap = c;
		stk1 = new Stack(c);
		stk2 = new Stack(c);
	}
	public void enqueue(int x)
	{
		if(stk1.top!=-1)
		{
			while(stk1.top!=-1)
			{
				stk2.push(stk1.pop());
			}
			stk2.push(x);
			while(stk2.top!=-1)
			{
				stk1.push(stk2.pop());
			}
			
		}
		else
			stk1.push(x);
	}
	public int dequeue()
	{
		return(stk1.pop());
	}
}