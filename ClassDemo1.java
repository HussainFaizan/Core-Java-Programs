class c1
{
	void m1()
	{
		System.out.println("P1 Logic");
	}
	
	void m2()
	{
		System.out.println("P2 Logic");
	}
	
	void m3()
	{
		System.out.println("P3 Logic");
	}
}
public class ClassDemo1
{
	public static void main(String [] args)
	{
		c1 obj1 = new c1();
		//c2 obj2 = new c2();
		obj1.m1();
		obj1.m2();
		//obj2.m2();
		//obj3.m3();
	}

}
