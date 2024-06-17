package org.study.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Greeter greeter = ctx.getBean(Greeter.class);
        System.out.println(greeter.greet());
        ctx.close();
    }
}
