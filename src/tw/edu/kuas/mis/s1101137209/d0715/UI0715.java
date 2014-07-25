package tw.edu.kuas.mis.s1101137209.d0715;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UI0715
 */
@WebServlet("/UI0715")
public class UI0715 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UI0715() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		java.io.PrintWriter out =response.getWriter();
				
		out.print(request.getSession().getAttribute("acc"));
		
		if(request.getSession().getAttribute("acc")!=null&&request.getSession().getAttribute("acc").equals("Steven"))
		{
			out.print("登入成功");
		
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action=D0715 method=post>");
		out.print("請輸入1900-2099年1-12月 <br/>");
		out.print("請輸入西元年:");
		out.print("<input type=text name=year required><br/>");
		out.print("請輸入當月份:");
		out.print("<input type=text name=mon required><br/>");
		out.print("請輸入使用者名稱:");
		out.print("<input type=text name=name required><br/>");
		out.print("<input type='submit' value='送出'>");
		out.print("<input type='reset' value='清除'>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		}
		else if(request.getSession().getAttribute("acc")==null)
			out.print("尚未登入");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		java.io.PrintWriter out =response.getWriter();

request.getSession().getAttribute("Steven");
		
		out.print(request.getSession().getAttribute("acc"));
		
		if(request.getSession().getAttribute("acc").equals("Steven"))
		{
			out.print("登入成功");
		
		
		out.print("<html>");
		out.print("<head>");
		out.print("<meta http-equiv='Content-Type' content='text/html; charset=utf-8'>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action=D0715 method=post>");
		out.print("請輸入1900-2099年1-12月 <br/>");
		out.print("請輸入西元年:");
		out.print("<input type=text name=year required><br/>");
		out.print("請輸入當月份:");
		out.print("<input type=text name=mon required><br/>");
		out.print("請輸入使用者名稱:");
		out.print("<input type=text name=name required><br/>");
		out.print("<input type='submit' value='送出'>");
		out.print("<input type='reset' value='清除'>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		}
		else if(request.getSession().getAttribute("acc")==null)
			out.print("尚未登入");
	
	}

}
