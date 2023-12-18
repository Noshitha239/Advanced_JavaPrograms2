

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Validation extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tempid=request.getParameter("id");
		if(tempid.length()!=0) {
			request.getServletContext().getRequestDispatcher("/GetResult").forward(request, response);
		}
		else {
			response.sendRedirect("/resultwithchaining/Error.html");
		}
	}

}
