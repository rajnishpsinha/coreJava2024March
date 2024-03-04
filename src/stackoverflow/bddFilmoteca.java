package stackoverflow;

import java.sql.*;

public class bddFilmoteca  {
	// Attributes for the connection:
	private static String URL = "jdbc:mysql://localhost:3306/mdt"; 
	private static String BDD = "Filmoteca";
	private static String USER = "root";
	private static String PASSWORD = "root";
	private static Connection con; //clase para crear una cadena de conexión al servidor o a la BD concreta 

	public bddFilmoteca() {
	    try {
	        con = DriverManager.getConnection(URL,  USER ,PASSWORD);
	        //+ "?useSSL=true",
	       /* try {
	            crearBDD();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }*/
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        System.out.println(ex.getMessage());
	        
	    }
	}
	public static void main (String[]args) throws Exception
	{
		 bddFilmoteca bdd= new  bddFilmoteca();
	Statement stmt =con.createStatement();
	String sql= "SELECT * FROM mdt.flats; ";
	ResultSet rs= stmt.executeQuery(sql);
	while(rs.next())
	{
		System.out.println(rs.getString(2));
	}
	
	
	}
}
