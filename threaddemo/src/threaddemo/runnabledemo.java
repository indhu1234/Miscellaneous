package threaddemo;

class MyThread extends Thread
{
    //Initially setting the flag as true
     
    private volatile boolean flag = true;
     
    //This method will set flag as false
     
    public void stopRunning()
    {
        flag = false;
    }
     
    @Override
    public void run()
    {
        //Keep the task in while loop
         
        //This will make thread continue to run until flag becomes false
         
        while (flag)
        {
            System.out.println("I am running....");
        }
         
        System.out.println("Stopped Running....");
    }
}
 
public class runnabledemo 
{   
    public static void main(String[] args) 
    {
        MyThread thread = new MyThread();
         
        thread.start();
         
        try
        {
            Thread.sleep(10);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
         
        //call stopRunning() method whenever you want to stop a thread
         
        thread.stopRunning();
    }   
}