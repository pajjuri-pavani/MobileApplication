package com.capgemini.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDB {
	public static Connection getConnection1() throws ClassNotFoundException, SQLException
	{
		String drivername="oracle.jdbc.driver.OracleDriver";
		Class.forName(drivername);
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pajjuri","sweetypandu");
		return c;
	}
}


