import java.util.Scanner;
class ForDemo
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Any number to for math TABLE:");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}

}