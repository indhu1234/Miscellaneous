package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class demoupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		Class.forName("org.h2.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       try {
		Connection con=DriverManager.getConnection
("jdbc:h2:tcp://localhost/~/jdbcproj1", "sa","sa");
		Scanner sc=new Scanner(System.in);
		int eid1=sc.nextInt();
		String ename1=sc.next();
		
		PreparedStatement ps=con.prepareStatement
	("insert into emp(eid,ename) values(?,?)");
		ps.setInt(1, eid1);
		ps.setString(2, ename1);
		int rt=ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
	}

}
