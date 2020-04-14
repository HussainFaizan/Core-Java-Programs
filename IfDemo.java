import java.io.*;
class IfDemo
{
	public static void main(String[]args)
	{
		int pinno=1234;
		Console c =System.console();
		System.out.println("Enter PIN no..");
		char pass[]=c.readPassword();
		String s1=new String(pass);//pass converted into String or Readable form..
		int pinno1=Integer.parseInt(s1);//Converting String (s1) to Integer (pinno1)
		if(pinno==pinno1)
		{
			System.out.println("Pin validated Sucessfully");
		}
	}
}