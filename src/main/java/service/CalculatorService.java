package service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorServiceInterface {
    @Override
    public int plus(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
    @Override
    public int divide(int a, int b) throws Exception {
        if(b==0){
            throw new Exception("Нельзя делить на 0");
        }
        return a/b;
    }
}
