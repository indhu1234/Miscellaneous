package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class demoderby {

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection("jdbc:derby:C://Users//MR USER//MyDB;create=true"," "," ");
		if(con != null)
		{
			System.out.println("Connected to DB1");
		}

	}

}
