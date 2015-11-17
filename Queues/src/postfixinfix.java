public class postfixinfix {

	public static void main(String args[])
	{
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		print(exp);
	}
	
	public static boolean isoperand(char x)
	{
		if(( x >= 'a' && x <= 'z' )|| (x >= 'A' && x<='Z'))
				return true;
		else
			return false;
	}
	
	public static int prior(char x)
	{
		switch(x)
		{
		case '+' : return 1;
		case '-' : return 1;
		case '*' : return 2;
		case '/' : return 2;
		case '^' : return 3;
		default : return -1;
		}
	}
	
	public static void print(String exp)
	{
		String act = "";
		Stackc stk = new Stackc(exp.length());
		for(int i = 0; i< exp.length(); i++)
		{
			char c = exp.charAt(i);
			if(isoperand(exp.charAt(i)))
				act += c;
			else
			{
				if(c == '(')
					stk.push(c);
				else if(c == ')')
				{
					while(!stk.isEmpty() && stk.peek() != '(')
						act += stk.pop();
					if(stk.isEmpty())
						System.out.println("Invalid Expression");
					else
						stk.pop();
				}
				else 
				{
					while(!stk.isEmpty() && prior(c) <= prior(stk.peek()))
						act += stk.pop();
					stk.push(c);
				}
			}
		}
		while(!stk.isEmpty())
			act += stk.pop();	
		System.out.print(act);
	}
}
