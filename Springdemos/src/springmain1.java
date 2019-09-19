import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class springmain1 
{
   public static void main(String ar[])
   {
	   /*Configuration config=new Configuration();
	   config.configure("Hiber_cfg.xml");
	   SessionFactory sessionfac=config.buildSessionFactory();
	   Session session=sessionfac.openSession();
*/	   
	  Resource res=new ClassPathResource("configurespring.xml");
	  
	BeanFactory fac=new XmlBeanFactory(res);
	   Employee employee=(Employee) fac.getBean("emp");
	   System.out.println(employee);
/*	   employee.setEmpid("E1002");
	   employee.setEname("BBBB");
	   employee.setDesig("Supervisor");
	   employee.setSalary(30000);
	   
	   Transaction tran=session.beginTransaction();
	   session.save(employee);
	  tran.commit();
	  session.close();
	   System.out.println("Object saved successfully");
*/	 
	   
   }
}
