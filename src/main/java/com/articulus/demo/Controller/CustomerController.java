package com.articulus.demo.Controller;

import com.articulus.demo.Document.Tables;
import com.articulus.demo.Service.IFoodService;
import com.articulus.demo.Service.IServeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CustomerController {

    @Autowired
    private IServeService serveService;

    @Autowired
    private IFoodService foodService;

    @PostMapping(value = "/open-serve")
    public void openServe(@RequestBody Tables table) {
        serveService.openServe(table.getTableID(), table.getTableType());
    }

    @GetMapping(value = "/get-all-serve")
    public ArrayList<Tables> getAllServe() {
        return serveService.getAllServe();
    }

    @PostMapping(value = "/payment")
    public String payment(@RequestBody ArrayList<String> foods) {
        return foodService.payment(foods);
    }

    @PostMapping(value = "/save-food/{tableID}/{food}")
    public void saveFood(@PathVariable("tableID") int tableID, @PathVariable("food") String food) {
        foodService.saveFood(tableID, food);
    }

    @GetMapping(value = "/get-foods/{tableID}")
    public ArrayList<String> getFoods(@PathVariable("tableID") int tableID) {
        return foodService.getFoods(tableID);
    }


}
