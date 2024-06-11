package org.study.spring.rest.exceptionhandling;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {
    @GetMapping("api-call/global")
    public ResponseEntity<String> method(){
        throw new RuntimeException("Global 예외 처리");
    }
}
