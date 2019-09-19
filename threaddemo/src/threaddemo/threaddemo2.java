package threaddemo;

class tasks extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			//System.out.println("Data is : "+i);
			System.out.println(Thread.currentThread().getId()+"data "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class threaddemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tasks t1=new tasks();
		t1.start();
		tasks t2=new tasks();
		t2.start();

	}

}
