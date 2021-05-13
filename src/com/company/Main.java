package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во случайных чисел");
        int n = scan.nextInt();
        System.out.println("Генератор из " + n + " чисел");
        Random num = new Random();
        System.out.println("Случайные числа без диапазона");
        for (int i = 0; i <=n-1; i++) {
            int number = num.nextInt();
            System.out.print(number+" ");
        }
        System.out.println();
        System.out.println("Случайные числа от 1-100 с переходом");
        for (int i = 0; i <=n-1; i++) {
            int number = num.nextInt(100-1);
            System.out.println(number);
        }
        System.out.println("Случайные числа от 1-100 без перехода");
        for (int i = 0; i <=n-1; i++) {
            int number = num.nextInt(100-1);
            System.out.print(number+" ");
        }
    }
}
