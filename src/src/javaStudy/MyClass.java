package javaStudy;

public class MyClass {
//    public 리턴타입 메소드명 (매개변수 등) { 구현 }
    // 입력x, 리턴x
    public void method1() {
        System.out.println("m1이 실행됨..");
    }
    // 정수 입력, 리턴x
    public void method2(int x) {
        System.out.println(x + "를 이용한 m2 실행");
    }
    // 입력x, 정수 리턴
    public int method3() {
        System.out.println("m3 실행");
        return 10;
    }
    // 정수 2개 입력, 리턴x
    public void method4(int x, int y) {
        System.out.println(x + "와" + y + "를 이용한 m4 실행");
    }
    // 정수 입력, 정수 출력
    public int method5(int y) {
        System.out.println(y + "를 이용한 m5 실행");
        return y * 2;
    }
}
