package API_Testing;


import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
 
public class api_t1 {
	public static void main(String args[]) throws InterruptedException {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://api.github.com/";
		
 
		
		String token = "";
		String apiKey = "";	
		
		
		String response = RestAssured
					.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + token)
					.get(apiKey).statusLine();
		System.out.println(response);
		
		int response1 = RestAssured		
					.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + token)
					.get(apiKey).statusCode();
		System.out.println(response1);			
					
//					.auth().oauth2(apiKey)
//					.when()
//					.get(token)
//					.then()
//					.extract()
//					.response();
//		int Scode = response.statusCode();
//		System.out.println("The status code is: " + Scode );
//		String statusLine = response.statusLine();
//		int statusCode1 = response.getStatusCode();
//		String statusLine1 = response.getStatusLine();
//		
//		String bodyData = response.getBody().asPrettyString();
//		System.out.println(bodyData);
		
		
		String StatusBody1 = RestAssured
		.given().relaxedHTTPSValidation().header("Authorization", "Bearer " + token)
		.get(apiKey).getBody().asPrettyString();
		
		System.out.println(StatusBody1);
	}
}