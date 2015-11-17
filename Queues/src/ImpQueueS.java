public class ImpQueueS {
	public static void main(String args[])
	{
		QueueS que = new QueueS(5);
		que.enqueue(1);
		que.enqueue(2);
		que.enqueue(3);
		que.enqueue(4);
		que.enqueue(5);
		que.dequeue();
		System.out.println("Hello");
		
	}

}
