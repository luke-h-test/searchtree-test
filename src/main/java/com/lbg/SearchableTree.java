package com.lbg;
import java.util.ArrayList;
public class SearchableTree
{
    private DataStore store;

    public SearchableTree(DataStore ds)
    {
        store = ds;
    }
    public void populateContainer()
    {
        store.generate();
    }

    public int find( String key )
    {
        return store.getIndexOf(key);
    }
    public boolean findIfLastItem( String key )
    {
        boolean result = false;
        int length = store.getSize();
        return length-1 == store.getIndexOf(key);
    }
    public boolean findIfFirstItem( String key )
    {
        boolean result = false;
        return 0 == store.getIndexOf(key);
    }
}