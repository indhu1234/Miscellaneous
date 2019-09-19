package threaddemo;
class hi extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try{
				Thread.sleep(100);
			}
			catch(Exception e) {}
		}
	}
	public synchronized void show()
	{
		System.out.println("Method from hi");
	}
	
}
class hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(150);}catch(Exception e) {}
		}
	}
	public synchronized void show()
	{
		System.out.println("Method from hello");
	}
}
public class multithreaddemo 
{
	
	public static void main(String ar[])
   {
	   hi obj1=new hi();
	   hello obj2=new hello();
	   
	   obj1.start();
	   //try{Thread.sleep(15);}catch(Exception e) {}
	   obj2.start();
	   //try{Thread.sleep(15000);}catch(Exception e) {}
	  obj1.show();
	 
	   obj2.show();
   }
}
