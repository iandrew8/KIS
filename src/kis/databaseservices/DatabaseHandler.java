package kis.databaseservices;

import java.sql.*;
public class DatabaseHandler {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "";
			String db_url = "jdbc:mysql://localhost/katikamu";
			
        	Connection connection = DriverManager.getConnection(db_url, username, password);
        	System.out.println("Connecting to Katikamu database....");
        	
        	Statement smt = connection.createStatement();
        	String query1 = "SELECT * FROM teacher";
        	ResultSet rs = smt.executeQuery(query1);
        	while(rs.next()) {
        		System.out.println("Teacher Name: " + rs.getString("name") + "\nSubject: " + rs.getString("subject"));
        	}
			
		}catch(Exception e) {
			System.out.println("Exception" + e.getMessage());
		}
	}
}
