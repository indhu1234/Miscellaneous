package collectionsdemo;

import java.util.LinkedList;
import java.util.List;

class product
{
	int pid;  
	String pname,category,supplier;  
	int quantity;  
	public product(int pid, String pname, String category, String supplier, int quantity)
	{  
	    this.pid = pid;  
	    this.pname = pname;  
	    this.category = category;  
	    this.supplier = supplier;  
	    this.quantity = quantity;  
	}    
	}

public class Listdemo2
{
  public static void main(String[] args) 
  {
	     List<product> list=new LinkedList<product>();  
	     //Creating Books  
	     product p1=new product(101,"Samsung Galaxt 18","Samsung","XXX (p) ltd.", 10);
	     product p2=new product(102,"Nokia 6610","Nokia","XXX (p) ltd.", 5);
	     product p3=new product(103,"Redmi Note 5","Motorola","YYY (p) ltd.", 10);
	     product p4=new product(104,"Moto G5","Motorola","YYY (p) ltd.", 10);
	     
	     //Adding Books to list  
	     list.add(p1);  
	     list.add(p2);  
	     list.add(p3);  
	    //Traversing list 
	    //Inserting a Book in between the list   
	     list.add(2, p4);
	     for(product p:list){  
	     System.out.println(p.pid+" "+p.pname+" "+p.category+" "+p.supplier+" "+p.quantity);  
	     }  
	   
  }
}
