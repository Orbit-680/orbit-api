
package com.csc680.orbit.exceptions;

public class BadRequestException extends RuntimeException {

    private static final long serialVersionUID = 4663374093452578391L;

    public BadRequestException() {
        super();
    }

    public BadRequestException(String s) {
        super(s);
    }

}