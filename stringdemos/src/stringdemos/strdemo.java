package stringdemos;

public class strdemo 
{
   public static void main(String a[])
   {
	 /*String s1=new String("One");
	 System.out.println(s1);
	 s1="Two";
	 System.out.println(s1);
	 String s2;
     StringBuilder s3;
     s2="January";
    // s3="one";
     System.out.println(s2+"   "+s3);*/

	StringBuilder sb1=new StringBuilder("Hi");
	StringBuffer sbuf=new StringBuffer("Hello");
	System.out.println(sb1+" "+sbuf);
	System.out.println(sb1.append("Welcome"));
	  System.out.println(sbuf.append(1000));
	   
   }
}
