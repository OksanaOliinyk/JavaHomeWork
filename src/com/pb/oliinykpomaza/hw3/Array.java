package com.pb.oliinykpomaza.hw3;

    import java.util.Scanner;

    public class Array {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Заполните массив");
            int mas[] = new int[10];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = input.nextInt();
            }


            System.out.println("Заполненый массив");
            for (int i=0;i < mas.length;i++){
                System.out.print(mas[i]+ " ");
            }
            System.out.println();



            int num = 0;
            for (int i=0 ; i< mas.length; i++){
                if (mas[i]>0 ){
                    num++;
                }


            }
            System.out.println("Количество элементов больше нуля  =  "+ num);

            int sum = 0;
            for (int i= 0; i < mas.length; i++) {
                sum = sum + mas[i];
            }
            System.out.println("сумма всех элементов =  " + sum);

        }
    }
