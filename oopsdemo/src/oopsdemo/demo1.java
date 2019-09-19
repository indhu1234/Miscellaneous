package oopsdemo;

class c1
{
	int a;
	String str1; 
	void inp()
	{
		System.out.println("Class 1 method");
		System.out.println("A= "+a+"  "+"string = "+str1);
	}
}

class c2
{
	int a;
	String str1; 
     	void disp()
	{
     		a=10;
     	     str1="Hello";

		System.out.println("Class 2 method");
		System.out.println("A= "+a+"  "+"string = "+str1);
	}
}
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      c1 c1obj=new c1();
      c2 c2obj=new c2();
      
      c1obj.a=100;
      c1obj.str1="Hi!!!";
      c1obj.inp();
      c2obj.disp();
      System.out.println(c1obj);
      c1[] obj1=new c1[5];
      for(int i=0;i<3;i++)
      {
    	  obj1[i]=new c1();
    	  obj1[i].inp();
      }
      
		
	}

}
