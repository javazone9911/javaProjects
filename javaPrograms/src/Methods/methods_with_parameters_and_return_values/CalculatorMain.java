package Methods.methods_with_parameters_and_return_values;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
     double sum=   calculator.sum(12.5,2.5);
        System.out.println(sum);
      int divisible=  calculator.divisible(5,8);
        System.out.println(divisible);
       double multiply= calculator.multiplication(35,41,32.5);
        System.out.println(multiply);
       int substract= calculator.substraction(14,65,014);
        System.out.println(substract);

    }
}
