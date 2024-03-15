import java.io.*;

class Fibonacci {
    static long run(long num) {
        if (num == 0) { return 0; }
        if (num == 1) { return 1; }
        return run(num-1) + run(num-2);
    }

    public void calculate(short num) {
        long value =  run((long) num);
        System.out.println(value);
    }
}


class PrimeThread extends Thread {
    long minPrime;
    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        Fibonacci f = new Fibonacci();
        f.calculate((short) this.minPrime);
    }
}

public class TMain {
    public static void main(String [] args) {
        f1((short) 45);
        f1((short) 45);
        f1((short) 45);
    }

    static void f1(short num) {
        PrimeThread p = new PrimeThread(num);
        p.start();
    }
    static void f2(short num) {
        PrimeThread p = new PrimeThread(num);
        p.start();
    }

    static void f3(short num) {
        PrimeThread p = new PrimeThread(num);
        p.start();
    }
}
