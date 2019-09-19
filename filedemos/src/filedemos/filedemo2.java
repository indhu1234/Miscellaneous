package filedemos;

import java.io.FileInputStream;
import java.io.IOException;

public class filedemo2 
{
	public static void main(String ar[]) throws IOException
	{
		 int i;
		 char c;
		 
		FileInputStream fi=new FileInputStream("sample.txt");
		while((i=(fi.read()))!=-1)
		{
		   System.out.println(i+" "+(char)i );	
		}
	
		System.out.println();
	
}
		
	}


