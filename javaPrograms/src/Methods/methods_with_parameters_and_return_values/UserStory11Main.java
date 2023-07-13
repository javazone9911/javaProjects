package Methods.methods_with_parameters_and_return_values;

public class UserStory11Main {
    public static void main(String[] args) {
        UserStory11 userStory11=new UserStory11();
        int[] count= userStory11.countVowelsAndConsonants("How are you");
        System.out.println("The vowels in the given string= " + count[0]);
        System.out.println("The consonent in the given string = " + count[1]);

    }
}
