
import java.io.*;
import java.util.Scanner;

 class A {
     int a=20;

     void add() {
         short a = 10;
         short b = 50;
         short c;

         System.out.println(a + b);
         c = (short) (a + b);
         System.out.println(c);
     }
}

public class Main {
    public static void main(String[] args) {
        // taking_user_input();
        // factorial();
        // swap_values();
//        Main.swap_values();

        A a = new A();
        a.add();

    }

    static void swap_values() {
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        System.out.println("Swaping Values");
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println(a + " " + b);
    }

    static int calculateFactorial(int num) {
        if (num == 1) { return  1; }
        return num * calculateFactorial(num - 1);
    }
    static void factorial() {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println(num);
    }

    static void takingUserInput() {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        System.out.println(num);
    }
}