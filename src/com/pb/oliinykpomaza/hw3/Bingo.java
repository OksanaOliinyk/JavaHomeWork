package com.pb.oliinykpomaza.hw3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int UnknownNumber;
        int UserNumber;
        int TrysCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадать целое число (от 0 до 100).");
        System.out.println("для выхода введите exit");
        UnknownNumber = (52);
        do {
            TrysCount++;
            System.out.print("Введите ваше число: ");
            UserNumber = input.nextInt();
            if (UserNumber > UnknownNumber)
                System.out.println("Моё число меньше.");
            else if (UserNumber < UnknownNumber)
                System.out.println("Моё число больше.");
            else System.out.println("Вы угадали!");
            if (input.equals("exit")) {
                break;
            }
        } while (UserNumber != UnknownNumber);
        System.out.println("Количество попыток: " + TrysCount);
    }
}

