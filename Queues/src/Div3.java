
public class Div3 {

	public static void main(String args[])
	{
		int[] a = {1,4,6};
		calc(a);
	}
	public static void calc(int[] a)
	{
		Queue q0 = new Queue(a.length);
		Queue q1 = new Queue(a.length);
		Queue q2 = new Queue(a.length);
		int sum = 0;
		for(int i = 0;i < a.length;i++)
		{
			sum+=a[i];
			if(a[i] % 3 == 0)
				q0.push(a[i]);
			else
			{
				if(a[i] % 3 == 1)
					q1.push(a[i]);
				else
					q2.push(a[i]);
			}
		}
		if(sum%3==1)
		{
			if(!q1.isEmpty())
				q1.pop();
			else
			{
				if(!q2.isEmpty())
				{
					q2.pop();
					if(!q2.isEmpty())
						q2.pop();
					else
						System.out.println("Number not divisible by 3");
				}
				else
					System.out.println("Number not divisible by 3");
			}
		}
		else
		{
			if(sum%3==2)
			{
				if(!q2.isEmpty())
					q2.pop();
				else
				{
					if(!q1.isEmpty())
					{
						q1.pop();
						if(!q1.isEmpty())
							q1.pop();
						else
							System.out.println("Number not divisible by 3");
					}
					else
						System.out.println("Number not divisible by 3");
				}
			}
				
		}
		int[] b = new int[a.length];
		for(int i = 0;i<b.length;i++)
		{
			if(!q0.isEmpty())
				b[i]=q0.pop();
			else
			{
				if(!q1.isEmpty())
					b[i]=q1.pop();
				else
					b[i]=q2.pop();
			}
		}
		
		for(int i = 0;i<b.length;i++)
		{
			if(b[i]!=-1)
				System.out.print(b[i]);
		}
	}
}
