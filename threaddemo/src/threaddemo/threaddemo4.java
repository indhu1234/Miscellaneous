package threaddemo;
class test1 extends Thread
{
	public void show()
	{
		
		System.out.println("Test method 1");
	}
	public void run()
	{
		
		System.out.println("Run method from test 1");
	}
}
class test2 extends Thread
{
	public void show()
	{
		System.out.println("Test method 2");
	}
	public void run()
	{
		
		System.out.println("Run method from test 2");
	}
}
public class threaddemo4 
{
   public static void main(String ar[])
   {
	   test1 t1=new test1();
	   test2 t2=new test2();
	   t1.start();
	   t2.start();
   }
}
