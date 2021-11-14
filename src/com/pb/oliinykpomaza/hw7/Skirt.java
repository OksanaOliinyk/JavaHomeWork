package com.pb.oliinykpomaza.hw7;

public class Skirt extends Clothes implements WomenClothes {
    public Skirt(Sizes size, String color) {
        super(size, color);
    }

    public Skirt(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Юбка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}