package switchdemo;

import java.util.Scanner;

public class arraydemo 
{
  public static void main(String ar[])
  {
	  int i;
	  String prod[]=new String[10];
	  int pid[]=new int[10];
	  prod[0]="Moto";
	  prod[1]="Redmi";
	  prod[2]="Honor";
	  prod[3]="Samsung";
	  Scanner s=new Scanner(System.in);
	  for(i=0;i<3;i++)
	  {
		  prod[i]=s.next();
		  
	  }
	  for( i=0;i<3;i++)
	  {
		System.out.println("pid["+i+"]"+"   "+prod[i]);
		  
	  }
	  System.out.println("pid["+i+"]"+"   "+prod[i]);
	  
  }
}
