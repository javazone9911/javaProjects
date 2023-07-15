package OopsConcept.Interface;

public class CalculatorApplication {
    public static void main(String[] args) {
        CalculatorService calculatorService=new CalculatorServiceImpl();
        System.out.println( calculatorService.multiply(8,6));
        System.out.println( calculatorService.add(4,8));
        System.out.println( calculatorService.substract(8,6));
        System.out.println( calculatorService.divide(8,6));

    }
}
