package Methods.methods_with_parameters_and_return_values;

public class UserStory11 {
    //User Story 11: As a user, I want to find the number of vowels and consonants in a given string using a for loop and switch case logic.
    //Explanation:
    //
    //Create a method called "countVowelsAndConsonants" that takes a string parameter.
    //Initialize variables "vowelCount" and "consonantCount" with the value 0.
    //Convert the string to lowercase using the toLowerCase() method.
    //Use a for loop to iterate through each character in the string.
    //Inside the loop, use switch case logic to check if the current character is a vowel.
    //If it is a vowel, increment the "vowelCount" variable.
    //If it is not a vowel (including spaces and punctuation), increment the "consonantCount" variable.
    //After the loop, return the counts of vowels and consonants.

    public int[] countVowelsAndConsonants(String letter){
        int vowelCount=0;
        int consonantCount=0;
        letter=letter.toLowerCase();
        for(int i=0;i<letter.length();i++){
            char ch=letter.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:
                    consonantCount++;
                    break;

            }

         }
        int[] count={vowelCount,consonantCount};

        return count;
    }
}
