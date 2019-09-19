package collectionsdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setdemo
{
   public static void main(String ar[])
   {
	   HashSet sets=new HashSet();
	   sets.add(100);
	   sets.add(10000);
	   sets.add(200);
	   sets.add(300);
	   sets.add(800);
	   sets.add(500);
	   sets.add(1000);
	   sets.add(1);
	   sets.add(2);
	    System.out.println("Hash set Example 1");
	   System.out.println(sets);
	   
	   System.out.println("Hash set Example 2");
	   
	   Set S=new HashSet();
	   S.add("Mobile");
	   S.add("Samsung");
	   S.add(20000);
	   S.add(2);
	   
	   System.out.println(S);
	   
	   System.out.println("Example for LinkedHashset");
	   LinkedHashSet link=new LinkedHashSet();
	   link.add("AAA");
	   link.addAll(S);
       link.add("one");
	   link.add("One");
	   link.add("one");
	   link.add("ZZZ");
	   System.out.println(link);
	   
	   Set<String> hash=new HashSet<String>();
	   hash.add("100");
	   hash.add("AAA");
	   hash.add("ZZZ");
	   hash.add("BBB");
	   hash.add("000");
	   hash.add("111");
	   System.out.println(hash);
	   
	   System.out.println("TreeSet examples");
	   Set<String> tree=new TreeSet<String>(hash);
	   tree.add("100");
	   
	   System.out.println(tree);
	   
	   
   }
}
