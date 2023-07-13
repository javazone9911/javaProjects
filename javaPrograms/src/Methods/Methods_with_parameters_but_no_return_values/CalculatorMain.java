package Methods.Methods_with_parameters_but_no_return_values;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.sum(12,30);
        calculator.substration(20,12,6.125);
        calculator.multiplication(2,3.5,5,1.5);
        calculator.division(2.25,3.6,5.5,4,6);
    }
}
