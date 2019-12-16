package com.articulus.demo.Service;

import com.articulus.demo.Document.Tables;

import java.util.ArrayList;

public interface IServeService {

    public void openServe(int tableID, String tableType);

    public void closeServe(int tableID);

    public ArrayList<Tables> getAllServe();

}
