package com.pb.oliinykpomaza.hw2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Введите число от 0 до 100");
        x = scan.nextInt();
            if (x <= 14) {
                System.out.print("от 0 до 14");
            } else if (x >= 15 && x <= 35) {
                System.out.print("от 15 до 35");
            } else if (x >= 36 && x <= 50) {
                System.out.print("от 36 до 50");
            } else if (x >= 51 && x <= 100) {
                System.out.print("от 51 до 100");
            } else {
            System.out.print("Неверно");
        }
        }
        }






