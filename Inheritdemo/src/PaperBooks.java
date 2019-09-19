
public class PaperBooks extends Books
{
   
public PaperBooks(int bid, String bname, int pid, String pname) {
		super(bid, bname, pid, pname);
		System.out.println("Derived class");
	}

String author;
   String edn;
  
     void reads()
     {
    	 author="AAAA";
    	 edn="Edn99";
     }
     
   void disp()
   {
	   inps();
	   reads();
	   System.out.println("Author : "+author+" "+" Edition : "+edn);
	  
   }
}
