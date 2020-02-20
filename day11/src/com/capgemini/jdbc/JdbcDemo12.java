package com.capgemini.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo12 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pajjuri","sweetypandu");
	  /*  
		PreparedStatement p2=c1.prepareStatement("select *from emp1");
	    ResultSet r=p2.executeQuery();
	    while(r.next())
	    {
	    	System.out.println(r.getInt(1)+" "+r.getString(2));
	    }
		*/
		
		/*PreparedStatement p=c1.prepareStatement("insert into emp1 values(?,?)");
		p.setInt(1, 103);
		p.setString(2,"c");
		int n=p.executeUpdate();
		System.out.println(n+"record is inserted");
		c1.close();*/
		
		
		/*PreparedStatement p1=c1.prepareStatement("create table emp1(empid number(3),empname varchar2(20))");
		boolean b=p1.execute();
		System.out.println("table is created");
		c1.close();*/
		/*PreparedStatement p=c1.prepareStatement("update emp1 set empid=? where empname=?");
		p.setInt(1, 110);
		p.setString(2,"c");
		int n=p.executeUpdate();
		System.out.println(n+"record is inserted");
		c1.close();*/
		PreparedStatement p=c1.prepareStatement("delete emp1 set empid=? where empname=?");
		p.setInt(1, 103);
		//p.setString(2,"c");
		int n=p.executeUpdate();
		System.out.println(n+"record is deleted");
		c1.close();
		
		
}
}