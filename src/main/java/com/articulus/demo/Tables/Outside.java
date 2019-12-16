package com.articulus.demo.Tables;

import com.articulus.demo.Document.Tables;

public class Outside extends TableFactory {

    @Override
    public Tables createTable(int tableID, String tableType) {
        return new Tables(tableID, tableType);
    }
}
