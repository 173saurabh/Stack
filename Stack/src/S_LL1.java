
//Stack Data Structure(Introduction & Program)

import java.util.*;
public class S_LL1 
{
	StackNode root;
	static class StackNode
	{
		StackNode next;
		int data;
		StackNode(int d)
		{
			data=d;
			next=null;
		}
	}
	public void push(int data)
	{
		StackNode new_node=new StackNode(data);
		if(root==null)
		{
			root=new_node;
		}
		else
		{
			StackNode temp=root;
			root=new_node;
			new_node.next=temp;
		}
		System.out.println(data+" has been pushed into the stack");
	}
	public void pop()
	{
		if(root==null)
		{
			System.out.println("The stack is Empty");
			return;
		}
		System.out.println(root.data+" has been removed from the stack");
		root=root.next;
	}
	public void peek()
	{
		if(root==null)
		{
			System.out.println("The stack is Empty");
			return;
		}
		System.out.println(root.data);
	}
	public boolean isEmpty()
	{
		if(root==null)
		{
			return true;
		}
		return false;
	}
	public void printStack()
	{
		StackNode temp=root;
		if(temp==null)
		{
			System.out.println("The stack is Empty");
			return;
		}
		System.out.println("The stack is:");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		S_LL1 s=new S_LL1();
		System.out.println(" 		********************************		");
		System.out.println("Stack using linked list");
		while(true)
		{
			System.out.println("Select the operation to be performed in the Stack");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. isEmmpty");
			System.out.println("5. Print");
			System.out.println("6. Exit");
			int x=sc.nextInt();
			if(x==1)
			{
				System.out.println("Enter the element");
				s.push(sc.nextInt());
				System.out.println();
			}
			else if(x==2)
			{
				s.pop();
				System.out.println();
			}
			else if(x==3)
			{
				s.peek();
				System.out.println();
			}
			else if(x==4)
			{
				System.out.println(s.isEmpty());
				System.out.println();
			}
			else if(x==5)
			{
				s.printStack();
				System.out.println();
			}
			else
				break;
		}
	}
}
