package tw.edu.kuas.mis.s1101137209.d0715;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class D0722testpost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("https://graph.facebook.com/100006816911411/feed",HTTPMethod.POST); 
		
		request.pushAttributes("access_token", "CAACEdEose0cBANxx6aZAovWxp3pieXQGpDshOMkt0IJfr27CbrzBuahIisJ6VZAZAo4K9ZBCZAJA1pXfGKyycUmO7yF1q1m1Gpr0NrvDka2TJmhWRRqMg8ctKkTmP6AAZCNuLyztxwu3WzgMv8d5KYluYegNTz8PIdqioxZA7j6P6OjO3NP3rcOLvXfI58xgrNtg5F26vVS8DfZBXp5Vq2EwaMUjl00oFGwZD");

		request.pushAttributes("message", "test 2014/7/20 04:27pm");
		
		HTTPResponseTag response = con.getResult(request, "utf-8");
		
		
		System.out.println(response.getResponse());
	}

}
