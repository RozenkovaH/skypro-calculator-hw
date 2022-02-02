package pro.sky.skyprocalculatorhw.service;

import org.junit.Test;

import pro.sky.skyprocalculatorhw.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void getSumPositive() {
        double num1 = 23;
        double num2 = 32;
        double expected = 55;
        double actual = out.getSum(num1, num2);

        assertEquals(expected, actual);
    }

    public void getSumNegative() {
        double num1 = -45;
        double num2 = -31;
        double expected = -76;
        double actual = out.getSum(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void getDifferencePositive() {
        double num1 = 79;
        double num2 = 42;
        double expected = 37;
        double actual = out.getDifference(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void getDifferenceNegative() {
        double num1 = -111;
        double num2 = -36;
        double expected = -75;
        double actual = out.getDifference(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void getProductPositive() {
        double num1 = 25;
        double num2 = 5;
        double expected = 125;
        double actual = out.getProduct(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void getProductNegative() {
        double num1 = -90;
        double num2 = -15;
        double expected = 1350;
        double actual = out.getProduct(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void getRatioPositive() {
        double num1 = 400;
        double num2 = 40;
        double expected = 10;
        double actual = out.getRatio(num1, num2);

        assertEquals(expected, actual);
    }

    @Test
    public void getRatioNegative() {
        double num1 = -72;
        double num2 = -5;
        double expected = 14.4;
        double actual = out.getRatio(num1, num2);

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getRatioDivisionByZero() {
        double num1 = 100;
        double num2 = 0;

        out.getRatio(num1, num2);
    }
}
