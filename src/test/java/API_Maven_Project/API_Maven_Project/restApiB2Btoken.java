package API_Maven_Project.API_Maven_Project;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class restApiB2Btoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b2bBodyData b2b = new b2bBodyData();
		b2b.setClient_id("1dc08577-54ba-4b48-9e86-ee6ccf17d413");
		b2b.setClient_secret("a3e2fc6480e6");
		b2b.setUsername("t51_sc_enabled");
		b2b.setPassword("sonova2014");
		b2b.setGrant_type("password");
		

		Response res = given().header("Content-Type","application/x-www-form-urlencoded").and().body(b2b).when().post("https://q-signon.phonakpro.com/as/token.oauth2");
		System.out.println("statuscode  "+res.getStatusCode());
		System.out.println("Responsecode "+res.asString());
	}

}
