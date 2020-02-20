package com.capgemini.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pajjuri","sweetypandu");
		CallableStatement s=c1.prepareCall("{call hi(?,?)}");
		s.setInt(1, 101);
		s.setString(2,"jyothi");
		s.execute();
		System.out.println("success");
	}

}
