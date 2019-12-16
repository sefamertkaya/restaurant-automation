package com.articulus.demo.Foods;


public class Lahmacun implements IFood {

    int price = 30;

    @Override
    public int getFoodPrice() {
        return price;
    }
}
