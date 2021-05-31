package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class SteamMain {
    public static void main(String[] args) {
//        System.out.println("Welcome do module 7 - Stream");
//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text. ");
//        processor.execute(codeToExecute);

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//

//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("marker", (String::toUpperCase)));
        System.out.println(poemBeautifier.beautify("sandy", (word -> "---" + word + "---")));
    }




}
