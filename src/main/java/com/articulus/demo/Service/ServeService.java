package com.articulus.demo.Service;

import com.articulus.demo.Document.Tables;
import com.articulus.demo.Repository.TablesRepository;
import com.articulus.demo.Tables.Inside;
import com.articulus.demo.Tables.Outside;
import com.articulus.demo.Tables.TableFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServeService implements IServeService {

    @Autowired
    private TablesRepository table;

    @Override
    public void openServe(int tableID, String tableType) {
        TableFactory tableFactory;
        switch (tableType) {
            case "outside":
                tableFactory = new Outside();
                table.save(tableFactory.createTable(tableID, tableType));
                break;
            case "inside":
                tableFactory = new Inside();
                table.save(tableFactory.createTable(tableID, tableType));
                break;
            default:
                break;
        }
    }

    @Override
    public ArrayList<Tables> getAllServe() {
        return table.findAll();
    }


    @Override
    public void closeServe(int tableID) {


    }


}
