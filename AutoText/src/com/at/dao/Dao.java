package com.at.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.at.pojo.Chapter;
import com.at.utils.DButil;


public class Dao {
	private Connection conn= null; 
	private PreparedStatement ps = null;
	
	public int  insert(Chapter chapter)
	{
		Connection conn = DButil.getConn() ;
		int i =0 ;
		String sql = "insert into itext(cha_num,cha_nm,content) VALUES(?,?,?)" ; 
		try {
			ps = conn.prepareStatement(sql) ;
			ps.setInt(1, chapter.getChaNum());
			ps.setString(2, chapter.getChaNm());
			ps.setString(3, chapter.getContent());
			i= ps.executeUpdate() ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i ;
		
	}
	
	
}
