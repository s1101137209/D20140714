package tw.edu.kuas.mis.s1101137209.d0715;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class D0722 {

	public static void main(String[] args) {
		
		//查詢  好友資料 ( ID 名稱 )
		
		HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("https://graph.facebook.com/480648231954342/members",HTTPMethod.GET); 
		
		request.pushAttributes("access_token", "CAACEdEose0cBANxx6aZAovWxp3pieXQGpDshOMkt0IJfr27CbrzBuahIisJ6VZAZAo4K9ZBCZAJA1pXfGKyycUmO7yF1q1m1Gpr0NrvDka2TJmhWRRqMg8ctKkTmP6AAZCNuLyztxwu3WzgMv8d5KYluYegNTz8PIdqioxZA7j6P6OjO3NP3rcOLvXfI58xgrNtg5F26vVS8DfZBXp5Vq2EwaMUjl00oFGwZD");

		//request.pushAttributes("message", "test 2014/7/20 04:27pm");
		
		HTTPResponseTag response = con.getResult(request, "utf-8");
		
		JSONObject jo = new JSONObject(response.getResponse());
		
		JSONArray data = jo.getJSONArray("data");
		
		
		
		try {
			//System.out.println(jo.toString());
			for(int i=0;i<data.length();i++){
			
				JSONObject temp=data.getJSONObject(i);
				//System.out.println(temp.toString());
				System.out.print(temp.getString("id"));
				System.out.println(temp.getString("name"));
				//System.out.println(String.format("ID:%s 姓名:%s  ",temp.getString("id"), temp.getString("name")));
			}
		} catch (JSONException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		//查詢  好友所接觸到的活動  ( events )
		
		/*
		出席/{user-id}/events/attending returns the events that the person is attending.
		舉辦/{user-id}/events/created returns the events that the person has created.
		或許/{user-id}/events/maybe returns the events that the person has RSVP'd 'maybe'.
		沒有回復/{user-id}/events/not_replied returns the events that the person has not yet RSVP'd.
		拒絕/{user-id}/events/declined returns the events that the person has declined to attend.
		*/
		
		
		HTTPRequestTag requestE = new HTTPRequestTag("https://graph.facebook.com/100006816911411/events",HTTPMethod.GET); 
		
		requestE.pushAttributes("access_token", "CAACEdEose0cBANxx6aZAovWxp3pieXQGpDshOMkt0IJfr27CbrzBuahIisJ6VZAZAo4K9ZBCZAJA1pXfGKyycUmO7yF1q1m1Gpr0NrvDka2TJmhWRRqMg8ctKkTmP6AAZCNuLyztxwu3WzgMv8d5KYluYegNTz8PIdqioxZA7j6P6OjO3NP3rcOLvXfI58xgrNtg5F26vVS8DfZBXp5Vq2EwaMUjl00oFGwZD");
		
		HTTPResponseTag responseE = con.getResult(requestE, "utf-8");
		
		JSONObject event = new JSONObject(responseE.getResponse());
		
		//System.out.println(event.toString());
		
		JSONArray eventdetail = event.getJSONArray("data");
		
		for(int i=0;i<eventdetail.length();i++)
		{
			JSONObject tt=eventdetail.getJSONObject(i);
			System.out.println(tt.toString());
			
		}

	}

}
