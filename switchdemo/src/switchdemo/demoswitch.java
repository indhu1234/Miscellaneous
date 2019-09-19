package switchdemo;

import java.util.Scanner;

public class demoswitch
{
   public static void main(String ar[])
   {
	  String product;
	  String category;
	  Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Category Name");
	  category=sc.next();
	  switch(category)
	  {
	  case "Mobile":
	  case "mobile":
	  {
		  System.out.println("Enter Product  Name");
		  product=sc.next();
		  System.out.println(product);
		  break;
	  }
	  case "Laptop":
	  case "laptop":
		  System.out.println("Enter Product  Name");
		  product=sc.next();
		  System.out.println(product);
		  break;
	   default:
		   
		
		   System.out.println("Mobile and Laptop only available");
		   break;
	  }
	  
   }
}

