package pro.sky.skyprocalculatorhw.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import pro.sky.skyprocalculatorhw.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.skyprocalculatorhw.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParametrizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForSumTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUM_1, POSITIVE_NUM_2, SUM_1),
                Arguments.of(NEGATIVE_NUM_1, NEGATIVE_NUM_2, SUM_2),
                Arguments.of(POSITIVE_NUM_3, NEGATIVE_NUM_3, SUM_3)
        );
    }

    public static Stream<Arguments> provideParamsForDifferenceTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUM_4, POSITIVE_NUM_5, DIFFERENCE_1),
                Arguments.of(NEGATIVE_NUM_4, NEGATIVE_NUM_5, DIFFERENCE_2),
                Arguments.of(POSITIVE_NUM_6, NEGATIVE_NUM_6, DIFFERENCE_3)
        );
    }

    public static Stream<Arguments> provideParamsForProductTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUM_7, POSITIVE_NUM_8, PRODUCT_1),
                Arguments.of(NEGATIVE_NUM_7, NEGATIVE_NUM_8, PRODUCT_2),
                Arguments.of(POSITIVE_NUM_9, NEGATIVE_NUM_9, PRODUCT_3)
        );
    }

    public static Stream<Arguments> provideParamsForRatioTest() {
        return Stream.of(
                Arguments.of(POSITIVE_NUM_10, POSITIVE_NUM_11, RATIO_1),
                Arguments.of(NEGATIVE_NUM_10, NEGATIVE_NUM_11, RATIO_2),
                Arguments.of(POSITIVE_NUM_12, NEGATIVE_NUM_12, RATIO_3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTest")
    public void shouldReturnCorrectSum(double num1, double num2, double expected) {
        double actual = out.getSum(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDifferenceTest")
    public void shouldReturnCorrectDifference(double num1, double num2, double expected) {
        double actual = out.getDifference(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForProductTest")
    public void shouldReturnCorrectProduct(double num1, double num2, double expected) {
        double actual = out.getProduct(num1, num2);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForRatioTest")
    public void shouldReturnCorrectRatio(double num1, double num2, double expected) {
        double actual = out.getRatio(num1, num2);
        assertEquals(expected, actual);
    }
}
