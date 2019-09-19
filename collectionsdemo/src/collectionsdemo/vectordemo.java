package collectionsdemo;

import java.util.ListIterator;
import java.util.Vector;

public class vectordemo
{
  public static void main(String[] args) 
  {
	 Vector <Double> obj=new Vector<Double>();
	 Double obj1=new Double(11.44);
	 Double obj2=new Double(154.44);
	 Double obj3=new Double(116.144);
	 Double obj4=new Double(117.644);
	 Double obj5=new Double(171.244);
	 System.out.println("Size of Vector : "+obj.size());
	 obj.add(obj1);
	 obj.add(obj2);
	 obj.add(obj3);
	 obj.add(obj4);
	 obj.add(obj5);
	 
	 System.out.println("Items : "+obj);
	  
	 ListIterator i=obj.listIterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
  }
}
