package com.capgemini.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pajjuri","sweetypandu");
		Statement s=c.createStatement();
		/*boolean b=s.execute("create table pretty(empid number(3),empname varchar2(20))");
		System.out.println("table is created");
		c.close();*/
		/*int n=s.executeUpdate("insert into pretty values(1,'cvsr')");
		System.out.println(n+" record is inserted");
		c.close();*/
		/*int n=s.executeUpdate("update pretty set empname='anurag' where empid=1");
		System.out.println(n+" record is updated");
		*/
		/*int n=s.executeUpdate("delete from pretty where empid=1");
		System.out.println(n+" record is deleted");*/
		ResultSet r=s.executeQuery("select *from pretty");
				while(r.next())
				System.out.println(r.getInt(1)+" "+r.getString(2));
		}

}
