package com.articulus.demo.Service;

import com.articulus.demo.Document.Tables;
import com.articulus.demo.Foods.FoodManager;
import com.articulus.demo.Repository.TablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoodService implements IFoodService {

    @Autowired
    private TablesRepository table;

    @Override
    public String payment(ArrayList<String> foods) {

        FoodManager foodManager = new FoodManager();
        int total = 0;

        for (String food : foods) {
            total = foodManager.getPrice(food) + total;
        }
        return Integer.toString(total);
    }

    @Override
    public void saveFood(int tableID, String food) {
        Tables tableExample = table.findByTableID(tableID);
        ArrayList<String> foodList = tableExample.getFoods();
        foodList.add(food);
        tableExample.setFoods(foodList);
        table.save(tableExample);
    }

    @Override
    public ArrayList<String> getFoods(int tableID) {
        Tables tableExample = table.findByTableID(tableID);
        return tableExample.getFoods();
    }


}
