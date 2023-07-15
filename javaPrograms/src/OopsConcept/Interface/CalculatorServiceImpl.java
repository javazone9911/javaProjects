package OopsConcept.Interface;

public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public double add(double value1, double value2) {
        return value1+value2;
    }

    @Override
    public double substract(double value1, double value2) {
        return value1-value2;
    }

    @Override
    public double multiply(double value1, double value2) {
        return value1*value2;
    }

    @Override
    public double divide(double value1, double value2) {
        return value1/value2;
    }
}
