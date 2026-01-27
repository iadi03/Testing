package API_Testing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given; 

public class api_git1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://api.github.com/";
		
		String token = "";
		
//		**create new repo
		
//		String body = "{\"name\": \"RestAssured_demo\",\"description\": \"Created using GitHub REST API\", \"private\": false\"}";		
//		Response response = (Response) given().relaxedHTTPSValidation().header("Authorization", "Bearer " + token)
//		.when()
//		.header("Accept", "application/vnd.gitHub+json")
//		.body(body)
//		.post("/user/repos");
		
        
//      **delete the created repo 
		
		String owner = "iadi03";
        String repo  = "RestAssured_demo";
        Response response = given()
                .relaxedHTTPSValidation()
                .header("Authorization", "Bearer " + token)
                .header("Accept", "application/vnd.github+json")
            .when()

            .delete("/repos/{owner}/{repo}", owner, repo);;
		
		int statusCode = response.statusCode();
		
		System.out.println(statusCode);


	}

}
