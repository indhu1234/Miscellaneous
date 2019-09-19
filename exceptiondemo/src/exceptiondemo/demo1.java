package exceptiondemo;

public class demo1 
{
   public static void main(String ar[])
   {
	   int i,j,k;
	   i=10;j=10;
	   int[] a=new int[3];
	   a[0]=100;
	   a[1]=200;
	   a[2]=300;
	   
	   try 
	   {
	   
	   k=i/j;
	   System.out.println(k);
	   }
	   //System.out.println("Well");
	   finally
	   {
		   System.out.println("Try 1 completed");
	   }
	   
	   try
	   {
	   a[5]=500;
	   System.out.println(a[5]);   
	   }
	   
	   catch(ArithmeticException e)
	   {
		   System.out.println("Divide by zero");
	   }
	   catch(ArrayIndexOutOfBoundsException ae)
	   {
		   i++;
		   System.out.println("Array exception "+i);
	   }
	   catch(Exception arr)
	   {
		   System.out.println("Unknown exception");
	   }
	   finally {
	   System.out.println("Try 2 completed");}
   }
}
