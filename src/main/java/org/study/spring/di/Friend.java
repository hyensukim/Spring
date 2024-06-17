package org.study.spring.di;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Friend {
    private String name;

    public Friend(String name){
        this.name = name;
    }
}
