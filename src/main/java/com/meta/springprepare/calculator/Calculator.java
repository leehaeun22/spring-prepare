package com.meta.springprepare.calculator;

public class Calculator {

    public Double operator(Double num1, String op, Double num2) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다: " + op);
        }
    }
}
