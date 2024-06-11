package org.study.spring.rest.exceptionhandling;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// note : @ExceptionHandler 단독 사용
//@RestController
public class ExceptionHandleController {

    @ExceptionHandler
    public void handleException(Exception e){
        System.out.println("예외 처리 완료 : " + e);
    }

    @GetMapping("api-call/error-handle")
    public void method2(){
        throw new RuntimeException("오류 발생 : method2");
    }
}
