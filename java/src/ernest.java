import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ernest {

	public static void main(String[] args) {
		  System.out.println("bonjour");
		  
		  try {
			  Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Charles\\Desktop\\moi\\unamur\\BAC3\\projet\\test java base de données\\test.db");
			  Statement statement = conn.createStatement();
			  //statement.execute("INSERT INTO Artiste (nom, age)" +
				//	  			"VALUES('Michael', 36)");
			  //statement.execute("INSERT INTO Artiste (nom, age)" +
			  //			"VALUES('George', 21)");
			  statement.execute("SELECT * FROM Artiste");
			  ResultSet results = statement.getResultSet();
			  
			  while(results.next()) {
				  System.out.println(results.getString("nom") + " " + results.getInt("id") + " "+ results.getInt("age"));
						  			
				  
			  }
			  
			  statement.close();
			  conn.close();
			  
		  }catch(SQLException e){
			  System.out.println("something went wrong" + e.getMessage());
		  }
		  
		}

}
