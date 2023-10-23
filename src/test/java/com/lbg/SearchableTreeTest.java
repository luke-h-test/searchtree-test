package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchableTreeTest {

    @Test
    void check_find_returns_1_for_train()
    {
        DataStore ds = new DataStore();
        SearchableTree cut = new SearchableTree(ds);
        cut.populateContainer();
        String val1 = "trains";
        int expectedResult = 1;

        int actualResult = cut.find(val1);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void check_find_returns_0_for_selvyn()
    {
        DataStore ds = new DataStore();
        SearchableTree cut = new SearchableTree(ds);
        cut.populateContainer();
        String val1 = "selvyn";
        int expectedResult = 0;

        int actualResult = cut.find(val1);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void check_findIfLastItem_is_taxes()
    {
        DataStore ds = new DataStore();
        SearchableTree cut = new SearchableTree(ds);
        cut.populateContainer();
        String val1 = "taxes";

        boolean actualResult = cut.findIfLastItem(val1);

        assertEquals(true, actualResult);

    }

    @Test
    void check_findIfLastItem_is_not_graduate()
    {
        DataStore ds = new DataStore();
        SearchableTree cut = new SearchableTree(ds);
        cut.populateContainer();
        String val1 = "graduate";

        boolean actualResult = cut.findIfLastItem(val1);

        assertEquals(false, actualResult);
    }

    @Test
    void check_findIfFirstItem_is_selvyn()
    {
        DataStore ds = new DataStore();
        SearchableTree cut = new SearchableTree(ds);
        cut.populateContainer();
        String val1 = "selvyn";

        boolean actualResult = cut.findIfFirstItem(val1);

        assertEquals(true, actualResult);

    }

    @Test
    void check_findIfFirstItem_is_not_company()
    {
        DataStore ds = new DataStore();
        SearchableTree cut = new SearchableTree(ds);
        cut.populateContainer();
        String val1 = "company";

        boolean actualResult = cut.findIfFirstItem(val1);

        assertEquals(false, actualResult);

    }

    @Test
    void check_find_returns_minus1_if_list_not_populated()
    {
        DataStore ds = new DataStore();
        SearchableTree cut = new SearchableTree(ds);
        cut.populateContainer();
        String val1 = "";
        int expectedResult = -1;

        int actualResult = cut.find(val1);

        assertEquals(expectedResult, actualResult);
    }

}