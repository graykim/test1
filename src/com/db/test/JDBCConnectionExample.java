package com.db.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnectionExample {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "root", "1234");
			PreparedStatement pstmt = con.prepareStatement("select empno from emp");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("테스트다");
		System.out.println("테스트2");
		System.out.println("일부로 충돌");
	}

}
