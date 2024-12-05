package javaStudy;

import com.eightcruz.javastudy.Car2;

public class BusExam {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        bus.ppangppang();

        Car2 car2 = new Car2();
        car2.run();
//        car2.ppangppang();

        Car2 c2 = new Bus();
        c2.run();
        // c2.ppangppang();

        Bus bus2 = (Bus)c2;
        bus2.run();
        bus2.ppangppang();
    }
}
