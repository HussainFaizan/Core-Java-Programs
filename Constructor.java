class Abc
{
	 Abc()
	{
		System.out.println("This is Constructor...");
	}
	 void Abc()
	{
		System.out.println("This is Method....");
	}
}
public class Constructor
{
	public static void main(String[]args)
	{
		Abc a=new Abc();
		a.Abc();
	}
}



