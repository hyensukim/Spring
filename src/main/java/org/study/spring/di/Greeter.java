package org.study.spring.di;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class Greeter {
    @Setter
    private String format;
//    @Autowired // 빈으로 등록된 Friend 객체 주입
    private Friend friend;

//    public Greeter(Friend friend){
//        this.friend = friend;
//    }

    public String greet(){
        return String.format(format, friend.getName());
    }

    public String greet(String guest){
        return String.format(format, guest);
    }

    @Autowired
    public void setFriend(Friend friend){
        this.friend = friend;
    }
}
