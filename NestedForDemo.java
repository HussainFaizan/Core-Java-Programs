import java.util.Scanner;
class NestedForDemo
{
	public static void main(String [] args)
	{
		/* Scanner sc=new Scanner (System.in);
		System.out.println("Enter Any number to for math TABLE:");
		int n = sc.nextInt(); */
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
			System.out.println(i+"*"+j+"="+(i*j)+"\t");
			}
			//System.out.println("\n");
		}
	}

}