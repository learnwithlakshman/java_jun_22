package com.careerit.ipl.stats.service.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IplStatErrorResponse {

    private String message;
    private HttpStatus httpStatus;
    private List<String> errors;
    private LocalDateTime time;

}
