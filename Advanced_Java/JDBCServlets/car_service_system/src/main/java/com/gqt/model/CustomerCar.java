package com.gqt.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerCar{
     private String un;
     private String car_model;
     private String car_type;
     private String car_reg_no;
     private String service;
     private String status;
	public CustomerCar(String un, String car_model, String car_type, String car_reg_no, String service, String status) {
		super();
		this.un = un;
		this.car_model = car_model;
		this.car_type = car_type;
		this.car_reg_no = car_reg_no;
		this.service = service;
		this.status = status;
	}
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getCar_reg_no() {
		return car_reg_no;
	}
	public void setCar_reg_no(String car_reg_no) {
		this.car_reg_no = car_reg_no;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    public CustomerCar() {
    	 
    }
    public int getData() {
    	try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			String s="insert into customer_car_details values(?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, un);
			pstmt.setString(2, car_model);
			pstmt.setString(3, car_type);
			pstmt.setString(4, car_reg_no);
			pstmt.setString(5, "null");
			pstmt.setString(6, "null");
			
			int res=pstmt.executeUpdate();
			return res;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;	
    }
    public int requestService() {
    	try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			String s="UPDATE customer_car_details SET service=?, status=? where un=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			
			pstmt.setString(1, service);
			pstmt.setString(2, "Pending");
			pstmt.setString(3, un);
			int res=pstmt.executeUpdate();
			return res;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;	
    }
    public int editService() {
    	try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			String s="UPDATE customer_car_details SET car_model=?,car_type=?,car_reg_no=? ,service=?, status=? where un=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			
			pstmt.setString(1, car_model);
			pstmt.setString(2, car_type);
			pstmt.setString(3, car_reg_no);
			pstmt.setString(4, service);
			pstmt.setString(5, "pending");
			pstmt.setString(6, un);
			int res=pstmt.executeUpdate();
			return res;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;	
    }
    public String checkStatus() {
    	
		ResultSet res=null;
    	try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			String s="select * from customer_car_details where un=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			
			pstmt.setString(1, un);
			res=pstmt.executeQuery();
			if(res.next()) {
				status =res.getString(6);
			}
			return status;	
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;	
    }
 public int updateStatus() {
    	
    	try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carservicesystem","root","root");
			String s="UPDATE customer_car_details SET status=? where un=?";
			
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setString(1, "completed");
			pstmt.setString(2, un);
			int rows=pstmt.executeUpdate();
			return rows;	
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return 0;	
    }
}
