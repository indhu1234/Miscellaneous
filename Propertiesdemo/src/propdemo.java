import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class propdemo
{
   public static void main(String arg[])
   {
	   Properties products=new Properties();
	   Set prod;
	   String str;
	   products.put("Mobile1", "Redmi 5");
	   products.put("Mobile2", "Moto E2");
	   products.put("Mobile3","Honor 8C");
	   products.put("Mobile4", "Moto E3");
	   products.put("Mobile5", "Moto E3");
	   
	   prod=products.keySet();
	   Iterator itr=prod.iterator();
	   
	   while(itr.hasNext())
	   {
		   str=(String) itr.next();
		   System.out.println(str);
	   }
   }
}
