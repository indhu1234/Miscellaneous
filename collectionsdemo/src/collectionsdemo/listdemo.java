package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class listdemo 
{
   public static void main(String[] args) 
   {
	   ArrayList<String>list=new ArrayList<String>();//Creating arraylist    
	      list.add("AAAA");//Adding object in arraylist    
	      list.add("54");    
	      list.add("ONE");
	      list.add("10.56");    
	      list.add("Aruna");  
	      list.add("Aruna");
	      System.out.println(list);  
	      System.out.println("Enhanced For Loop example");
	      for(String obj:list) 
	      {
	    	    System.out.println(obj); 
	    	    }

	      Iterator itr=list.iterator();  
	      System.out.println("While loop example");
	      while(itr.hasNext())
	      {  
	       System.out.println(itr.next());  
	      }  
	     
	      System.out.println("Linked List Example");
	      LinkedList<String> ll=new LinkedList<String>();  
          ll.add("Ravi");  
          ll.add("Vijay");  
          ll.add("Ajay");  
          ll.add("AAAAA");
          Iterator i=ll.descendingIterator();  
          while(i.hasNext())  
          {  
              System.out.println(i.next());  
          }  
          
          
   }

   
   
   }
   
   

