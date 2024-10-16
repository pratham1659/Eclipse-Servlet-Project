package com.dbConnect;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

public class CreateData {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/javauser";
		String uname = "root";
		String pass = "root@1234";

		Statement stmt = null;
		ResultSet rs = null;
//		    Connection conn = null;
		Vector<String> columnNames = new Vector<String>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, uname, pass);
			System.out.println("Connection is created successfully");

//		    Create Query
				String create = "CREATE TABLE emp(empno int primary key, ename varchar(255))";
					
				PreparedStatement pstmt = conn.prepareStatement (create);
								
				pstmt.executeUpdate ();
				System.out.println("Created table in given database..."); 
				conn.close ();

			// Execute SQL query
			String sql = "SELECT * FROM javauser.emp";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null) {
				ResultSetMetaData columns = rs.getMetaData();
				int i = 0;
				while (i < columns.getColumnCount()) {
					i++;
					System.out.print(columns.getColumnName(i) + "\t");
					columnNames.add(columns.getColumnName(i));
				}
				System.out.print("\n");

				while (rs.next()) {
					for (i = 0; i < columnNames.size(); i++) {
						System.out.print(rs.getString(columnNames.get(i)) + "\t");

					}
					System.out.print("\n");
				}

			}
		} catch (Exception e) {
			System.out.println("Exception: " + e.toString());
		}

		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception mysqlEx) {
				System.out.println(mysqlEx.toString());
			}

		}
	}
}