package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
//        SimpleUser simpleUser = new SimpleUser("theForumUser");
//
//        String result = simpleUser.getUserName();
//
//        if (result.equals("theForumUser")){
//            System.out.println("test OK");
//        } else {
//            System.out.println("Error!");
//        }
        Calculator calculator = new Calculator(2, 2);
        int resultSum = calculator.sum();
        int resultSub = calculator.subtract();

        if(resultSum==4 && resultSub==0){
            System.out.println("TEST OK");
        }else System.out.println("Test error !");
    }
}
