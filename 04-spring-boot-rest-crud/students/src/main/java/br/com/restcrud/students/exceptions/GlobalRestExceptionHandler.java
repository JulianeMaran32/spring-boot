package br.com.restcrud.students.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalRestExceptionHandler {

    /**
     * 404 - Not Found
     */
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(StudentNotFoundException exception) {

        var error = new ErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exception.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    /**
     * 400 - Bad Request
     */
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception exception) {

        var error = new ErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exception.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }


}
