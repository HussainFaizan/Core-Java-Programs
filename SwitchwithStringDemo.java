import java.util.*;
class SwitchwithStringDemo
{
	public static void main(String []args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);  
		//Scanner sc =new Scanner (System.in);
		System.out.println("Enter Cource Name::");
		String cname=sc.next();
		switch(cname)
		{
			case "C":
			case "c":
			{
				System.out.println("C language");
				System.out.println("Duration 45 Days");
				System.out.println("Fee::1500");
				break;
			}
			case "JAVA":
			case "java":
			case "Java":
			{
				System.out.println("Java Having j2SE,j2ME,J2EE");
				System.out.println("Duration 45 Days");
				System.out.println("Fee::3000");
				break;
			}
			default:
			System.out.println("Contact With Admin");
			
		}
	}
}