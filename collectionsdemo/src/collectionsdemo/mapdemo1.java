package collectionsdemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class mapdemo1 
{
  public static void main(String ar[])
  {
	  
	  
	  HashMap<String, String> obj = new HashMap<String, String>();
	  obj.put("E001", "One");
	  obj.put("E0010", "AAA");
	  obj.put("E002","Two");
	  obj.put("E003","Three");
	  obj.put("E000","Four");
	  obj.put("E00", "Five");
	  System.out.println("HashMap example");
	  System.out.println("Hash Map "+obj);
	  
	  System.out.println("HashTable example");
	  //map.putAll(obj);
	  Map map=new Hashtable(obj);

	  System.out.println("hashtable "+map);
	  
  }
}
