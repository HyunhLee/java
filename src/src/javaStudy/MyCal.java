package javaStudy;

import com.eightcruz.javastudy.Calculator;

public class MyCal implements Calculator {
    public int plus(int i, int j) {
        return i + j;
    }
    public int multiple(int i, int j) {
        return i * j;
    }
}
