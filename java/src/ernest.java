import java.sql.Connection;
import java.sql.DriverManager;


public class ernest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		      Class.forName("org.postgresql.Driver");
		      System.out.println("Driver O.K.");

		      /*String url = "jdbc:postgresql://localhost:5432/Ernest";
		      String user = "postgres";
		      String passwd = "Ernest123";

		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      System.out.println("Connexion effective !");    */     
		         
		    } catch (Exception e) {
		      e.printStackTrace();
		    }   
	}

}
