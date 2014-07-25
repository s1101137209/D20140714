package tw.edu.kuas.mis.s1101137209.d0715;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class main0716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////  登入
		HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("http://140.127.113.231/kuas/perchk.jsp",HTTPMethod.POST); 
		
		request.pushAttributes("uid", "1101137240" );
		request.pushAttributes("pwd", "2843" );
		
		HTTPResponseTag response = con.getResult(request, "utf-8");
		
		//System.out.println(response.getResponse());
		
		
		////   查詢
		
		/*
		HTTPRequestTag requestData = new HTTPRequestTag("http://140.127.113.231/kuas/ag_pro/ag304.jsp",HTTPMethod.POST); 
		
		requestData.setCookies(response.getCookies());
		
		HTTPResponseTag responseStudentData = con.getResult(requestData, "utf-8");
		
		System.out.println(responseStudentData.getResponse());
		
		//String temp= responseStudentData.getResponse();
		
		//temp = temp.split("姓　　名")[1];
		//temp = temp.split("</td>")[0]; 
		
		//System.out.println("姓名"+temp);
		
		
		*********************************
		*************ag304_01************
		*********************************
		HTTPRequestTag requestData01 = new HTTPRequestTag("http://140.127.113.231/kuas/ag_pro/ag304_01.jsp",HTTPMethod.GET); 
		
		requestData01.setCookies(responseStudentData.getCookies());
		
		HTTPResponseTag responseStudentData01 = con.getResult(requestData01, "utf-8");
		
		System.out.println(responseStudentData01.getResponse());
		
		
		*********************************
		*************ag304_02************
		*********************************
		HTTPRequestTag requestData02 = new HTTPRequestTag("http://140.127.113.231/kuas/ag_pro/ag304_02.jsp",HTTPMethod.POST); 
				
		requestData02.setCookies(response.getCookies());
		requestData02.pushAttributes("yms_yms", "103#1");
		requestData02.pushAttributes("dgr_id", "UM78");
		requestData02.pushAttributes("unit_serch", "查 詢");
		requestData02.pushAttributes("ls_dvs_id", "1");
		requestData02.pushAttributes("ls_yn", "N");
				
		HTTPResponseTag responseStudentData02 = con.getResult(requestData02, "utf-8");
				
		System.out.println(responseStudentData02.getResponse());
		
		
		*/
		
		//*********************************
		//*************ag304_03************
		//*********************************
		HTTPRequestTag requestData03 = new HTTPRequestTag("http://140.127.113.231/kuas/ag_pro/ag304_03.jsp",HTTPMethod.POST); 
		
		requestData03.setCookies(response.getCookies());
		
		requestData03.pushAttributes("arg01","103" );
		requestData03.pushAttributes("arg02","1" );
		requestData03.pushAttributes("arg","UM781432" );
		
				
		HTTPResponseTag responseStudentData03 = con.getResult(requestData03, "utf-8");
				
		
		
		//System.out.println(responseStudentData03.getResponse());
		
		String temp = responseStudentData03.getResponse();
		/*
		String classname = temp.split("張俊陽<br>MA212<br>&nbsp;</font></td><td align=left bgcolor='#FFFcee' valign=top><font style='font-style: normal; font-variant: normal; font-weight: normal; font-size: 9pt; font-family: 細明體'>&nbsp;</font></td><td align=left bgcolor='#FFFcee' valign=top><font style='font-style: normal; font-variant: normal; font-weight: normal; font-size: 9pt; font-family: 細明體'>")[1];
		classname = classname.split("<br>")[0]; 
		
		String twname = temp.split("電子化流程設計與管理&nbsp;</td><td >01&nbsp;</td><td >3.0&nbsp;</td><td >3.0&nbsp;</td><td >【選修】&nbsp;</td><td >【學期】&nbsp;</td><td >")[1];
		twname = twname.split("<td >")[1];
		twname = twname.split("&nbsp")[0];
		
		String classid = temp.split("&nbsp;</td><td >電子化流程設計與管理&")[0];
		classid = classid.split("bgcolor='#FFFcee'><td >")[1];
		
		String classdegree = temp.split("與管理&nbsp;</td><td >01&nbsp;</td><td >")[1];
		classdegree = classdegree.split("&nbsp")[0];
		
		String timedegree = temp.split("管理&nbsp;</td><td >01&nbsp;</td><td >3.0&nbsp;</td><td >")[1];
		timedegree = timedegree.split("&nbsp")[0];

		String yon = temp.split("管理&nbsp;</td><td >01&nbsp;</td><td >3.0&nbsp;</td><td >3.0&nbsp;</td><td >")[1];
		yon = yon.split("&nbsp")[0];
		
		String classtime = temp.split("管理&nbsp;</td><td >01&nbsp;</td><td >3.0&nbsp;</td><td >3.0&nbsp;</td><td >【選修】&nbsp;</td><td >【學期】&nbsp;</td><td >")[1];
		classtime = classtime.split("&nbsp")[0];
		
		String room = temp.split("電子化流程設計與管理&nbsp;</td><td >01&nbsp;</td><td >3.0&nbsp;</td><td >3.0&nbsp;</td><td >【選修】&nbsp;</td><td >【學期】&nbsp;</td><td >")[1];
		room = room.split("汪維揚&nbsp;</td><td >")[1];
		room = room.split("&nbsp")[0];
		
		System.out.println("學年學期：103學年度第一學期");
		System.out.println("系所名稱：資訊管理系");
		System.out.println("班級名稱：四資三乙");
		System.out.println(String.format("選課代碼:%s  科目:%s  學分:%s  時數:%s  必選修:%s  上課時間:%s  授課老師:%s  教室:%s", classid,classname,classdegree,timedegree,yon,classtime,twname,room));
		*/
		
		
		
		String[] cnum = temp.split("教學綱要</u></td></tr><tr align=left bgcolor");
		String[] cn = temp.split("教學綱要</u></td></tr><tr align=left bgcolor");
		String[] cs = temp.split("教學綱要</u></td></tr><tr align=left bgcolor");
		String[] td = temp.split("教學綱要</u></td></tr><tr align=left bgcolor");
		String[] yn = temp.split("教學綱要</u></td></tr><tr align=left bgcolor");
		String[] ct = temp.split("教學綱要</u></td></tr><tr align=left bgcolor");
		String[] tn = temp.split("教學綱要</u></td></tr><tr align=left bgcolor");
		String[] rm = temp.split("教學綱要</u></td></tr><tr align=left bgcolor");
		
		for(int i=0;i<cnum.length;i++){
			
			cs[i]=cnum[i].split("&nbsp;</td><td >01&nbsp;</td><td >")[1];
			cs[i]=cs[i].split("&nbsp")[0];
			
			td[i]=cnum[i].split(String.format("&nbsp;</td><td >%s&nbsp;</td><td >",cs[i]))[1];
			td[i]=td[i].split("&nbsp")[0];
			
			yn[i]=cnum[i].split(String.format("%s&nbsp;</td><td >%s&nbsp;</td><td >",cs[i],td[i]))[1];
			yn[i]=yn[i].split("&nbsp")[0];
			
			ct[i]=cnum[i].split(String.format("%s&nbsp;</td><td >%s&nbsp;</td><td >%s&nbsp;</td><td >【學期】&nbsp;</td><td >",cs[i],td[i],yn[i]))[1];
			ct[i]=ct[i].split("&nbsp")[0];
			
			rm[i]=cnum[i].split(String.format("%s&nbsp;</td><td >【學期】&nbsp;</td><td >",yn[i]))[1];
			rm[i]=rm[i].split("&nbsp;</td><td name=")[0];
			rm[i]=rm[i].split("</td><td >")[2];
			
			cnum[i]=cnum[i].split("><td >")[1];
			cnum[i]=cnum[i].split("&nbsp")[0];
			
			tn[i]=tn[i].split("><td >")[9];
			tn[i]=tn[i].split("&nbsp")[0];
			
			cn[i]=cn[i].split("><td >")[2];
			cn[i]=cn[i].split("&nbsp")[0];
			
			System.out.println(String.format("選課代碼:%s  科目:%s  學分:%s  時數:%s  必選修:%s  上課時間:%s  授課老師:%s  教室:%s", cnum[i],cn[i],cs[i],td[i],yn[i],ct[i],tn[i],rm[i]));

		}

	}

}
