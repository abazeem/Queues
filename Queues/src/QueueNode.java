
public class QueueNode {
	int count;
	Node head;
	Node tail;
	public QueueNode()
	{
		count = 0;
		head = null;
		tail = null;
	}
	public void push(int x)
	{
	Node value = new Node(x);
	count++;
	if(count == 1)
	{
		tail = value;
		head = value;
	}
	else
	{
		head.next = value;
		head = head.next;
	}
	}
	public int pop()
	{
		if(count==0)
		{
			head = null;
			tail=null;
			return -1;
		}
		else
		{
			if(count == 1)
				head =null;
			int y = tail.val;
			Node temp = tail.next;
			tail.next = null;
			tail = temp;
			count--;
			return y;
		}
	}
}
