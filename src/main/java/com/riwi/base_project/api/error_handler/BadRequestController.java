package com.riwi.base_project.api.error_handler;

import com.riwi.base_project.api.dto.errors.ErrorsResponse;
import com.riwi.base_project.api.dto.errors.ListResponseErrors;
import com.riwi.base_project.util.exceptions.BadIdException;
import com.riwi.base_project.util.exceptions.BadRequestException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ListResponseErrors handlerBadRequest(MethodArgumentNotValidException exception){

        List<Map<String, String>> errors = new ArrayList<>();

        exception.getBindingResult().getAllErrors().forEach((e) -> {
            Map<String, String> errorResponse = new HashMap<>();

            errorResponse.put("error", e.getDefaultMessage());
            errorResponse.put("field", e.getField());

            errors.add(errorResponse);
        });

        return ListResponseErrors.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.name())
                .errors(errors)
                .build();

    }

    @ExceptionHandler(BadIdException.class)
    public ErrorsResponse handlerIdError(BadIdException exception){
        Map<String, String> errorResponse = new HashMap<>();

        errorResponse.put("error", "Id not found");
        errorResponse.put("entity", exception.getMessage());

        return ErrorsResponse.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .status(HttpStatus.NOT_FOUND.name())
                .error(errorResponse)
                .build();
    }

    @ExceptionHandler(BadRequestException.class)
    public ErrorsResponse handlerBadRequest(BadRequestException exception){
        Map<String, String> errorResponse = new HashMap<>();

        errorResponse.put("error", exception.getMessage());

        return ErrorsResponse.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .status(HttpStatus.BAD_REQUEST.name())
                .error(errorResponse)
                .build();
    }

}
