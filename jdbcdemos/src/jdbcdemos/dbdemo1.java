package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbdemo1 {

	public static void main(String[] args) throws Exception
	{
		//System.out.println("Sample");
		try
		{
			Class.forName("org.h2.Driver");
		}	
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("Sample");
		//try(Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/jdbcproj1","sa","sa"))
		try
		{
		
			Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/jdbcproj1","sa","sa");
			if(con!=null)
			{
			System.out.println("Success");
			}
			
			Statement st=con.createStatement();
					//System.out.println("Success");
			ResultSet rs=st.executeQuery("select * from emp");
			
			//System.out.println("Success");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2));
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Success");
	}

}
