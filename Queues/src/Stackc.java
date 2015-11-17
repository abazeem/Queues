
public class Stackc {
	int maxsize;
	int top;
	char[] arr;
	
	public Stackc(int x)
	{
		maxsize = x;
		top = -1;
		arr = new char[x];
	}
	public void push(char x)
	{
		if(top<maxsize)
		arr[++top]=x;
		else
			System.out.println("Stack Overflow");
	}
	public char pop()
	{
		if(top==-1)
			return '0';
		return(arr[top--]);
					
	}
	
	public char peek()
	{
		return arr[top];
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
}