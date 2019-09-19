package collectionsdemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class dequedemo1 {

	public static void main(String[] args) 
	{
	     Deque<String> deque=new ArrayDeque<String>();  
	     deque.offerFirst("jai"); 
	     deque.offer("arvind");  
	     deque.offer("vimal");  
	     deque.add("mukul");  
	      
	     System.out.println("After offer First Traversal...");  
	     for(String s:deque)
	     {  
	         System.out.println(s);  
	     }  
	     System.out.println("Poll example ");
	     deque.poll();
	     for(String s:deque)
	     {  
	         System.out.println(s);  
	     }
	     System.out.println("PollFirst example ");
	     deque.pollFirst();//it is same as poll()
	     for(String s:deque)
	     {  
	         System.out.println(s);  
	     }
	     System.out.println("PollLast example ");
	     deque.pollLast();  
	     System.out.println("After pollLast() Traversal...");  
	     for(String s:deque){  
	         System.out.println(s);  
	     }  


	}

}
