package com.educandoweb.course.core.usecase.exceptions;

import com.educandoweb.course.dataprovider.exceptions.DatabaseException;
import com.educandoweb.course.dataprovider.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException notFoundException,
                                                          HttpServletRequest request){
        String error = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError standardError = new StandardError(Instant.now().truncatedTo(ChronoUnit.HOURS),
                status.value(), error,notFoundException.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(standardError);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> database(DatabaseException databaseException,
                                                          HttpServletRequest request){
        String error = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError standardError = new StandardError(Instant.now().truncatedTo(ChronoUnit.HOURS),
                status.value(), error,databaseException.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(standardError);
    }
}
