package com.dbConnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateQuery {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/javauser";
		String uname = "root";
		String pass = "root@1234";
		
		
		try {
	        
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection is created successfully");
			 		
		
//			UpdateQuery
			String upd = "UPDATE students SET Student_name=? WHERE Student_Id=?";
		
			PreparedStatement pstmt = conn.prepareStatement (upd);
			
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
			System.out.println("Enter Student ID :");
			String Student_Id = br.readLine ();
			System.out.println("Enter Student Name :");
			String Studnet_name = br.readLine ();
//			System.out.println("Enter Student Email :");
//			String Student_email = br.readLine ();
//			System.out.println("Enter Student DateOfBirth :");
//			String Student_dob = br.readLine ();
		
//			set values to Query
			pstmt.setString (1,Student_Id);
			pstmt.setString (2,Studnet_name);
//			pstmt.setString (3,Student_email);
//			pstmt.setString (4,Student_dob);
//			
			pstmt.executeUpdate ();
			System.out.println("Updated Successfully");
			conn.close ();

		} catch (SQLException e) {
			System.out.println("Error Occurred");
			e.printStackTrace();
		}
	}
}
