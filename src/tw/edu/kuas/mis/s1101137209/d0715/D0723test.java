package tw.edu.kuas.mis.s1101137209.d0715;

import java.util.TimerTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.json.HTTP;

import com.jerrywu.http.HTTPConnection;
import com.jerrywu.http.HTTPMethod;
import com.jerrywu.http.HTTPRequestTag;
import com.jerrywu.http.HTTPResponseTag;

public class D0723test extends TimerTask{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//動態 文章ID
		HTTPConnection con = new HTTPConnection();
				
		HTTPRequestTag request = new HTTPRequestTag("https://graph.facebook.com/me/feed",HTTPMethod.GET); 
		
		request.pushAttributes("access_token", "CAACEdEose0cBACHU5KuH6TZCyHGnIofzY5BAH68EcF6OWhfzr0nq8toD1aZBujjdscLXnBXoWgZAYPZABIbcZBhDKRSUuhNbP65Lzu1NZAcmsia4hT82kEpMfvIPj9ZAqBfVOZCE3LVIGwPdXaXxldMo2iNCohZCLN1XOXLWQtanvJ1Rxl2IAjaPctKfEev5fC1HgEwZCwDQQoH96iEA0pfysNrMG3zxXZB6W4ZD");

		HTTPResponseTag response = con.getResult(request, "utf-8");
			
		JSONObject jo = new JSONObject(response.getResponse());
				
		JSONArray data = jo.getJSONArray("data");
				
		//System.out.println(data.toString());
				
