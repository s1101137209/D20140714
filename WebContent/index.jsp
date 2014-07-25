<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<% String yy=request.getParameter("year"); %>
	<% String mm=request.getParameter("mon"); %>
	<%
	
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
}
else
{
	out.print("請輸入1900-2099年1-12月");
}
	%>
</body>
</html>