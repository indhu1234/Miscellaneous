package filedemos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class filedemo1 
{
   public static void main(String args[]) throws IOException
   {
	   File f1=new File("check.txt");
	   System.out.println("File Name :"+f1);
	   System.out.println("Exists? "+f1.exists());
	   System.out.println("Directory? "+f1.isDirectory());
	   
	   /*FileInputStream f2=new FileInputStream("check.txt");
	   InputStreamReader ir=new InputStreamReader(f2);
	   BufferedReader br1=new BufferedReader(ir);*/
	   
	  BufferedReader br=new BufferedReader(new InputStreamReader
			(new FileInputStream(f1)));
	   String str=br.readLine();
	   br.close();
	  System.out.println(str);
   
	  /*String str2="Welcome to all ";
	   OutputStream out=new FileOutputStream(f1);
	   //out.write(str.getBytes());
	    out.write(str2.getBytes());
	    
	   out.close();*/
	   
	     
   }
}
