package typecastdemo;

class Employee
{
	public Employee()
	{
		System.out.println("Employee");
	}
	public void print()
	{
		System.out.println("From Employee");
	}
	
}
class Manager extends Employee
{
	public Manager()
	{
		System.out.println("Manager");
	}
	public void print()
	{
		System.out.println("From Manager");
	}
	
}
class Supervisor extends Employee
{
	public Supervisor()
	{
		System.out.println("Supervisor");
	}
	public void print()
	{
		System.out.println("From Supervisor");
	}
	
}
public class updowncast {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		Manager M=new Manager();
		Supervisor S=new Supervisor();
		e1=M;  //upcasting 
		e2=S;  //upcasting
		e1.print();
		e2.print();
		System.out.println("Derived Classes");
		M=(Manager) e1; // downcasting
		S=(Supervisor) e2; //downcasting
		M.print();
		S.print();

	}

}
