package tests;

public class Delete01 {
    /*
        When I send DELETE Request to http://dummy.restapiexample.com/api/v1/delete/719
		Then
		     Status code should be 200
		     The value of "status" key in response body should be "success"
		     The value of "message" key in response body should be "Successfully! Record has been deleted"

             For DELETE Request we need just Endpoint like GET Request, we do not need Request Body
		     Note 1: Use hard assertion
		     Note 2: After given() please use contentType(ContentType.JSON)
	*/
}
