package com.tgt.igniteplus;
import java.util.Scanner;
class AreaRectangle {
    int l;
    int b;

    void getval(int len, int bth) {
        l = len;
        b = bth;
    }

    void displayval() {
        System.out.println(l * b);
    }
}
class Test{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and width of the rectangle");
        int len = sc.nextInt();
        int bth = sc.nextInt();
        AreaRectangle r1 = new AreaRectangle();
        r1.getval(len,bth);
        r1.displayval();
    }
}