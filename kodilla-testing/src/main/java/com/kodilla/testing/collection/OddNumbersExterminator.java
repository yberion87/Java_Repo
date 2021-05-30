package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> allNumber){
        ArrayList<Integer> evenList = new ArrayList<>();
        for(Integer number : allNumber){
            if(number%2==0){
                evenList.add(number);
            }
        }
        return evenList;
    }
}
