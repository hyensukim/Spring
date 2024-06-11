package org.study.spring.rest.exceptionhandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// note : @ExceptionHandler 관련 클래스 상속하여 예외 처리
@RestController
public class AnotherController extends ExceptionHandleController{

    @GetMapping("api-call/error")
    public void method1(){
        throw new RuntimeException("오류 발생 : method1");
    }

}
