package Methods.methods_with_parameters_and_return_values;

public class UserStory8Main {
    public static void main(String[] args) {
        UserStory8 userStory8=new UserStory8();
        int[] array={2,4,5,85,65,6};
        int[] minMaxNumbers= userStory8.findMinMaxNumbers(array);
        System.out.println("The maximum number of given array is " + minMaxNumbers[1]);
     //   int[] minMaxNumbers= userStory8.findMinMaxNumbers(array);
        System.out.println("The minimum number of given array is " + minMaxNumbers[0]);
    }
}
