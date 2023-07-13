package Methods.methods_with_parameters_and_return_values;

public class PrintNumbers {
    public int sum(int value1,int value2) {
        int sum=0;
        for(int i=value1;i<=value2;i++){
            sum+=i;
        }
        return sum;
    }
}
