package jdbcProject;

import java.sql.DriverManager;

import org.testng.annotations.Test;

public class DatabaseConnectivity
{
	@Test
	public void dbScript()
	{
		String host="localhost";
		String port="3306";
		DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/credentials","root","root@123");
		
	}

}
