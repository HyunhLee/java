package javaStudy;

import com.eightcruz.javastudy.TV;

public class LedTV implements TV {
    public void turnOn() {
        System.out.println("켜다.");
    }
    public void turnOff() {
        System.out.println("끄다.");
    }
    public void changeVolume(int volume) {
        System.out.println("볼륨을 " + volume + "로 조정하다.");
    }
    public void changeChannel(int channel) {
        System.out.println("채널을 " + channel + "로 조정하다.");
    }
}
