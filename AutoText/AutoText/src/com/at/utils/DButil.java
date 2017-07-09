package com.at.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DButil {

	private static String user = "root" ; 
	private static String pwd ="123456"; 
	private static String url="jdbc:MySQL://localhost:3306/autotext" ;
	
	
	public static  Connection getConn()
	{
		
		Connection conn = null;
		try {
		Class.forName("com.mysql.jdbc.Driver") ;
		conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn ; 
	}
	
	
}
