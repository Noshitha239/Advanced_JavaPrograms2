package com.gqt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin {
	private String admin_uname;
	private String admin_password;

	public Admin(String admin_uname, String admin_password) {
		super();
		this.admin_uname = admin_uname;
		this.admin_password = admin_password;
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public String getAdmin_uname() {
		return admin_uname;
	}

	public void setAdmin_uname(String admin_uname) {
		this.admin_uname = admin_uname;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
    
	public int adminLogin() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet res=null;
		
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			
			String s="select * from Admin where admin_uname=?";
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, admin_uname);
			res =pstmt.executeQuery();
			
			if(res.next()) {
				if(admin_password.equals(res.getString(2))) {
					return 1;//validcredentials
				}
				else {
					return -1;//invalid password
				}
			}
			else {
				return 0;//invalid username
			}
				
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	

}
