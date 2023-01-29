package Shaft1.Shaft1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;

import io.restassured.http.ContentType;

public class APIS {

	public APIS() {
		// TODO Auto-generated constructor stub
	}
	

	@ Test 
	public void testWaits()
	{
		
         SHAFT.API api = new SHAFT.API("https://todo.qacart.com");
         HashMap<String, String>loginbody = new HashMap<String, String>();
         loginbody.put("email", "hatem@example.com");
         loginbody.put("password", "123456");

         api.post("/api/v1/users/login")
         .setRequestBody(loginbody)
         .setContentType(ContentType.JSON).perform();

        String firstName = api.getResponseJSONValue("firstName");
        System.out.println(firstName);
        
        
        api.assertThatResponse().body().isNotNull();
	}

}
