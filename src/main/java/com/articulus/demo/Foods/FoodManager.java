package com.articulus.demo.Foods;

public class FoodManager {

    private IFood Kofte, Kebap, Lahmacun, Doner, Hamburger;

    public FoodManager() {

        Kofte = new Kofte();
        Kebap = new Kebap();
        Lahmacun = new Lahmacun();
        Doner = new Doner();
        Hamburger = new Hamburger();

    }

    public int getPrice(String foodName) {

        int price = 0;

        switch (foodName) {
            case "Kofte":
                price = Kofte.getFoodPrice();
                break;
            case "Lahmacun":
                price = Kebap.getFoodPrice();
                break;
            case "Doner":
                price = Lahmacun.getFoodPrice();
                break;
            case "Hamburger":
                price = Doner.getFoodPrice();
                break;
            case "Kebap":
                price = Hamburger.getFoodPrice();
                break;
        }

        return price;
    }


}
