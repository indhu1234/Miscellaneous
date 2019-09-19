package inheritancedemo;

public class intfdemo 
{
   public static void main(String ar[])
   {
	   basedemo B=new basedemo();
	   category C=new category();
	   B.addprod();
	   B.deleteprod();
	   B.disp();
	   System.out.println("Categories");
	   C.addcategory();
   }
}
