package com.meta.springprepare.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class calculatorTest {

    @Test
    @DisplayName("덧셈 테스트")
    void test1() {
        Double num1 = 8.0;
        String op = "+";
        Double num2 = 2.0;

        Calculator calculator = new Calculator();
        Double result = calculator.operator(num1, op, num2);

        Assertions.assertEquals(10.0, result);
    }

    @Test
    @DisplayName("뺄셈 테스트")
    void test2() {
        Double num1 = 8.0;
        String op = "-";
        Double num2 = 2.0;

        Calculator calculator = new Calculator();
        Double result = calculator.operator(num1, op, num2);

        Assertions.assertEquals(6.0, result);
    }

    @Test
    @DisplayName("곱셈 테스트")
    void test3() {
        Double num1 = 8.0;
        String op = "*";
        Double num2 = 2.0;

        Calculator calculator = new Calculator();
        Double result = calculator.operator(num1, op, num2);

        Assertions.assertEquals(16.0, result);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    void test4() {
        Double num1 = 8.0;
        String op = "/";
        Double num2 = 2.0;

        Calculator calculator = new Calculator();
        Double result = calculator.operator(num1, op, num2);

        Assertions.assertEquals(4.0, result);
    }

    @Test
    @DisplayName("잘못된 연산자 입력 테스트")
    void test6() {
        Double num1 = 8.0;
        String op = "_";
        Double num2 = 2.0;

        Calculator calculator = new Calculator();

        IllegalArgumentException thrown = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.operator(num1, op, num2)
        );

        Assertions.assertEquals(
                "잘못된 연산자를 입력하셨습니다.",
                thrown.getMessage()
        );
    }
}
