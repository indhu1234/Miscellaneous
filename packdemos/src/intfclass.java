
public class intfclass implements intfdemo1
{

	@Override
	public void inp() {
		// TODO Auto-generated method stub
		System.out.println("inputs");
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Display");
		
	}
	public static void main(String ar[])
	{
		intfclass c1=new intfclass();
		c1.inp();
		c1.disp();
	}

}
