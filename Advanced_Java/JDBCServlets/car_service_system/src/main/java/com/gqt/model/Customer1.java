package com.gqt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Customer1 {
	private String Name;
	private String un;
	private String pwd;
	private String email;

	public Customer1(String name, String un, String pwd, String email) {
		super();
		Name = name;
		this.un = un;
		this.pwd = pwd;
		this.email = email;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Customer1() {
		
	}

	public int customerLogin() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet res=null;
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			String s="select * from customer where un=?";
			pstmt = con.prepareStatement(s);
			
			pstmt.setString(1, un);
			res =pstmt.executeQuery();
			

			if(res.next()) {
				Name = res.getString(1);
				if(pwd.equals(res.getString(3))) {	
//					System.out.println("1");
					return 1;//validcredentials
				}
				else {
					System.out.println("-1");
					return -1;//invalid password
				}
			}
			else {
				System.out.println("0");

				return 0;//invalid username
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
