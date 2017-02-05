package com.geekhub;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    Double engineCapacity;

    @Autowired
    public Engine(@Value("1.5") Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void start() {
        System.out.println("Start engine with capacity: " + engineCapacity.toString() + " litre.");
    }
}
