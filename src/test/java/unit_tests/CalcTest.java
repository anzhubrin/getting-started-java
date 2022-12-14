package unit_tests;

import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    double FIRST_NUM = 10;
    double SECOND_NUM = 5;

    @Test
    public void checkAdd() {
        double expectedResult = FIRST_NUM + SECOND_NUM;
        Assertions.assertEquals(expectedResult, Calculator.add(FIRST_NUM, SECOND_NUM), "The result is not correct for add");
    }

    @Test
    public void checkSub() {
        double expectedResult = FIRST_NUM - SECOND_NUM;
        Assertions.assertEquals(expectedResult, Calculator.sub(FIRST_NUM, SECOND_NUM), "The result is not correct for sub");
    }

    @Test
    public void checkMult() {
        double expectedResult = FIRST_NUM * SECOND_NUM;
        Assertions.assertEquals(expectedResult, Calculator.mult(FIRST_NUM, SECOND_NUM), "The result is not correct for mult");
    }

    @Test
    public void checkDiv() {
        double expectedResult = FIRST_NUM / SECOND_NUM;
        Assertions.assertEquals(expectedResult, Calculator.div(FIRST_NUM, SECOND_NUM), "The result is not correct for div");
    }
}
