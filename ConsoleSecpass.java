import java.io.*;
class ConsoleSecpass
{
	public static void main(String []args)
	{
		Console c =System.console();
		System.out.println("Enter User Name");
		String uname = c.readLine();
		System.out.println("Enter Passdword");
		char pass[] = c.readPassword();
		
		
		//Writing 
		
		System.out.println("User Name:"+uname);
		System.out.println("Passdword:"+pass);
	}
}