package javaStudy;

public class AccessObj {
    // 아무나 접근 가능
    public int p = 3;
    // 자신 + 자신과 같은 패키지 + 상속받은 경우 접근 가능
    protected  int p2 = 4;
    // 자신 + 자신과 같은 패키지 접근 가능
    int k = 2;
    // 자신만 접근 가능
    private int i = 1;
}
