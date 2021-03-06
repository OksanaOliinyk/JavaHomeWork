package com.pb.oliinykpomaza.hw7;

class Pants extends Clothes implements ManClothes, WomenClothes{
    public Pants(Sizes size, String color) {
        super(size, color);
    }

    public Pants(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " ,грн" +
                ", цвет = " + getColor() +
                "}";
    }
}