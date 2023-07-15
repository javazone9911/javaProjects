package OopsConcept.MethodOverloading;

public class Calculator {
    public void addition(int value1,int value2){
        System.out.println( value1 + value2);


    }
    public void addition(int value1,double value2){
        System.out.println(value1+value2);

    }
    public void addition(int value1,int value2,int value3){
        System.out.println(value1+value2+value3);

    }
    public void addition(double value1,double value2,double value3){
        System.out.println(value1+value2+value3);

    }
    public void addition(double value1,int value2){
        System.out.println(value1+value2);

    }


    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.addition(2.6,5);
    }
}
