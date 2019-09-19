package threaddemo;


public class killthread
{
   public static void main(String ar[])
   {
       Analysis a=new Analysis();
       System.out.println("Main Method");
       WatchDog w=new WatchDog(a,100);
       System.out.println("Main goes to end");
    }
}

class Analysis implements Runnable
{
    private boolean stopflag=true;
   Thread thisthread1=Thread.currentThread();
    Thread thisthread=new Thread();
     public void run()
     {
          while(stopflag)
           {
                System.out.println("Analyze....");
                
             }
          stopit();
      }
   public void stopit()
   {
        stopflag=false;
     }
}

class WatchDog
{
public WatchDog(Runnable r, int ms)
{
      Analysis anal	=new Analysis();
      Thread t=new Thread(r);                                                                                                                                                                                         
      t.start();
      try
      {
          t.sleep(ms);
      }
      catch(InterruptedException e)
      {
                
    	  anal.stopit();
       }
      
}
}

