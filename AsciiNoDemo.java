//import java.util.*;
class AsciiNoDemo
{
	public static void main(String[]args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter any char");
		char ch=sc.next().charAt(0);
		//int n=ch;
		System.out.println("given char ASCII no::"+ch);
	}
}