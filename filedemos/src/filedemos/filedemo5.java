package filedemos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class filedemo5 
{
   public static void main(String ar[]) throws IOException
   {
	   BufferedWriter br=new BufferedWriter
			   (new OutputStreamWriter(System.out));
	    String f[]= {"One","Two","Three"};
	    
	    for(int i=0;i<3;i++)
	    {
	    br.write(f[i]+"  ");
	    br.flush();
	    }
	    System.out.println("Test1");
   }
}

