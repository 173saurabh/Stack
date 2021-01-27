//Reverse a string using stack using array
import java.util.*;
class Stack
{
	int top,size;
	char c[];
	Stack(int n)
	{
		top=-1;
		size=n;
		c=new char[size];
	}
	void push(char ch)
	{
		c[++top]=ch;
	}
	char pop()
	{
		char x=c[top--];
		return x;
	}
}
public class S_LL3
{
	public static void reverse(StringBuffer str)
	{
		int n=str.length();
		Stack obj=new Stack(n);
		for(int i=0;i<n;i++)
		{
			obj.push(str.charAt(i));
		}
		for(int i=0;i<n;i++)
		{
			char ch=obj.pop();
			str.setCharAt(i,ch);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		s.append(sc.nextLine());
		reverse(s);
		System.out.println("Reverse of the string is "+s);
	}
}
