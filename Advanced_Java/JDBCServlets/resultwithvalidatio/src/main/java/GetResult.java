

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


public class GetResult extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tempid=request.getParameter("id");
		if(tempid.isEmpty()) {
			response.sendRedirect("/resultwithvalidatio/Error.html");
		}
		else {
			int id=Integer.parseInt(tempid);
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");

				String s="select *from Student where Stud_id=?";
				PreparedStatement pstmt = con.prepareStatement(s);
				pstmt.setInt(1, id);
				ResultSet res=pstmt.executeQuery();
				if(res.next()) {
					int tempid1= res.getInt(1);
					String tempName= res.getString(2);
					int tempmarks1= res.getInt(3);
					int tempmarks2= res.getInt(4);
					int tempmarks3= res.getInt(5);
					PrintWriter out=response.getWriter();
					out.println(tempid1+"   "+tempName+"   "+tempmarks1+"   "+tempmarks2+"   "+tempmarks3);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
