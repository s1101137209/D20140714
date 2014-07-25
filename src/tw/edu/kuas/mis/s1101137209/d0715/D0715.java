package tw.edu.kuas.mis.s1101137209.d0715;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class D0715
 */
@WebServlet("/D0715")
public class D0715 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public D0715() {
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
		
		String yy=request.getParameter("year"); 
		String mm=request.getParameter("mon");
		String nn=request.getParameter("name"); 
		System.out.println(nn);
		int year = Integer.parseInt(yy);
		yy=yy.substring(0,2);
		int century=Integer.parseInt(yy);
		int mon = Integer.parseInt(mm);
		int st1=0,st2=0,st3=0,st4=0,st5=0,st6=0;
		int x=1,y=0,maxday=0;
	if(year<2100 && year >= 1900 && mon<=12 && mon >=1)
	{
		if(mon==1 || mon==10)
			st4=0;
		else if(mon==5)
			st4=1;
		else if(mon==8)
			st4=2;
		else if (mon==2 || mon==3 || mon==11)
			st4=3;
		else if (mon==6)
			st4=4;
		else if (mon==9 || mon==12)
			st4=5;
		else if (mon==4 || mon==7)
			st4=6;
		

		st1=2*(3-(century%4));
		st2=year-2000;
		st3=(st2-(st2%4))/4;
		st5=st1+st2+st3+st4+1;
		st6=st5%7;
		y=st6;
		
		if(mon==1 || mon==3 || mon==5 || mon==7 || mon==8 || mon==10 || mon==12)
			maxday=31;
		else if (mon==4 || mon==6 || mon==9 || mon==11)
			maxday=30;
		else if (mon==2)
		{
			if(year%400==0)
				maxday=29;
			else if (year%100==0)
				maxday=28;
			else if (year%4==0)
				maxday=29;
			else
				maxday=28;
		}
			
		
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print(nn);
		out.print("</br>");
		out.print(year + "年" + mon +"月");
		out.print("<table border=1 >");
		out.print("<tr>");
		out.print("<td>日</td>");
		out.print("<td>一</td>");
		out.print("<td>二</td>");
		out.print("<td>三</td>");
		out.print("<td>四</td>");
		out.print("<td>五</td>");
		out.print("<td>六</td>");
		out.print("</tr>");
		for(int a=1;a<=6;a++){
			out.print("<tr>");
			for(int b=1;b<=7;b++)
			{
			if(y>0){
				y=y-1;
				out.print("<td> &nbsp;</td>");
			}
			else if(x>maxday)
			{
				out.print("<td> &nbsp;</td>");
			}
			else
			{
				out.print("<td>"+x+"</td>");
				x=x+1;
			}
			}
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}
	else
	{
		out.print("請輸入1900-2099年1-12月");
	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		java.io.PrintWriter out =response.getWriter();
		
		String yy=request.getParameter("year"); 
		String mm=request.getParameter("mon");
		String nn=request.getParameter("name"); 
		
		int year = Integer.parseInt(yy);
		yy=yy.substring(0,2);
		int century=Integer.parseInt(yy);
		int mon = Integer.parseInt(mm);
		int st1=0,st2=0,st3=0,st4=0,st5=0,st6=0;
		int x=1,y=0,maxday=0;
	if(year<2100 && year >= 1900 && mon<=12 && mon >=1)
	{
		if(mon==1 || mon==10)
			st4=0;
		else if(mon==5)
			st4=1;
		else if(mon==8)
			st4=2;
		else if (mon==2 || mon==3 || mon==11)
			st4=3;
		else if (mon==6)
			st4=4;
		else if (mon==9 || mon==12)
			st4=5;
		else if (mon==4 || mon==7)
			st4=6;
		

		st1=2*(3-(century%4));
		st2=year-2000;
		st3=(st2-(st2%4))/4;
		st5=st1+st2+st3+st4+1;
		st6=st5%7;
		y=st6;
		
		if(mon==1 || mon==3 || mon==5 || mon==7 || mon==8 || mon==10 || mon==12)
			maxday=31;
		else if (mon==4 || mon==6 || mon==9 || mon==11)
			maxday=30;
		else if (mon==2)
		{
			if(year%400==0)
				maxday=29;
			else if (year%100==0)
				maxday=28;
			else if (year%4==0)
				maxday=29;
			else
				maxday=28;
		}
			
		
		out.print("<html>");
		out.print("<head></head>");
		out.print("<body>");
		out.print(nn);
		out.print("</br>");
		out.print(String.format("%s年%s月",year,mon));
		//String.format("%s年%s月",year,mon);
		out.print("<table border=1 >");
		out.print("<tr>");
		out.print("<td>日</td>");
		out.print("<td>一</td>");
		out.print("<td>二</td>");
		out.print("<td>三</td>");
		out.print("<td>四</td>");
		out.print("<td>五</td>");
		out.print("<td>六</td>");
		out.print("</tr>");
		for(int a=1;a<=5;a++){
			out.print("<tr>");
			for(int b=1;b<=7;b++)
			{
			if(b==7 && a==5 && maxday>x)
			{
				a=4;
			}
			if(b==7 && a==4 && maxday==x)
			{
				a=5;
			}
			if(y>0){
				y=y-1;
				out.print("<td> &nbsp;</td>");
			}
			else if(x>maxday)
			{
				out.print("<td> &nbsp;</td>");
			}
			else
			{
				out.print(String.format("<td>%s</td>", x));
				//String.format("<td>%s</td>", x);
				x=x+1;
			}
			}
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}
	else
	{
		out.print("請輸入1900-2099年1-12月");
	}
		
	}

}