		try {
			for(int i=0;i<data.length();i++){
				
			JSONObject temp=data.getJSONObject(i);
				
			HTTPRequestTag requestm = new HTTPRequestTag(String.format("https://graph.facebook.com/%s", temp.getString("id")),HTTPMethod.GET); 
			requestm.pushAttributes("access_token", "CAACEdEose0cBACHU5KuH6TZCyHGnIofzY5BAH68EcF6OWhfzr0nq8toD1aZBujjdscLXnBXoWgZAYPZABIbcZBhDKRSUuhNbP65Lzu1NZAcmsia4hT82kEpMfvIPj9ZAqBfVOZCE3LVIGwPdXaXxldMo2iNCohZCLN1XOXLWQtanvJ1Rxl2IAjaPctKfEev5fC1HgEwZCwDQQoH96iEA0pfysNrMG3zxXZB6W4ZD");
			HTTPResponseTag responsem = con.getResult(requestm, "utf-8");
			
			JSONObject jom = new JSONObject(responsem.getResponse());
			
			System.out.println(jom.getString("id"));
			//System.out.println(jom.getString("message"));

			
			//String msg=jom.getString("message");
			
			//System.out.println(msg);
			
			//msg=msg.substring(0,3);
			String[] ss=new String[22];
			ss[0]="基隆市";ss[1]="臺北市";ss[2]="新北市";ss[3]="桃園縣";ss[4]="新竹市";ss[5]="新竹縣";
			ss[6]="苗栗縣";ss[7]="臺中市";ss[8]="彰化縣";ss[9]="雲林縣";ss[10]="南投縣";ss[11]="嘉義市";
			ss[12]="嘉義縣";ss[13]="臺南市";ss[14]="高雄市";ss[15]="屏東縣";ss[16]="宜蘭縣";
			ss[17]="花蓮縣";ss[18]="臺東縣";ss[19]="澎湖縣";ss[20]="連江縣";ss[21]="金門縣";
			
			
			if(jom.isNull("message"))
			{}
			else{
				String msg=jom.getString("message");
				
				//System.out.println(msg);
				//msg=msg.substring(0,3);
				//System.out.println(msg);
				
				//System.out.println(jom.getString("id"));
				//System.out.println(jom.getString("message"));
				for(int j=0;j<22;j++)
				{
					if(msg.contains(ss[j])==false){					
					}
					else{
						System.out.println(ss[j]+"ss[j]");
						msg=ss[j];
						System.out.println(msg);
						
						
					}
				}
				
				
				
				//System.out.println(msg);
				
				//msg=msg.substring(0,3);
				//System.out.println(msg);
				//判斷有沒有"市"字
				
				
				HTTPRequestTag requestTF = new HTTPRequestTag("http://www.dgpa.gov.tw/",HTTPMethod.GET); 
				HTTPResponseTag responseTF = con.getResult(requestTF, "utf-8");
				JSONObject joTF = HTTP.toJSONObject(responseTF.getResponse());
				
				
			    
				String temps= responseTF.getResponse();
				//System.out.println(temps);
				temps = temps.split(String.format("size=2>%s", msg))[1];
				temps = temps.split("<FONT color=#000080 size=2>")[1];
				temps = temps.split("</FONT>")[0];
				
				System.out.println(temps);
				
				
				HTTPRequestTag requestp = new HTTPRequestTag(String.format("https://graph.facebook.com/%s/comments", jom.getString("id")),HTTPMethod.POST); 
				requestp.pushAttributes("access_token", "CAACEdEose0cBACHU5KuH6TZCyHGnIofzY5BAH68EcF6OWhfzr0nq8toD1aZBujjdscLXnBXoWgZAYPZABIbcZBhDKRSUuhNbP65Lzu1NZAcmsia4hT82kEpMfvIPj9ZAqBfVOZCE3LVIGwPdXaXxldMo2iNCohZCLN1XOXLWQtanvJ1Rxl2IAjaPctKfEev5fC1HgEwZCwDQQoH96iEA0pfysNrMG3zxXZB6W4ZD");
				requestp.pushAttributes("message",temps.toString());
				HTTPResponseTag responsep = con.getResult(requestp, "utf-8");
					
				System.out.println(responsep.getResponse());
				
				
				
			}
			//else
			//	System.out.println(jom.getString("message"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*
		//讀取 資訊 
		
		
		HTTPRequestTag requestTF = new HTTPRequestTag("http://www.dgpa.gov.tw/",HTTPMethod.GET); 
		HTTPResponseTag responseTF = con.getResult(requestTF, "utf-8");
		JSONObject joTF = HTTP.toJSONObject(responseTF.getResponse());
		
		//System.out.println(responseTF.getResponse());
		
		
		try {
			
			String temp= responseTF.getResponse();
			// 字串節曲
			String s1="12345";
			String s2 = s1.substring(0,3);
			
			System.out.println(s2);
			
			
			temp = temp.split(String.format("<FONT size=2>%s", msg))[1];
			temp = temp.split("<FONT color=#000080 size=2>")[1];
			temp = temp.split("</FONT></TD></TR>")[0];
			
			System.out.println(temp);
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
*/

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		//動態 文章ID
		HTTPConnection con = new HTTPConnection();
		
		HTTPRequestTag request = new HTTPRequestTag("https://graph.facebook.com/me/feed",HTTPMethod.GET); 
		
		request.pushAttributes("access_token", "CAACEdEose0cBACHU5KuH6TZCyHGnIofzY5BAH68EcF6OWhfzr0nq8toD1aZBujjdscLXnBXoWgZAYPZABIbcZBhDKRSUuhNbP65Lzu1NZAcmsia4hT82kEpMfvIPj9ZAqBfVOZCE3LVIGwPdXaXxldMo2iNCohZCLN1XOXLWQtanvJ1Rxl2IAjaPctKfEev5fC1HgEwZCwDQQoH96iEA0pfysNrMG3zxXZB6W4ZD");

		HTTPResponseTag response = con.getResult(request, "utf-8");
			
		JSONObject jo = new JSONObject(response.getResponse());
				
		JSONArray data = jo.getJSONArray("data");
				
		//System.out.println(data.toString());
				
		try {
			for(int i=0;i<data.length();i++){
				
			JSONObject temp=data.getJSONObject(i);
				
			HTTPRequestTag requestm = new HTTPRequestTag(String.format("https://graph.facebook.com/%s", temp.getString("id")),HTTPMethod.GET); 
			requestm.pushAttributes("access_token", "CAACEdEose0cBACHU5KuH6TZCyHGnIofzY5BAH68EcF6OWhfzr0nq8toD1aZBujjdscLXnBXoWgZAYPZABIbcZBhDKRSUuhNbP65Lzu1NZAcmsia4hT82kEpMfvIPj9ZAqBfVOZCE3LVIGwPdXaXxldMo2iNCohZCLN1XOXLWQtanvJ1Rxl2IAjaPctKfEev5fC1HgEwZCwDQQoH96iEA0pfysNrMG3zxXZB6W4ZD");
			HTTPResponseTag responsem = con.getResult(requestm, "utf-8");
			
			JSONObject jom = new JSONObject(responsem.getResponse());
			
			//System.out.println(jom.getString("id"));
			//System.out.println(jom.getString("message"));

			
			//String msg=jom.getString("message");
			
			//System.out.println(msg);
			
			//msg=msg.substring(0,3);
			String[] ss=new String[22];
			ss[0]="基隆市";ss[1]="臺北市";ss[2]="新北市";ss[3]="桃園縣";ss[4]="新竹市";ss[5]="新竹縣";
			ss[6]="苗栗縣";ss[7]="臺中市";ss[8]="彰化縣";ss[9]="雲林縣";ss[10]="南投縣";ss[11]="嘉義市";
			ss[12]="嘉義縣";ss[13]="臺南市";ss[14]="高雄市";ss[15]="屏東縣";ss[16]="宜蘭縣";
			ss[17]="花蓮縣";ss[18]="臺東縣";ss[19]="澎湖縣";ss[20]="連江縣";ss[21]="金門縣";
			
			
			if(jom.isNull("message"))
			{}
			else{
				String msg=jom.getString("message");
				
				//System.out.println(msg);
				//msg=msg.substring(0,3);
				//System.out.println(msg);
				
				//System.out.println(jom.getString("id"));
				//System.out.println(jom.getString("message"));
				for(int j=0;j<22;j++)
				{
					if(msg.contains(ss[j])==false){					
					}
					else{
						System.out.println(ss[j]+"ss[j]");
						msg=ss[j];
						System.out.println(msg);
						
						
					}
				}
				
				
				
				//System.out.println(msg);
				
				//msg=msg.substring(0,3);
				//System.out.println(msg);
				//判斷有沒有"市"字
				
				
				HTTPRequestTag requestTF = new HTTPRequestTag("http://www.dgpa.gov.tw/",HTTPMethod.GET); 
				HTTPResponseTag responseTF = con.getResult(requestTF, "utf-8");
				JSONObject joTF = HTTP.toJSONObject(responseTF.getResponse());
				
				
			    
				String temps= responseTF.getResponse();
				//System.out.println(temps);
				temps = temps.split(String.format("size=2>%s", msg))[1];
				temps = temps.split("<FONT color=#000080 size=2>")[1];
				temps = temps.split("</FONT>")[0];
				
				System.out.println(temps);
				
				
				HTTPRequestTag requestp = new HTTPRequestTag(String.format("https://graph.facebook.com/%s/comments", jom.getString("id")),HTTPMethod.POST); 
				requestp.pushAttributes("access_token", "CAACEdEose0cBACHU5KuH6TZCyHGnIofzY5BAH68EcF6OWhfzr0nq8toD1aZBujjdscLXnBXoWgZAYPZABIbcZBhDKRSUuhNbP65Lzu1NZAcmsia4hT82kEpMfvIPj9ZAqBfVOZCE3LVIGwPdXaXxldMo2iNCohZCLN1XOXLWQtanvJ1Rxl2IAjaPctKfEev5fC1HgEwZCwDQQoH96iEA0pfysNrMG3zxXZB6W4ZD");
				requestp.pushAttributes("message",temps.toString());
				HTTPResponseTag responsep = con.getResult(requestp, "utf-8");
					
				System.out.println(responsep.getResponse());
				
				
				
			}
			//else
			//	System.out.println(jom.getString("message"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
