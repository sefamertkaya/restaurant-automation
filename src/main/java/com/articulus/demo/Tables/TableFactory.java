package com.articulus.demo.Tables;

import com.articulus.demo.Document.Tables;

public abstract class TableFactory {

    public abstract Tables createTable(int tableID, String tableType);

}
