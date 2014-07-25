package tw.edu.kuas.mis.s1101137209.d0715;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		java.io.PrintWriter out =response.getWriter();
		
		String acc = request.getParameter("acc").toString();
		String psw = request.getParameter("psw").toString();
		
		if(acc.equals("Steven")&&psw.equals("1234")){
			out.print("登入成功");
			request.getSession().setAttribute("acc", "Steven");
			response.sendRedirect("UI0715");}
		else
			out.print("登入失敗");
			

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		java.io.PrintWriter out =response.getWriter();
		
		String acc = request.getParameter("acc").toString();
		String psw = request.getParameter("psw").toString();
		
		if(acc.equals("Steven")&&psw.equals("1234")){
			out.print("登入成功");
			request.getSession().setAttribute("acc", "Steven");
			response.sendRedirect("UI0715");}
		else
			out.print("登入失敗");
			
	}

}
