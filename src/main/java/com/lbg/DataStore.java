package com.lbg;

import java.util.ArrayList;

public class DataStore
{
    private ArrayList<String> items = new ArrayList<>();

    public int getSize()
    {
        return items.size();
    }
    public int getIndexOf(String key)
    {
        return items.indexOf(key);
    }

    public void generate()
    {
        String str= new String("selvyn");
        items.add(str);
        items.add("trains");
        items.add("lecture");
        items.add("graduate");
        items.add("company");
        items.add("taxes");
    }
}
