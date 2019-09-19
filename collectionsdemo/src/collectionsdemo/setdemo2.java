package collectionsdemo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class contacts
{
	String contno;
	String name;
	public void chat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter contact no. and name ");
		contno=sc.next();
		name=sc.next();
		
	}
    public void disp()
    {
    	System.out.println("Contact No. : "+contno);
    	System.out.println("Name is : "+name);
    }
	@Override
	public String toString() {
		return "contacts [contno=" + contno + ", name=" + name + "]";
	}
    
    
}
public class setdemo2 
{
   public static void main(String ar[])
   {
	   contacts cont=new contacts();
	   cont.chat();
	   cont.disp();
	   Set<contacts> hash=new HashSet<contacts>();
	   hash.add(cont);
	   System.out.println("Contacts in set : "+hash.toString());
	   
	   Set set1=new HashSet();
	   set1.add("aaa");
	   set1.add("aaa");
	   set1.add("bbb");
	   set1.add("ccc");
	   set1.add("ccc");
	   
	   System.out.println("Hash Set 1 : "+set1);
	   
	   Set set2=new HashSet();
	   set2.add(1);
	   set2.add(7);
	   set2.add(2);
	   
	   System.out.println("Hash Set 2 : "+set2);
	   
	   
	   Set tree=new TreeSet();
	   tree.add("aaa");
	   tree.add("bbb");
	   System.out.println("Tree Set 1 : "+tree.toString());
	   Set tree1=new TreeSet();
	   tree1.add(1);
	   tree1.add(10);
	   tree1.add(3);
	   System.out.println("Tree Set 2 : "+tree1);
	   
	   
   }
}
