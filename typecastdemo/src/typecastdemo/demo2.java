package typecastdemo;

class Game
{
	public void play()
	{
		System.out.println("Play method from game class");
	}
	public void noofplayers()
	{
		System.out.println("no of players method from game class");
	}
	public void winner()
	{
		System.out.println("Winner method in game class");
	}
}
class Cricket extends Game
{

	public void noofplayers()
	{
		System.out.println("no of players method from cricket class");
	}
	public void teams()
	{
		System.out.println("Team method in game class");
	}
}
class chess extends Game
{
	
	public void noofplayers()
	{
		System.out.println("no of players method from chess class");
	}
	
}

public class demo2 
{
   public static void main(String ar[])
   {
	   /*Game game=new Cricket();
	   Cricket cric=new Cricket();
	   Game G=new Game();
	   //Cricket cobj=(Cricket) G;
	   cric=(Cricket) G;
	   game.play();
	   game.noofplayers();
	   game.winner();
	   System.out.println("Cricket class");
	   cric.play();
	   cric.noofplayers();
	   cric.winner();
	   cric.teams();
	   System.out.println("upcasting");
	   cobj.noofplayers();
	   
*/  
	 Game G=new Game();
     //Cricket C=new Cricket();
     Game gi=new Cricket();
     Game gii=new chess();
     //C=(Cricket) G;
     //Cricket cricket = (Cricket) G;
    // chess c = (chess) G;
     if(gi instanceof Cricket)
     {
        	
          gi.play();
           gi.noofplayers();
          gi.winner();	
}
     if(gii instanceof chess)
     {
         	
          gii.play();
          gii.noofplayers();
          gii.winner();	
      }
	   }
}
