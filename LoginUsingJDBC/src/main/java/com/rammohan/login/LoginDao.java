package com.rammohan.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/restdb";
	String username = "root";
	String password = "12345";
	String sql = "select * from login where username=? and password=?";

	public boolean check(String uname, String pswd) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pswd);
			ResultSet res = st.executeQuery();
			if (res.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
