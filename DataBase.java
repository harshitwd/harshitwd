package com.configuration;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {

	public static Connection getConnection() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restuarent","root","root");
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		DataBase.getConnection();
       System.out.println("COnneted");
	}
	
}
