package com.articulus.demo.Foods;


public class Kebap implements IFood {

    int price = 20;

    @Override
    public int getFoodPrice() {
        return price;
    }
}
