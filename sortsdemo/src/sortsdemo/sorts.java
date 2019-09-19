package sortsdemo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class sorts implements Comparator
{
   public static void main(String ar[])
   {
	   electronics e1=new electronics("Sonata",15,2000);
	   electronics e2=new electronics("Titan",5,1500);
	   ArrayList<electronics> list1=new ArrayList<>();
	    list1.add(e1);
	    list1.add(e2);

	   Comparator<electronics> el1=new Comparator<electronics>()
	   {
		  public int compare(electronics o1,electronics o2)
	       {
		if(o1.getQty()>o2.getQty())
		{
			return 1;
		}
		else if(o1.getQty()<o2.getQty())
		{
	      	return -1;
		}
		else
			return 0;
	     }
	   };
	   
	   
	   //Comparator obj=new comparator(){      };
	   
	Collections.sort(list1, el1);
      
	   for(electronics i:list1)
	   {
		   System.out.println(i);
		   
	   }
   
      }
}


