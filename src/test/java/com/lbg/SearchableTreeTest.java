package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchableTreeTest {

    @Test
    void check_populate_container_returns_Selvyn() {
        //arrange
        SearchableTree cut = new SearchableTree();
        String expectedResult = "selvyn";

        String actualResult = cut.populateContainer();

        assertEquals(expectedResult, actualResult);

    }

    @Test
    void check_find_returns_1_for_train()
    {
        SearchableTree cut = new SearchableTree();
        String populate = cut.populateContainer();
        String val1 = "trains";
        int expectedResult = 1;

        int actualResult = cut.find(val1);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void check_find_returns_0_for_selvyn()
    {
        SearchableTree cut = new SearchableTree();
        String populate = cut.populateContainer();
        String val1 = "selvyn";
        int expectedResult = 0;

        int actualResult = cut.find(val1);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void check_findIfLastItem_is_taxes()
    {
        SearchableTree cut = new SearchableTree();
        String populate = cut.populateContainer();
        String val1 = "taxes";

        boolean actualResult = cut.findIfLastItem(val1);

        assertEquals(true, actualResult);

    }

    @Test
    void check_findIfLastItem_is_not_graduate()
    {
        SearchableTree cut = new SearchableTree();
        String populate = cut.populateContainer();
        String val1 = "graduate";

        boolean actualResult = cut.findIfLastItem(val1);

        assertEquals(false, actualResult);
    }

    @Test
    void check_findIfFirstItem_is_selvyn()
    {
        SearchableTree cut = new SearchableTree();
        String populate = cut.populateContainer();
        String val1 = "selvyn";

        boolean actualResult = cut.findIfFirstItem(val1);

        assertEquals(true, actualResult);

    }

    @Test
    void check_findIfFirstItem_is_not_company()
    {
        SearchableTree cut = new SearchableTree();
        String populate = cut.populateContainer();
        String val1 = "company";

        boolean actualResult = cut.findIfFirstItem(val1);

        assertEquals(false, actualResult);

    }

    @Test
    void check_find_returns_minus1_if_list_not_populated()
    {
        SearchableTree cut = new SearchableTree();
        String val1 = "";
        int expectedResult = -1;

        int actualResult = cut.find(val1);

        assertEquals(expectedResult, actualResult);
    }

}