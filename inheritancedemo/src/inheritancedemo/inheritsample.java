package inheritancedemo;

class c1
{
	public c1()
	{
		System.out.println("From c1");
	}
	public void test()
	{
		System.out.println("From Class c1");
	}
}
class c2 extends c1
{
	public c2()
	{
		System.out.println("From c2");
	}
	public void test()
	{
		
		System.out.println("From class c2");
		super.test();
	}
}

public class inheritsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c2 obj=new c2();
		obj.test();

	}

}
