package com.pb.oliinykpomaza.hw7;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TeeShirt(Sizes.XS, "серый", 650),
                new TeeShirt(Sizes.L, "черный", 850),
                new Pants(Sizes.M, "синий", 900),
                new Pants(Sizes.XXS, "желтый", 705),
                new Skirt(Sizes.S, "фиолетовый", 500),
                new Skirt(Sizes.M, "красный", 400),

        };

        Atelier studio = new Atelier();
        studio.dressMale(clothes);
        System.out.println();
        studio.dressFemale(clothes);
    }
}