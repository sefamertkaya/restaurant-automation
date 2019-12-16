package com.articulus.demo.Document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Getter
@Setter
public class Tables {

    @Id
    private Integer tableID;
    private String tableType;
    private ArrayList<String> foods = new ArrayList<String>();

    public Tables(int tableID, String tableType) {
        this.tableID = tableID;
        this.tableType = tableType;
    }

}
