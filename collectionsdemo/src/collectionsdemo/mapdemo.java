package collectionsdemo;

import java.util.*;

public class mapdemo 
{
  public static void main(String ar[])
  {
	  //HashMap<Integer,String> hash=new HashMap<Integer,String>();
	  Map<Integer,String> hash=new Hashtable<>();
	  hash.put(1,"E001");
	  hash.put(2,"E001");
	  hash.put(2,"E002");
	  hash.put(3,"E0011");
         System.out.println(hash);
         Set<Integer> keys=hash.keySet();
      
         for(Integer i :keys)   
         {
        	
         System.out.println(i+"  "+hash.get(i));
         }
	  
  }
}
