package files;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	public JsonPath rawtojson(Response r) {
		
		String respon=r.asString();
				JsonPath js=new JsonPath(respon);
		return js;
		
	}

}
