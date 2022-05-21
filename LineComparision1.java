package com.bridgelab;

public class LineComparision1 {
    void method1() {
        int x1 = 1, y1 = 1, x2 = 4, y2 = 4;
        double lengthOfFirstPoints;
        lengthOfFirstPoints = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("length of line==> " + lengthOfFirstPoints);
    }

    public static void main(String[] args) {
        LineComparision1 obj1 = new LineComparision1();
        obj1.method1();
    }
}
