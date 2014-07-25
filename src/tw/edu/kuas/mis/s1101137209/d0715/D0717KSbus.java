package tw.edu.kuas.mis.s1101137209.d0715;


import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;




import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;


public class D0717KSbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	////  登入
				HTTPConnection con = new HTTPConnection();
				
				HTTPRequestTag request = new HTTPRequestTag("http://122.146.229.210/xmlbus2/GetEstimateTime.xml?routeIds=0%E5%8C%97,1",HTTPMethod.GET); 
				
				HTTPResponseTag response = con.getResult(request, "utf-8");
				
				try {
					JSONObject jo = XML.toJSONObject(response.getResponse());
					JSONObject BusDyinfo = jo.getJSONObject("BusDynInfo");
					JSONObject Route = BusDyinfo.getJSONObject("BusInfo");
					JSONObject EstimateTime = Route.getJSONObject("Route");
					JSONArray Goback = EstimateTime.getJSONArray("EstimateTime");
							
					
					
					for(int i=0;i<Goback.length();i++){
					
						JSONObject temp=Goback.getJSONObject(i);
						System.out.println(temp.getString("StopName"));
						System.out.println(temp.getString("comeTime"));
				
					}
				
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				
	}

}
