package StringBasedInterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
       // String str="How are you?";

        //Approach-1

    //    char[] chArr=str.toCharArray();
     //   for(int i=chArr.length-1;i>=0;i--){
     //       System.out.print(chArr[i]);


          // Approach-2

     //       for(int i=str.length()-1;i>=0;i--){
      //          System.out.println(str.charAt(i));

         // Approach-3

     /*           String str="Racecar";
         StringBuffer sb=new StringBuffer(str);
                System.out.print(sb.reverse());  */

         // Approach-4

        String str="Power up";
        StringBuilder sBuilder=new StringBuilder(str);
        System.out.println(sBuilder.reverse());
        }
    }

