package collectionsdemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Hashmapdemo1 
{
  public static void main(String[] args) 
  {
	
	  HashMap<Integer,String> hmap=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hmap);  
	      hmap.put(100,"Amit");    
	      hmap.put(101,"Vijay");    
	      hmap.put(102,"Rahul");  
	      hmap.put(103,null);
	       
	      System.out.println("After invoking put() method ");  
	      for(Map.Entry map:hmap.entrySet()){    
	       System.out.println(map.getKey()+" "+map.getValue());    
	      }  
	        
	      hmap.putIfAbsent(103, "GUNA");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Map.Entry map:hmap.entrySet()){    
	           System.out.println(map.getKey()+" "+map.getValue());    
	          }  
	      HashMap<Integer,String> map1=new HashMap<Integer,String>();  
	      map1.put(10000,"AAAA");  
	      map1.putAll(hmap);  
	      System.out.println("After invoking putAll() method ");  
	      for(Map.Entry m:map1.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          } 
	      
	      System.out.println("Hash Table Example");
	      Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	      
	      hm.put(100,"Amit");  
	      hm.put(102,"Ravi");  
	      hm.put(101,"Vijay");  
	      hm.put(103,"Rahul");  
	      
	      for(Map.Entry m:hm.entrySet()){  
	       System.out.println(m.getKey()+" "+m.getValue());  
	      }
	      System.out.println("Tree map Example");
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }      
	  
  
    }
}
