package com.articulus.demo.Foods;


public class Hamburger implements IFood {

    int price = 40;


    @Override
    public int getFoodPrice() {
        return price;
    }
}
