package org.study.spring.rest.exceptionhandling;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandleController {

    /**
     * ExceptionHandler 어노테이션이 존재하는 컨트롤러 내에서만 예외를 처리해줍니다.
     * @param e
     */
    @ExceptionHandler
    public void handleException(Exception e){
        System.out.println("예외 처리 완료 : " + e);
    }

    @GetMapping("api-call/error-handle")
    public void method2(){
        throw new RuntimeException("오류 발생 : method2");
    }
}
