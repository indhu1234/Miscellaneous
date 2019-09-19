package filedemos;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class filedemo3 
{
   public static void main(String ar[]) throws IOException
   {
	   int i;
	   String s=" This is sample file read concept  ";
	   byte bu[]=s.getBytes();
	   ByteArrayInputStream in=new ByteArrayInputStream(bu);
	  // System.out.println(in.read());
	   BufferedInputStream bf=new BufferedInputStream(in);
	  // System.out.println(bf.read());
	   while((i=bf.read())!=-1)
	   {
		   System.out.print((char)i);
	   }
   }
}
