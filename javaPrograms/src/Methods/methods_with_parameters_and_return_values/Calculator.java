package Methods.methods_with_parameters_and_return_values;

public class Calculator {
    public double sum(double value1,double value2){
        double result;
        result=value1+value2;
        return result;
    }

    public double multiplication( int value1,int value2,double value3) {
        double  result;
        result=value1*value2*value3;
        return result;
    }
    public int  divisible(int value1,int value2) {
        int result;
        result=value1/value2;
        return  result;
    }
    public int substraction(int value1,int value2,int value3) {
        int result;
        result= (value1+value2)-value3;
        return result;
    }
}
