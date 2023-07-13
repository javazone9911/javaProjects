package Methods.methods_with_parameters_and_return_values;

public class UserStory6Main {
    public static void main(String[] args) {
        UserStory6 userStory6=new UserStory6();
        int [] array={1,25,45,16,20};
        int maxNumber= userStory6.findMaxNumber(array);
        System.out.println(maxNumber);
    }


}
