package Methods.methods_with_parameters_and_return_values;

public class Array1Main {
    public static void main(String[] args) {
        Array1 array1=new Array1();
        int[] array={2,4,6,14,12,3 };
        int result= array1.findMaxNumber(array);
        System.out.println("The maximum value in the array = " + result);

    }
}
