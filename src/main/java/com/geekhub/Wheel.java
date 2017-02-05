package com.geekhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wheel {

    public Tyres tyres;

    @Autowired
    public Wheel(Tyres tyres) {
        this.tyres = tyres;
    }

    public void roll() {
        System.out.println("Start roll " + tyres.size + " wheels named " + tyres.name + ".");
    }
}
