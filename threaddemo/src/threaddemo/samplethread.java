package threaddemo;

class task1 implements Runnable
{
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			//System.out.println("Id of Thread : "+Thread.currentThread().getId()+" My data is : "+i);
			System.out.println(i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Interruption error");
		}*/

	}
     
	public synchronized void sample()
	{
		System.out.println("Sample method defined by user in task 1");
	}
}
class task2 implements Runnable
{
	public void run()
	{
		for(int i = 5;i>0;i--)
		{
			//System.out.println("Id of Thread : "+Thread.currentThread().getId()+" My data is : "+i);
			System.out.println("data  "+i);
		}
		try {
			Thread.sleep(80);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void sam()
	{
		System.out.println("Sample method defined by user in task 2");
	}
}

public class samplethread 
{
  public static void main(String ar[])
  {
	  task1 t1=new task1();
	  task2 t2=new task2();
	  Thread tt=new Thread(t1);
	  Thread tt1=new Thread(t2);
	   System.out.println(tt.isAlive());
	   System.out.println(tt1.isAlive());
	  t1.sample();
	  System.out.println("Thread1");
	  tt.start();
	  System.out.println("Threads 2");
	   tt1.start();
	   t2.sam();
	   
	   System.out.println(tt.isAlive());
	   System.out.println(tt1.isAlive());
	   
  }

}
