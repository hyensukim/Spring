package org.study.spring.rest.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class Spring5Controller {
    // Spring 5 이후 Exception handling 을 위한 ResponseStatusException 처리

    @GetMapping("api-call/five")
    public String five(){
        try{
            // 서비스 로직 ... 중 RuntimeException 발생 가정
            throw new RuntimeException("리소스 없음");
        }catch(RuntimeException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Not Found", ex);
        }
    }
}
