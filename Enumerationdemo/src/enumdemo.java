


public class enumdemo 
{
	enum color
	{
		Red(25),Green(250),Orange(255);
		int i;
		public int getdata(int a)
		{
			System.out.println("gets Enumerations");
			i=a;
			return i;
		}
		color(int x)
		{
			i=x;
			//getdata();
			System.out.println(i);
		}
	}
  public static void main(String ar[])
  {
	  color c1=color.Red;
	  color[] c2=color.values();
	  System.out.println(c1);
	  
	  System.out.println("Value of :  "+color.valueOf("Red"));
	  System.out.println(c1.getdata(250));
	  for(color col:c2)
	  {
		  System.out.println(col);
		  System.out.println(col+"position in "+col.ordinal());
	  }
  }
}