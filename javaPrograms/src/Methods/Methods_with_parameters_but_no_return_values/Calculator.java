package Methods.Methods_with_parameters_but_no_return_values;

public class Calculator {
    public void sum(int value1,int value2  ) {
        int result;
        result=value1+value2;
        System.out.println("The sum of two numbers is " + result);
    }

    public void substration(int value1,int value2,double value3) {
        double result;
        result=value1-(value2+value3);
        System.out.println("The substration of three numbers is = " + result);
    }

    public void  multiplication(double value1,double value2,double value3,double value4) {
        double result;
        result= value1*value2*value3*value4;
        System.out.println("The final result of four numbers is= " + result);
    }

    public void division(double value1,double value2,double value3,double value4,double value5) {
        double result;
        result=(value1*value2+value3*value4)/value5;
        System.out.println("The final result =" + result);
    }
}
