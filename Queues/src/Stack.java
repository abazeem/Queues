
public class Stack {
	int maxsize;
	int top;
	int[] arr;
	
	public Stack(int x)
	{
		maxsize = x;
		top = -1;
		arr = new int[x];
	}
	public void push(int x)
	{
		if(top<maxsize)
		arr[++top]=x;
		else
			System.out.println("Stack Overflow");
	}
	public int pop()
	{
		if(top==-1)
			return -1;
		return(arr[top--]);
					
	}
}
