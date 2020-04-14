import java.util.Scanner;

class AssertDemo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter age::");
		int age=sc.nextInt();
		assert age>=18:"Go and Study";
		System.out.println("Ok Driving");
		System.out.println("Enjoy Ride");
		System.out.println("Take Key");
		System.out.println("Drive Carefully");
		
	}
}


  