package API_Maven_Project.API_Maven_Project;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class restApiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Response res = given().contentType(ContentType.JSON).when().get("");
		Response res = given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users?page=2");
		System.out.println("statuscode  "+res.getStatusCode());
		System.out.println("Responsecode "+res.asString());
	}



}
