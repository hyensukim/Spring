package org.study.spring.rest.exceptionhandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController extends ExceptionHandleController{

    @GetMapping("api-call/error")
    public void method1(){
        throw new RuntimeException("오류 발생 : method1");
    }
}
