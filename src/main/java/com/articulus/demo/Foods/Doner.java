package com.articulus.demo.Foods;


public class Doner implements IFood {

    int price = 20;


    @Override
    public int getFoodPrice() {
        return price;
    }
}
