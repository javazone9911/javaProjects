package Test11.UserStory8;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator=new BasicCalculator();
        System.out.println("The addition of given numbers "+calculator.addition(23,4));
        System.out.println("The multiplication of given numbers "+calculator.multiplication(62,152));
        Calculator calculator1=new ScienficCalculator();
        System.out.println("The subtraction of given numbers "+calculator1.subtraction(25,4));
        System.out.println("The division of given numbers " +calculator1.division(62,25));
    }
}
