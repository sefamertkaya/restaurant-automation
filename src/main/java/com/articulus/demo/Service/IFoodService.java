package com.articulus.demo.Service;

import java.util.ArrayList;

public interface IFoodService {

    public String payment(ArrayList<String> foods);

    public void saveFood(int tableID, String food);

    public ArrayList<String> getFoods(int tableID);

}
