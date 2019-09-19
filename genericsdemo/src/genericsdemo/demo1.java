package genericsdemo;

public class demo1<T,X>
{
	private X c;
	private T a;
	public demo1(T data1,X data2)
	{
		c=data2;
	a=data1;
			System.out.println("Constructor data1 : "+a);
		System.out.println("Constructor data2 : "+c);
	}
	public void print(X x)
	{
		c=x;
		System.out.println("Print method : "+c);
	}
	public void print(T x, X y)
	{
		a=x;
		c=y;
		System.out.println("A = "+a+"  "+"C = "+c);
	}
  public static void main(String ar[])
  {
	 demo1 D=new demo1("Hi","Hello");
	 D.print(100);
	 demo1<Integer,String> d1=new demo1<Integer,String>(1000,"Months");
	 d1.print(120,"August");
  }
}




class c2
{
	int a;
	String s;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
	
}
