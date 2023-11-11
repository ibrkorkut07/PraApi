package tests;

public class Get03 {

    /*
        When I send a GET Request to
             https://restful-booker.herokuapp.com/booking/5
		Then HTTP statusCode should be 200
		And  Content-Type should be in "application/json" format
		And  Response body should be as follows
		     {
                "firstname": "Jim",
                "lastname": "Brown",
                "totalprice": 415,
                "depositpaid": false,
                "bookingdates": {
                                "checkin": "2018-03-24",
                                "checkout": "2018-05-18"
                                },
                "additionalneeds": "Breakfast"
            }
	*/
}
