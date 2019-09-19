package exceptiondemo;

public class exceptest
{
	public static void main(String args[])
	{
		int x,y;
		x=0;
		try
		{
		y=x/x;
		System.out.println("result : "+y);
		}
		/*
		 catch(Exception e)
		{
			System.out.println("Exception");
		}
          */
		finally
		{
			System.out.println("Final");
		}
		
	}

}
