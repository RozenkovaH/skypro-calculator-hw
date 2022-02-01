package pro.sky.skyprocalculatorhw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pro.sky.skyprocalculatorhw.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetUser() {
        return "Welcome to the most awesome calculator ever!";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String showDiff(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getDifference(num1, num2);
    }

    @GetMapping("/multiply")
    public String showProduct(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getProduct(num1, num2);
    }

    @GetMapping("/divide")
    public String showRatio(@RequestParam double num1, @RequestParam double num2) {
        try {
            return num1 + " / " + num2 + " = " + calculatorService.getRatio(num1, num2);
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}