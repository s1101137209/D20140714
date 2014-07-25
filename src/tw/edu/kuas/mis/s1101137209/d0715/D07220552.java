package tw.edu.kuas.mis.s1101137209.d0715;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class D07220552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//動態 文章ID
		HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("https://graph.facebook.com/me/feed",HTTPMethod.GET); 
		
		request.pushAttributes("access_token", "CAACEdEose0cBAHX3LEa41HQi02TQ70ZArZC9cYWOnenuagf8vxqHfkKumrJHb0L4YoZB7zIiDA56AYw60OkdajlZCbkWgZA8fG2DO6NRyNPpm1EA9e4llOT1uUdHRbrf44zRmljQJdy9hx4gNAUe8ZC0zOTKNsmyFMUMOjAHr5MAGs7IZCFdP6pWYgsOOMZCASIPreerHvRqgJrAGMl0SD2fwckjLXnELpQZD");

		HTTPResponseTag response = con.getResult(request, "utf-8");
	
		JSONObject jo = new JSONObject(response.getResponse());
		
		JSONArray data = jo.getJSONArray("data");
		
		//System.out.println(data.toString());
		
		try {
			//System.out.println(jo.toString());
			for(int i=0;i<data.length();i++){
			
				JSONObject temp=data.getJSONObject(i);
				
				//System.out.println(temp.getString("id"));
				
				
				HTTPRequestTag requestm = new HTTPRequestTag(String.format("https://graph.facebook.com/%s", temp.getString("id")),HTTPMethod.GET); 
				requestm.pushAttributes("access_token", "CAACEdEose0cBANxx6aZAovWxp3pieXQGpDshOMkt0IJfr27CbrzBuahIisJ6VZAZAo4K9ZBCZAJA1pXfGKyycUmO7yF1q1m1Gpr0NrvDka2TJmhWRRqMg8ctKkTmP6AAZCNuLyztxwu3WzgMv8d5KYluYegNTz8PIdqioxZA7j6P6OjO3NP3rcOLvXfI58xgrNtg5F26vVS8DfZBXp5Vq2EwaMUjl00oFGwZD");
				HTTPResponseTag responsem = con.getResult(requestm, "utf-8");
			
				JSONObject jom = new JSONObject(responsem.getResponse());
				/*if(jom.getString("message").equals("hello"))
				{
					System.out.println(jom.getString("id"));
					System.out.println(jom.getString("message"));
					
					HTTPRequestTag requestp = new HTTPRequestTag(String.format("https://graph.facebook.com/%s", jom.getString("id")),HTTPMethod.POST); 
					requestp.pushAttributes("access_token", "CAACEdEose0cBANxx6aZAovWxp3pieXQGpDshOMkt0IJfr27CbrzBuahIisJ6VZAZAo4K9ZBCZAJA1pXfGKyycUmO7yF1q1m1Gpr0NrvDka2TJmhWRRqMg8ctKkTmP6AAZCNuLyztxwu3WzgMv8d5KYluYegNTz8PIdqioxZA7j6P6OjO3NP3rcOLvXfI58xgrNtg5F26vVS8DfZBXp5Vq2EwaMUjl00oFGwZD");
					//requestp.pushAttributes("message","I fuck you friend la I don't care your friend your father or your mother you I also don't care 是芒果啦~幹!");
					HTTPResponseTag responsep = con.getResult(requestp, "utf-8");
					
					System.out.println(responsep.getResponse());
				
				}
				//else
				//	System.out.println(jom.getString("message"));
*/
			}
		} catch (JSONException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//文章message
		HTTPRequestTag requestm = new HTTPRequestTag("https://graph.facebook.com/100000275089766_817015658317596",HTTPMethod.GET); 
		
		requestm.pushAttributes("access_token", "CAACEdEose0cBANxx6aZAovWxp3pieXQGpDshOMkt0IJfr27CbrzBuahIisJ6VZAZAo4K9ZBCZAJA1pXfGKyycUmO7yF1q1m1Gpr0NrvDka2TJmhWRRqMg8ctKkTmP6AAZCNuLyztxwu3WzgMv8d5KYluYegNTz8PIdqioxZA7j6P6OjO3NP3rcOLvXfI58xgrNtg5F26vVS8DfZBXp5Vq2EwaMUjl00oFGwZD");

		HTTPResponseTag responsem = con.getResult(requestm, "utf-8");
	
		JSONObject jom = new JSONObject(responsem.getResponse());
		
		//JSONArray datam = jom.getJSONArray("data");
		
		System.out.println(jom.toString());
		System.out.println(jom.getString("message"));
	}

}
