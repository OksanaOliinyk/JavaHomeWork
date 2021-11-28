package com.pb.oliinykpomaza.hw10;

public class AverageDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Average<Integer> iob = new Average<>(intArray);
        System.out.println("Среднее значения для Integer " + iob.average());

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Average<Double> dob = new Average<>(doubleArray);
        System.out.println("Среднее значения для Double " + dob.average());

        Float[] floatArray = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Average<Float> fob = new Average<>(floatArray);
        System.out.println("Среднее значения для Float " + fob.average());

        System.out.print("Средние значения для iob и dob ");
        if (iob.sameAvg(dob)) {
            System.out.println("одинаковые.");
        } else {
            System.out.println("разные.");
        }

        System.out.print("Средние значения для iob и fob ");
        if (iob.sameAvg(fob)) {
            System.out.println("одинаковые.");
        } else {
            System.out.println("разные.");
        }
    }