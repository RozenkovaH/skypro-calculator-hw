package pro.sky.skyprocalculatorhw.service.impl;

import org.springframework.stereotype.Service;

import pro.sky.skyprocalculatorhw.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double getSum(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double getDifference(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double getProduct(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double getRatio(double num1, double num2) {
        if (num2 == 0.0) {
            throw new IllegalArgumentException("Divider cannot be equal to 0.");
        }
        return num1 / num2;
    }
}
