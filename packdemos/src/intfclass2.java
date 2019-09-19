
public class intfclass2 implements intfdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intfclass2 c2=new intfclass2();
		c2.inp();
		c2.disp();
       	}

	@Override
	public void inp() {
		// TODO Auto-generated method stub
		System.out.println("Another App");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(str1);
	}

}
