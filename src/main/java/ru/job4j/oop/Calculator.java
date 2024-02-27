package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int result) {
        return sum(result) + minus(result) + multiply(result) + divide(result);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        int resultMinus = Calculator.minus(10);
        System.out.println(resultMinus);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(5);
        System.out.println(resultMultiply);
        Calculator calculatorDivide = new Calculator();
        int resultDivide = calculatorDivide.divide(5);
        System.out.println(resultDivide);
        Calculator calculatorSumAll = new Calculator();
        int resultSumAll = calculatorSumAll.sumAllOperation(result);
        System.out.println(resultSumAll);
    }
}
