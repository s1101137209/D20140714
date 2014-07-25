<%@ page language="java" contentType="text/html; charset=BIG5"  
    pageEncoding="BIG5"%>  
<html>  
<head>  
<title>TomCat2</title>  
</head>  
<body>  
<p align="center">ды╛ф</p><br>  
<table border=1 width=630>  
<tr>  
<th>Sun</th><th>Mon</th><th>Tue</th><th>Wed</th><th>Thu</th><th>Fri</th><th>Sat</th>  
</tr>  
<%  
int x=1,y;  
while(x<=31)  
{  
    out.print("<tr>");  
    for(y=1;y<=7;y++)  
    {   
        out.print("<td align=center>");  
        out.print(x+"</td>");  
        x++;  
        if(x>31)  
            break;  
    }  
    out.print("</tr>");  
}   
%>  
</table>  
</body>  
</html>  