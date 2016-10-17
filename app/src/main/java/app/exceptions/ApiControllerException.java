package app.exceptions;

/**
 * Created by 23878410v on 17/10/16.
 */

public class ApiControllerException extends Exception {
    public ApiControllerException(String code, String msg) {
        super("HTTP Response: " + code + " " + msg);
    }
}