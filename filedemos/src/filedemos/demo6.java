package filedemos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo6 {

	public static void main(String[] args) throws IOException    
	{
	  String str="Hi";
	  String str1="Hello...";
	  String str2="Welcome";
	  BufferedWriter br=new BufferedWriter(new FileWriter("test2.txt",true));
	 // br.newLine();
	  br.write(str);
	  br.write(str1);
	  br.write(str2);
	  
	  br.close();

	}

}
