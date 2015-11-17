
public class Impqueuep {
	public static void main(String args[])
	{
		QueueP que = new QueueP();
		que.push(6, 6);
		que.push(4, 4);
		que.push(10, 10);
		que.push(9, 10);
		Nodep x =que.pop();
		Nodep y =que.pop();
		System.out.println(x.p);
		System.out.println(y.p);
	}
}
