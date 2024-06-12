package org.study.spring.rest.exceptionhandling;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

//@RestControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(value
//            = RuntimeException.class)
//    protected ResponseEntity<String> handleConflict(
//            RuntimeException ex, WebRequest request) {
//        String accept = request.getHeader(HttpHeaders.ACCEPT);
//        System.out.println(ex.getMessage());
//        if("application/json".equals(accept)) {
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("json 형태의 결과");
//        }else{
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("xml 형태의 결과");
//        }
//    }
//}
