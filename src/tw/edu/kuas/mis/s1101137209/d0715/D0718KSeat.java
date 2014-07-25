package tw.edu.kuas.mis.s1101137209.d0715;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class D0718KSeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("http://khh.travel/foodxml.aspx?type=1",HTTPMethod.GET); 
		
		HTTPResponseTag response = con.getResult(request, "utf-8");
		
		try {
			JSONObject jo = XML.toJSONObject(response.getResponse());
			
			
			
			JSONObject Infos = jo.getJSONObject("Infos");
			JSONArray Description = Infos.getJSONArray("Info");
			System.out.println(Description.toString());
			
			for(int i=0;i<Description.length();i++){
				
				JSONObject temp=Description.getJSONObject(i);
				
				
				//System.out.println("<table border=1><tr><td></td></tr></table>");
				
				System.out.println(String.format("名稱: %s "
						+ "電話: %s "
						+ "地址: %s "
						+ "營業時間: %s", 
						temp.getString("Name") , 
						temp.getString("Tel") , 
						temp.getString("Add") , 
						temp.getString("Opentime")));
				
				/*
				System.out.print(temp.getString("Name"));
				System.out.print(temp.getString("Tel"));
				System.out.print(temp.getString("Add"));
				System.out.println(temp.getString("Opentime"));
				*/
			
			}
			
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
