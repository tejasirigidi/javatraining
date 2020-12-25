import java.util.Scanner;
import java.util.*;
class Assignment1{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a=1,b=2,c=3;
		int n;
		n=sc.nextInt(); 
		// simple if
		if(a==n)
		{
			System.out.println("number matched with a");
		}
		if(b==n)
		{
			System.out.println("number matched with b");
		}
		if(c==n)
		{
			System.out.println("number matched with c");
		}
		// if else
		if(a==n)
		{
			System.out.println("number matched with a");
		}
		else if(b==n)
		{
			System.out.println("number matched with b");
		}
		else{
			System.out.println("number matched with c");
			
		}
		// Switch case
		System.out.println("Enter the number between 1,2,3");
		switch(n)
		{
			case 1:
				System.out.println("number matched with 1");
				break;
			case 2:
				System.out.println("number matched with 2");
				break;
			case 3:
				System.out.println("number matched with 3");
				break;
			default:
				System.out.println("end of switch");
		}
		// for loop
	int ar[]={1,2,3,4,5};
	int x=0;
	for(int i=0;i<ar.length;i++)
	{
		if(n==ar[i])
		{
			x=i;
			System.out.println("number matched"+x);
		}
	}
	// while loop
	int i=0;
	while(i<ar.length)
	{
		if(n==ar[i])
		{
			x=i;
			System.out.println("number matched"+x);
		}
		i++;
	}
	
	}
}