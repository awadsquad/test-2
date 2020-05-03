package cloudConnectivty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertLogin {
	public static void main(String[] args)
	  {
		// Temp 
		int userId = 0;
		String password = "What?";
	    try
	    {
	      // create a java mysql database connection
	      String myDriver = "org.gjt.mm.mysql.Driver"; // you need to make the part that send the insert
	      String myUrl = "jdbc:mysql://localhost:3306"; // This needs to be the cloud url
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "nA97114780!!"); //cloud link info
	      	    
	      // create the java mysql update prepared statement
	      String query = "/*insert information from java input into login information table*/\r\n" + 
	      		"INSERT INTO `world`.`login_info`\r\n" + 
	      		"(`idlogin_info`,\r\n" + 
	      		"`first_name`,\r\n" + 
	      		"`last_name`,\r\n" + 
	      		"`username`,\r\n" + 
	      		"`password`,\r\n" + 
	      		"`phone_number`,\r\n" + 
	      		"`email`,\r\n" + 
	      		"`status`,\r\n" + 
	      		"`ssn`,\r\n" + 
	      		"`securtity_question`,\r\n" + 
	      		"`security_answer`)\r\n" + 
	      		    		"VALUES\r\n" + 
	      		"(idlogin,\r\n" + 
	      		"first,  \r\n" + 
	      		"last,  \r\n" + 
	      		"usern, \r\n" + 
	      		"pswd, \r\n" + 
	      		"phnu, \r\n" + 
	      		"eml,\r\n" + 
	      		"stat, \r\n" + 
	      		"ssn, \r\n" + 
	      		"secq,\r\n" + 
	      		"seca);\r\n" + 
	      		""; //This changes based on what you are trying to do
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString(1, password); // this will go into the first ? mark
	      preparedStmt.setInt(2, userId); // This will go into the second ? mark

	      // execute the java prepared statement
	      preparedStmt.executeUpdate();
	      
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	  }
}
