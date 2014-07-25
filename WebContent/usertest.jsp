<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<form action=D0715 method=get>
請輸入1900-2099年1-12月 <br/>
請輸入西元年:<input type=text name=year onchange="if(this.value.match(/[^0-9 \u4e00-\u9fa5０-９]/)){alert('僅能輸入數字!');this.value=this.value.replace(/[^0-9 \u4e00-\u9fa5０-９]/g,'')}"  required> <br/>
請輸入當月份:<input type=text name=mon onchange="if(this.value.match(/[^0-9 \u4e00-\u9fa5０-９]/)){alert('僅能輸入數字!');this.value=this.value.replace(/[^0-9 \u4e00-\u9fa5０-９]/g,'')}"  required> <br/>
請輸入使用者名稱:<input type=text name=name required> <br/>
<input type="submit" value="送出">
<input type="reset" value="清除">



</form>

<%



%>
</body>
</html>