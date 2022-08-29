package com.careerit.ipl.stats.service.exception;

import com.careerit.ipl.stats.service.exception.IplStatErrorResponse;
import com.careerit.ipl.stats.service.exception.TeamNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.List;

@ControllerAdvice
public class IplStatExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({TeamNotFoundException.class})
    public ResponseEntity<IplStatErrorResponse> handleCustomException(
            RuntimeException ex, WebRequest request) {
            IplStatErrorResponse obj = IplStatErrorResponse.builder()
                    .message(ex.getMessage())
                    .httpStatus(HttpStatus.NOT_FOUND)
                    .time(LocalDateTime.now())
                    .errors(List.of(ex.getClass().getSimpleName()))
                    .build();
            return ResponseEntity.ok(obj);
    }

}
