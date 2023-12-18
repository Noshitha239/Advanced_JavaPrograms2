

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Insert extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tempid=request.getParameter("id");
		String tempname=request.getParameter("name");
		String tempmarks1=request.getParameter("marks1");
		String tempmarks2=request.getParameter("marks2");
		String tempmarks3=request.getParameter("marks3");
		//orif(tempid.length()!=0)
		if(tempid.isEmpty()||tempname.isEmpty()||tempmarks1.isEmpty()||tempmarks2.isEmpty()||tempmarks3.isEmpty()) {
			response.sendRedirect("/resultwithlinks/Inserterror.html");
		}
		else {
			int id=Integer.parseInt(tempid);
			int marks1=Integer.parseInt(tempmarks1);
			int marks2=Integer.parseInt(tempmarks2);
			int marks3=Integer.parseInt(tempmarks3);
			try {
				Statement stmt=null;
				Connection con=null;
				PreparedStatement pstmt=null;
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");
				String s="insert into Student values(?,?,?,?,?)";
				pstmt = con.prepareStatement(s);

				pstmt.setInt(1, id);
				pstmt.setString(2, tempname);
				pstmt.setInt(3, marks1);
				pstmt.setInt(4,marks2);
				pstmt.setInt(5, marks3);
				int rows=pstmt.executeUpdate();
				if(rows == 0) {
					response.sendRedirect("/resultwithlinks/Failure.html");
				}
				else {
					response.sendRedirect("/resultwithlinks/Success.html");
				}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
