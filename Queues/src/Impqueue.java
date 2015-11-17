
public class Impqueue {
	public static void main(String args[])
	{
	//Queue Que = new Queue(5);
	QueueNode  Que1 = new QueueNode();
	for(int i = 0;i<5;i++)
	//Que.push(i);
		Que1.push(i);
	//Que.disp();
	for(int i = 0;i<5;i++)
	{
		Que1.pop();
	}
	//Que.disp();
	}
}	
