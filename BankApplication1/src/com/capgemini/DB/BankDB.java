package com.capgemini.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankDB {

	public static   Connection  getConnection() throws ClassNotFoundException, SQLException
	{
		String drivername="oracle.jdbc.driver.OracleDriver";
			Class.forName(drivername);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pajjuri","sweetypandu");
			
			return con;
		}

	
	

	}