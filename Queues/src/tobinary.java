import java.util.Scanner; 
public class tobinary {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a number");  
		   int x=sc.nextInt();
		   //calcbin(x);
		   int z = calc(x);
		   System.out.println(z);
		   sc.close();
	}
	public static void calcbin(int x)
	{
		int y = x;
		int count=0;
		while(y>=1)
		{
			y=y/2;
			count++;
		}
		Stack que = new Stack(count);
		while(x>0)
		{
			que.push(x%2);
			x=x/2;
		}
		while(que.top !=-1)
		{
			System.out.print(que.pop());
		}
		
	}
	public static int calc(int x)
	{
		int y ;
		int num = 0;
		int count=0;
		while(x>0)
		{
			y =x%2;
			num+=Math.pow(10, count)*y;
			x=x/2;
			count++;
		}
		return num;
	}
}
