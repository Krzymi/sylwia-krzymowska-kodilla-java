package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Poem beautifier, zadanie 7.1:");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.decorate("Hello my friend", (myText) -> myText + "ABC");
        poemBeautifier.decorate("Hello my friend", (myText) -> "ABC" + myText);
        poemBeautifier.decorate("Hello my friend", (myText) -> myText.toUpperCase());
        poemBeautifier.decorate(" Hello my friend ", (myText) -> myText.trim());
        poemBeautifier.decorate("Hello my friend", (myText) -> myText.substring(0, 5));
    }
}
