package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

class CollectionTestSuite {

    @Test
    public void testOddNumberExterminatorEmptyList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> myList = new ArrayList<>();
        Boolean result = exterminator.exterminate(myList).size() == 0;
        Assertions.assertTrue(result);
    }

    @Test
    public void testOddNumberExterminatorNormalList() {
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        ArrayList<Integer> newLest = exterminator.exterminate(myList);
        int result = newLest.size();
        Assertions.assertEquals(3, result);
    }



}