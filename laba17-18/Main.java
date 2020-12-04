package laba17-18;

import java.util.Scanner;

public class Main17_18 {
    public static void main(String[] args) {
        System.out.println("Введите число: " +'\n' +
                "1 - Kelp" + '\n' +
                "2 - Near" + '\n' +
                "3 - Fear");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        switch (in){
            case(1):
                Kelp first = new Kelp();
                System.out.println("abcdefghijklmnopqrstuv18340");
                first.check();
                break;
            case(2):
                Near second = new Near();
                System.out.println("aE:dC:cA:56:76:54");
                second.check_2();
                break;
            case(3):
                Fear Third = new Fear();
                System.out.println("По условию: " + "59.02 USD 48.38 RUR 75 CHF 92.08 USD 13 UDD 0.002 USD");
                Third.check_3();
        }
    }
