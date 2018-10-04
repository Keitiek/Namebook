package com.example.opilane.namebook;

import android.content.Context;

import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class People implements Serializable {
    private static final String filename = "papersons";
    private List<Person> personList = new ArrayList<>();
    private transient Context context;

    public People(Context context)throws Exception{
        this.context = context;
        FileInputStream stream = null;
        try{
            stream = context.openFileInput(filename);
        }
        catch (Exception ex){return; }
    }
}

