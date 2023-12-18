

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Employee extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tempid=request.getParameter("id");
		int id=Integer.parseInt(tempid);

		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");

			String s="select *from Employee where Employee_id=?";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setInt(1, id);
			ResultSet res=pstmt.executeQuery();
			if(res.next()) {
				int tempid1= res.getInt(1);
				String tempName= res.getString(2);
				int tempsalary= res.getInt(3);
				
				PrintWriter out=response.getWriter();
				out.println(tempid1+"   "+tempName+"   "+tempsalary);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
