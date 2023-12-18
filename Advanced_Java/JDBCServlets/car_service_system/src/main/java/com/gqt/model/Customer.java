package com.gqt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String Name;
	private String un;
	private String pwd;
	private String email;
	
	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", un=" + un + ", pwd=" + pwd + ", email=" + email + "]";
	}
	public Customer(String Name,String un,String pwd,String email) {
		super();
		this.Name = Name;
		this.un = un;
		this.pwd = pwd;
		this.email = email;

	}//collect the data using constructor.
	public Customer(String Name,String un,String email) {
		super();
		this.Name = Name;
		this.un = un;

		this.email = email;

	}
	public Customer() {

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

	public int customerRegister() {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			String s="insert into customer values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, Name);
			pstmt.setString(2, un);
			pstmt.setString(3, pwd);
			pstmt.setString(4, email);
			int res=pstmt.executeUpdate();
			return res;
			//			if(res==0) {	
			//				return 0;
			//			}
			//			else {
			//				return 1;
			//			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;	
	}
	public List<Customer> registeredCustomers() {
		Statement stmt =null;
		ResultSet res =null;
		try {
			List<Customer> customerList=new ArrayList<Customer>();
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			String s="select * from customer";
			stmt = con.createStatement();
			res = stmt.executeQuery(s);

			while(res.next()) {
				Name=res.getString(1);
				un=res.getString(2);
				email=res.getString(4);
				customerList.add(new Customer(Name,un,email));
			}
			return customerList;
		}	
		catch(Exception e) {
			e.printStackTrace();
		}

		return null;		
	}
}
