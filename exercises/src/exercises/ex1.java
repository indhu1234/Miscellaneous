package exercises;

class S
{
	protected int j;
	int roll,a,b;
	S()
	{
		
	}
	S(int x)
	{
		
		this(10,20);
		a=b=x;
		roll=1;
	}
	public S(int i, int j) {
		// TODO Auto-generated constructor stub
		
		this();
		this.a=i;
		this.b=j;
		System.out.println(a+" "+b);
	}
}

public class ex1
{
  public static void main(String arg[])
  {
	String s="null";
	int i=new Integer("56");
	System.out.println(i+" "+s);
  }
}
