package com.pb.oliinykpomaza.hw10;



public class NumBox <T extends Number>{
    private T[] number;
    public NumBox(int size) {
        this.number = (T[]) new Number[size];
    }
    public int lenght(){
        int i = 0
                for (T n: number) {
                    if (n == null) {
                        break;
                    }
                    i++;
                    if (i== number.length) {
                        System.out.println("Массив заполнен");
                        break;
                    }
                }
                return i;
    }

    public double average() {
        double average;
        double sum = 0;
        int i = 0;
        for (T n: number) {
            if (n != null) {
                Double nNew = (Double) n;
                double nNum = nNew.doubleValue();
                sum += nNum;
                i++;
            }
            else break;
        }
        average = sum / i;
        return average; // подсчет среднего арифметического массива
    }

}
