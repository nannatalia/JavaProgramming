package homework3;

public class HttpsProtocol {
    public static void main(String[] args) {
        /*
        7.  HTTP is the protocol that governs communications between web-servers and web clients.
        Part of the protocol includes a status code returned by the server to tell the browser
        the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

         */
        int n =4232;
       String r =  (n==200)? "OK" :(n==201)? "Created" :(n==202)? "Accepted" :(n==301)? "Moved Permanently" :(n==303)? "See other" :(n==304)? "Not modified" :(n==307)? "Temporary Redirect" :(n==400)? "Bad Request" :(n==401)? "Unauthorized" :(n==403)? "Forbidden" :(n==404)? "Error" :(n==410)? "Gone" :(n==500)? "Internal Server Error" :(n==503)? "Service Unavailable" : "Invalid number";
        System.out.println(r);
    }
}
