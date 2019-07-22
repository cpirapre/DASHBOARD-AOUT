package org.ernest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
   
	    
	        System.out.println( "Hello World!" );
	        
	        RestTemplate restTemplate = new RestTemplate();
	        Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	        log.info(quote.toString());
	        
	    
    }
}


//To access the database
/* public static void main(String[] args) {
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
	  
	} */