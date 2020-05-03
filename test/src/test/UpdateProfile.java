package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateProfile {
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
	      	    
	      // create the java mysql update preparedstatement
	      String query = "UPDATE login_info SET password = ? WHERE idlogin_info = ?"; //This changes based on what you are trying to do
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString(1, password); // this will go into the first ? mark
	      preparedStmt.setInt(2, userId); // This will go into the second ? mark

	      // execute the java preparedstatement
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

}
