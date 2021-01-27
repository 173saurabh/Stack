//Infix to Postfix Conversion using Stack.

import java.util.*;
public class S_LL2 
{
	static int Prec(char c)
	{
		switch (c)
		{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
		}
		return -1;
	}
	static String InfixtoPostfix(String s)
	{
		String result=new String("");
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result+=c;
			}
			else if(c=='(')
			{
				stack.push(c);
			}
			else if(c==')')
			{
				while(!stack.isEmpty() && stack.peek()!='(')
				{
					result+=stack.pop();
				}
				stack.pop();
			}
			else
			{
				while(!stack.isEmpty() && Prec(c)<= Prec(stack.peek()))
				{
					result+=stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty())
		{
			if(stack.peek()=='(')
			{
				result="Invalid Expression";
			}
			result+=stack.pop();
		}
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println("Infix to Postfix");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(InfixtoPostfix(s));
	}
}
