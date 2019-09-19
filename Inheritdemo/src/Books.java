
public class Books 
{
   int bookid,pubid;
   String publisher;
   String bookname;
  public Books(int bid,String bname,int pid,String pname)
   {
	   bookid=bid;
	   bookname=bname;
	   pubid=pid;
	   publisher=pname;
	   System.out.println("Base Class");
   }
   void inps()
   {
	   System.out.println("Books details");
	   System.out.println("Book id : "+bookid+" "+"Book name : "+bookname);
	   System.out.println("Publisher id : "+pubid+" "+" Publisher name : "+publisher);
   }
}
