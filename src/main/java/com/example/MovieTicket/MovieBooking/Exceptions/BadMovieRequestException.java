package com.example.MovieTicket.MovieBooking.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadMovieRequestException extends RuntimeException{
    public BadMovieRequestException(String message) {
        super(message);
    }

    /*When we annotate a custom exception class with @ResponseStatus, Spring automatically applies the specified HTTP status
    code whenever that exception is thrown anywhere in your application. In this case, our BadMovieRequestException
    is extending RuntimeException (making it a kind of unchecked exception). The reason we aren't making it checked
    (extending Exception) because we don't want our backend/service to do anything about it/recover from it as its
    an issue on the client side. Hence, we don't want our compiler to enforce us to handle it using try/catch or throws.*/
}
