package com.geekhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tyres {

    public String name;
    public Integer size;

    @Autowired
    public Tyres(@Value("Pirelli") String name, @Value("4") Integer size) {
        this.name = name;
        this.size = size;
    }
}
