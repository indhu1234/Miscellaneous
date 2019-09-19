package exercises;

import exer.clsA;

class A
{
	protected int j;
	A()
	{
		
		System.out.println("a");
	}
}
class B extends clsA
{
	B()
	{
		System.out.println("b");
		System.out.println(new clsA().j=22);
	}
}
class C extends B
{
	 C(int x)
	{
		 
		System.out.println("c");
	}
	 static void meth()
	 {
		disp();
		 System.out.println("Method");
	 }
	 static void disp()
	 {
		 System.out.println("display");
	 }
}

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="null";
       int i=new Integer("56");
       byte b=(byte) 256;
       
       System.out.println(i+" "+s+" "+b);
       new C(5).meth();
       
	}

}
