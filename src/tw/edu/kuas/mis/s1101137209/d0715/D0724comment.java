package tw.edu.kuas.mis.s1101137209.d0715;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class D0724comment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("https://graph.facebook.com/me/feed",HTTPMethod.GET); 
		
		request.pushAttributes("access_token", "CAACEdEose0cBAJ9fT74JXcV6J5hlraS0Wpo4Y6seDZAXjurUGFt9J1fchFuhAnvR0BsXJit1BqIZBNhVdKwZAl8QgyexIfyXZConLZAuZBRoSOvDlCvo5StytEFAVNEhZAy7pZAXj6ZBpR1RRpmmMGsHkpTZCbLJwGeagtaPSfoeiZCaFf7rHRXwOeRjHEUJrxHhFOelAzaAxZBCgHohmnoOVgb0LUjAe4gB12EZD");

		HTTPResponseTag response = con.getResult(request, "utf-8");
			
		JSONObject jo = new JSONObject(response.getResponse());
				
		JSONArray comment = jo.getJSONArray("data");
		
		System.out.println(jo.toString());
		/*
		for(int i =0;i<comment.length();i++)
		{
			JSONObject data = comment.getJSONObject(i);
			System.out.print(data.toString());
			//System.out.print(data.getString("id"));
			//System.out.println(data.getString("message"));
			
			System.out.println("留言者："+name.getString("name"));
			System.out.println("時間："+temp.getString("created_time"));
			System.out.println("內容："+temp.getString("message"));
			System.out.println(temp);
			
			//System.out.println(temp.getString( "id"));
			
		}*/

	}

}
