
public class Reverse {

	public static void main(String args[])
	{
		Stack stk = new Stack(10);
		stk.push(4);
		stk.push(3);
		stk.push(2);
		stk.push(1);
		Stack rev1 = rev(stk);
		System.out.print(rev1.top);
	}
	
	public static Stack insertatbottom(Stack stk, int v)
	{
		if(stk.top == -1)
		{
			stk.push(v);
			return stk;
		}
		else
		{
			int x = stk.pop();
			stk = insertatbottom(stk,v);
			stk.push(x);
			return stk;
		}
	}
	
	public static Stack rev(Stack stk)
	{
		if(stk.top != -1)
		{
			int x = stk.pop();
			stk = rev(stk);
			stk = insertatbottom(stk,x);
		}
		return stk;
	}
}
