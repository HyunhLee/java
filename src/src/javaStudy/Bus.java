package javaStudy;

import com.eightcruz.javastudy.Car2;

public class Bus extends Car2 {
    public void ppangppang() {
        System.out.println("빵빵");
    }

    public void run() {
        super.run();
        System.out.println("Bus의 run메소드");
    }
}
