package javaStudy;

public class ConstantExam {
    public static void main(String[] args) {
        int i;
        i = 10;
        i = 5;
        System.out.println(i);

        final int J;
        J = 10;
        System.out.println(J);

        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;
        System.out.println(circleArea);

        final int OIL_PRICE = 1390;
        int totalPrice = 50 * OIL_PRICE;
        System.out.println(totalPrice);
    }
}
