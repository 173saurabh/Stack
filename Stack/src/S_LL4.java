//Implement two stack in an array
import java.util.*;
public class S_LL4 
{
	int size,top1,top2;
	int arr[];
	S_LL4(int n)
	{
		size=n;
		arr=new int[size];
		top1=-1;
		top2=size;
	}
	void push1(int data)
	{
		if(top1>=top2-1)
		{
			System.out.println("Stack1 overflow");
			System.exit(1);
		}
		arr[++top1]=data;
	}
	int pop1()
	{
		if(top1==-1)
		{
			System.out.println("Stack1 Underflow");
			System.exit(1);
		}
		int data=arr[top1--];
		return data;
	}
	void push2(int data)
	{
		if(top1>=top2-1)
		{
			System.out.println("Stack2 overflow");
			System.exit(1);
		}
		arr[--top2]=data;
	}
	int pop2()
	{
		if(top2==size)
		{
			System.out.println("Stack2 Underflow");
			System.exit(1);
		}
		int data=arr[top2++];
		return data;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		S_LL4 ts=new S_LL4(n);
		System.out.println("Enter the elements of Stack1:");
		for(int i=0;i<n/2;i++)
		{
			ts.push1(sc.nextInt());
		}
		System.out.println("Enter the elements of Stack2:");
		for(int i=n/2;i<n;i++)
		{
			ts.push2(sc.nextInt());
		}
		System.out.println("The poped element from Stack1 is: "+ts.pop1());
		System.out.println("The poped element from Stack2 is: "+ts.pop2());
	}

}
