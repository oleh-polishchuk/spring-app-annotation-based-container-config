package com.geekhub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});

        Car car = (Car) context.getBean("car");
        car.startCar();
    }
}
