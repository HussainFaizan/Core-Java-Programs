 //import java.util.*;
class IfelseDemo
{
	public static void main(String [] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int n=sc.nextInt();
		int a=n/100;
		int b=n%100/10;
		int c=n%10;
		/* System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
 	 int d=a*a*a+b*b*b+c*c*c;
		if(n==d)
		{
			System.out.println("Armstrong Number::"+d);
		}
		else 
		{
			System.out.println("Given Number is not a Armstron Number::"+d);
		}
		
	}
} 

 
 