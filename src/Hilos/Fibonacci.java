package Hilos;

import java.util.*;

public class Fibonacci extends Thread {

    public static long fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Fibonacci fi = new Fibonacci();
        fi.start();
        }
    @Override
    public void run(){
        int N;
        System.out.println("Introduce la cantidad de numeros que quieres ver:");
        Scanner console = new Scanner(System.in);
        N = console.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i + "\t|\t" + fib(i - 1));
        }
    }
}
