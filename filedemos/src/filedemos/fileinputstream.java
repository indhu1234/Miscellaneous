package filedemos;

import java.io.FileInputStream;
import java.io.IOException;

public class fileinputstream 
{
   public static void main(String ar[])
   {
	   int i;
	   char c;
	   try(FileInputStream f=new FileInputStream("test.txt"))
			   {
		   
		           while((i=f.read())!=-1)
		           {
		        	   c=(char)i;
		        	  // System.out.print(i);
		        	   //System.out.println();
		        	   System.out.print(c);
		           }
		        	   
			   }
	   catch(IOException e)
	   {
		   System.out.println("Resource not available");
	   }
   }
}
