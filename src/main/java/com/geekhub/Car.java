package com.geekhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    Wheel wheels;
    Engine engine;

    @Autowired
    public Car(Wheel wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Start car ...");
        engine.start();
        wheels.roll();
    }
}
