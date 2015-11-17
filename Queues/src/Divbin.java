import java.util.Scanner; 
public class Divbin 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a number");  
		int x=sc.nextInt();
		calc(x);
		sc.close();
	 }
	
	public static void calc(int x)
	{
		int i = 2;
		while(i>0)
		{
			long y= calcbin(i);
			if(y%x==0)
			{
				System.out.print(y);
				break;
			}
			else
				i++;
				
		}
	}
	public static long calcbin(int x)
	{
		int y ;
		long num = 0;
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