package tw.edu.kuas.mis.s1101137209.d0715;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class D0718fb {

	public static void main(String[] args) {
		
		//查詢  好友資料 ( ID 名稱 )
		
		HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("https://graph.facebook.com/me/feed",HTTPMethod.POST); 
		
		request.pushAttributes("access_token", "CAACEdEose0cBANxx6aZAovWxp3pieXQGpDshOMkt0IJfr27CbrzBuahIisJ6VZAZAo4K9ZBCZAJA1pXfGKyycUmO7yF1q1m1Gpr0NrvDka2TJmhWRRqMg8ctKkTmP6AAZCNuLyztxwu3WzgMv8d5KYluYegNTz8PIdqioxZA7j6P6OjO3NP3rcOLvXfI58xgrNtg5F26vVS8DfZBXp5Vq2EwaMUjl00oFGwZD");

		request.pushAttributes("message", "test 2014/7/20 04:27pm");
		
		HTTPResponseTag response = con.getResult(request, "utf-8");
		
		
		System.out.println(response.getResponse());
		//JSONObject jo = new JSONObject(response.getResponse());
		
		//JSONArray data = jo.getJSONArray("data");
		
		
		/*
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
		HTTPRequestTag requestE = new HTTPRequestTag("https://graph.facebook.com/me/events/created",HTTPMethod.GET); 
		
		requestE.pushAttributes("access_token", "CAACEdEose0cBABhGZCPvowYNZCZCx9NcVSoynSJICNqUrw3xLyMZAgTwhjooJFvTgmibZCyqZCLfZBKyzwmtVsjaKtnZCRk0Vo2ZCvYLskVJ4aHfi4Ujd1d7gENZCd7WrQ6ZA7MfuDobcsWGxTbBhbiDKif9ZALQOK7sm5oBp8L53xq82TF0bOqeBRIYvMMKm4CSSUAlO87ribpTl43AvsrV1ZA6qGfUY3hvVw7YZD");
		
		HTTPResponseTag responseE = con.getResult(requestE, "utf-8");
		
		JSONObject event = new JSONObject(responseE.getResponse());
		
		//System.out.println(event.toString());
		
		JSONArray eventdetail = event.getJSONArray("data");
		
		for(int i=0;i<eventdetail.length();i++)
		{
			JSONObject tt=eventdetail.getJSONObject(i);
			System.out.println(tt.toString());
			System.out.println(String.format("活動ID:%s 活動名稱:%s 地點:%s 開始時間:%s  ",tt.getString("id"), tt.getString("name"), tt.getString("location"), tt.getString("start_time")));
		}
*/
	}

}
