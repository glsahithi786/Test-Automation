package com.qa.testsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class ConnectMySql {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Customer","root","Planit");
		System.out.println("Connected to MySQL DB");
		
		Statement smt = con.createStatement();
		
		ResultSet rs = smt.executeQuery("select * from Persons");
		
		while(rs.next()) {
			
			String LastName = rs.getString("LastName","FirstName");
			System.out.println("Database record is "+ LastName);
		}
	}
}
