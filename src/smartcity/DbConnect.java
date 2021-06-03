package smartcity;

import java.sql.*;

import javax.swing.JOptionPane;

public class DbConnect {
	Connection connect = null;

	public static Connection dataConnector() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_cityproject", "root",
					"rootpass");
			JOptionPane.showMessageDialog(null, "Successful connection");
			return connect;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
