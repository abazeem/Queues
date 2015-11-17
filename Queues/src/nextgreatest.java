public class nextgreatest {

	
	public static void main(String args[])
	{
		int[] a = {4,5,2,10,11};
		calc(a);
	}
	
	public static void calc(int[] a)
	{
		int temp = 0;
		Queue que = new Queue(a.length+2);
		que.push(a[0]);
		for(int i = 1; i<a.length; i++)
		{
			while(!que.isEmpty())
			{
				int x = que.pop();
				if( a[i] > x)
				{
					a[temp] = a[i];
					temp++;
				}
				else
				{
					que.push(x);
					break;
				}
			}
			que.push(a[i]);
		}
		while(temp<a.length)
		{
			a[temp] = -1;
			temp++;
		}
		for(int i = 0; i<a.length; i++)
			System.out.print(a[i] + " ");
	}
}

