package day11_SwitchStatement.homework;

public class Https {
    public static void main(String[] args) {
        /*
        5. HTTP is the protocol that governs communications between web-servers and web clients. Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status code:
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


         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

         */
        int statusCode = 404;
        String r = "";
        switch (statusCode){
            case 200:
                r = "OK";
                break;
            case 201:
                r = "Created";
                break;
            case 202:
                r = "Accepted";
                break;
            case 301:
                r = "Moved permanently";
                break;
            case 303:
                r = "See other";
                break;
            case 304:
                r = "Not modified";
                break;
            case 307:
                r = "Temporary Redirect";
            case 400:
                r = "Bad request";
                break;
            case 401:
                r = "Unauthorized";
                break;
            case 403:
                r = "Forbidden";
                break;
            case 404:
                r = "Not found";
                break;
            case 410:
                r = "Gone";
                break;
            case 500:
                r = "Internal Service Error";
                break;
            case 503:
                r = "Service Unavailable";
                break;
            default:
                r = "Invalid";
        }
        System.out.println(r);
    }
}
