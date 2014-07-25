package tw.edu.kuas.mis.s1101137209.d0715;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class D0718TP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("http://data.taipei.gov.tw/opendata/apply/query/NDY4QTkwQ0MtRUM5MS00RkRFLUI3OUUtNDQ5ODFDNEIxMkMx?$format=xml",HTTPMethod.GET); 
		
		HTTPResponseTag response = con.getResult(request, "utf-8");
		
		try {
			JSONObject jo = XML.toJSONObject(response.getResponse());
			JSONObject data = jo.getJSONObject("data");
			JSONArray row = data.getJSONArray("row");
			
			//System.out.println(row.toString());
			
			
			for(int i=0;i<row.length();i++){
				JSONObject temp=row.getJSONObject(i);
				
				System.out.println(String.format("公園:%s 地點:%s 經度:%s 緯度:%s"
						,temp.getString("Riverside_Park")
						,temp.getString("Location")
						,temp.getString("Latitude")
						,temp.getString("Longitude")));
				
				/*
				System.out.println(temp.getString("Latitude"));
				System.out.println(temp.getString("Location"));
				System.out.println(temp.getString("Longitude"));
				System.out.println(temp.getString("Riverside_Park"));
				*/
				
			}
			
			
			
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
