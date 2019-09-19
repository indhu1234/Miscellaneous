package filedemos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class filedemo4
{
  public static void main(String args[])
  {
	  int a,b,c;
	  BufferedReader br=new BufferedReader
			  (new InputStreamReader(System.in));
	  try
	  {
	  a=Integer.parseInt(br.readLine());
	  b=Integer.parseInt(br.readLine());
	  System.out.println("A= "+a++ +"   b=  "+ b++);
	  System.out.println(a+" "+b);
	  }	 
	  catch(IOException e)
	  {
		  System.out.println("------------------"+e);
	  }
}
}
