import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee 
{
	@Id
	@GeneratedValue
   String Empid;
   String Ename;
   String Desig;
   double salary;
public String getEmpid() {
	return Empid;
}
public void setEmpid(String empid) {
	Empid = empid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public String getDesig() {
	return Desig;
}
public void setDesig(String desig) {
	Desig = desig;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
   
   public String toString()
   {
	   return "EmpID= "+Empid+"  "+"Emp Name = "+Ename+" "+"Designation = "+Desig+" "+"Salary = "+salary;
   }
}
