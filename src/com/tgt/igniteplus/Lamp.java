package com.tgt.igniteplus;
import java.util.Scanner;

class Lamp {
    boolean state;
    void on(){
        state = true;
        System.out.print(state);
    }
    void off(){
        state = false;
        System.out.print(state);
    }
}

class TestLamp{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to switch on and 0 to switch off");
        int s = sc.nextInt();
        Lamp l1 = new Lamp();
        if(s == 0)
        {
            l1.off();
        }
        if(s == 1)
        {
            l1.on();
        }
        else
            System.out.println("Entered data is wrong");
    }
}