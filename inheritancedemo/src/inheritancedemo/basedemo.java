package inheritancedemo;

public class basedemo implements productintf
{

	@Override
	public void addprod() {
		// TODO Auto-generated method stub
		System.out.println("Product Added" + s1);
	}

	@Override
	public void deleteprod() {
		// TODO Auto-generated method stub
		System.out.println("Product deleted"+s1);
	}
	
	void disp()
	{
		System.out.println(s2);
	}
     
}
