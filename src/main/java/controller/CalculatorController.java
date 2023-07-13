package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.CalculatorService;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String hello() {
        return "<b> Calc";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return String.format("%s + %s = %s", a, b, calculatorService.plus(a, b));
    }

    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return String.format("%s - %s = %s", a, b, calculatorService.minus(a, b));
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return String.format("%s * %s =%s", a, b, calculatorService.multiply(a, b));
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        try {
            int result = calculatorService.divide(a, b);
            return String.format("%s * %s =%s", a, b, result);
        } catch (Exception e) {
            return "0 не делится";
        }
    }
}
