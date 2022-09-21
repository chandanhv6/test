package jdbcProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseConnectivity
{
	@Test
	public void dbScript() throws SQLException
	{
		String host="localhost";
		String port="3306";
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/DataArea","root","root123");
		Statement s = conn.createStatement();
		ResultSet sel = s.executeQuery("select * from tequilla where username='palaksha';");
		sel.next();
		System.out.println(sel.getString("username"));
		System.out.println(sel.getString("password"));
		
		
		ResultSet s1 = s.executeQuery("select * from tequilla where username='dinga';");
		s1.next();
		System.out.println(s1.getString("username")+" "+s1.getString("password"));
		
	}

}
