package tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get01 {

    /*  Positive Scenario
	    When  I send a GET Request to
	          https://restful-booker.herokuapp.com/booking
	    And   I accept type "application/json"  ==> Means API is accepting data just in Json Format
	    And   statusCode should be 200
	    And   Content-Type should be "application/json; charset=utf-8" ==> Response body must be in Json format
        And   statusLine should be "HTTP/1.1 200 OK"
	*/

    @Test
    public void get01() {
        // 1) set url
        String url = "https://restful-booker.herokuapp.com/booking";

        // 2) set expData
        int expStatusCode = 200;
        String expContentType = "application/json; charset=utf-8";
        String expStatusLine = "HTTP/1.1 200 OK";

        // 3) set actData
        Response response = given().contentType(ContentType.JSON).when().get(url);

        // 4) Assert
        response.then().assertThat().
                statusCode(200).
                contentType("application/json; charset=utf-8").
                statusLine("HTTP/1.1 200 OK");


    }
}
