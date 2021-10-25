package com.pb.oliinykpomaza.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int UnknownNumber;
        UnknownNumber = (52);
        int count = 0;
        System.out.println("Угадайте число от 0 до 100");
        System.out.println("для выхода введите exit");
        while(true){
            System.out.print("Введите число:  ");
            String data = sc.next();
            if (data.equals("exit")){
                break;
            }
            int num = Integer.parseInt(data);
            count++;
            if (num != UnknownNumber){
                if (num < UnknownNumber){
                    System.out.println(num + " наше число больше");
                }
                else {
                    System.out.println(num + " наше число меньше");
                }
            }
            else {
                System.out.println("Вы победили!!!  " + num + ". число попыток - " + count);
                break;
            }

        }
        System.out.println("Игра окончена !");
    }
}