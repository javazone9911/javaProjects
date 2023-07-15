package OopsConcept.MethodOverloading;

public class StringManupulator {
    public String concatination(String word1,String word2){
        return word1+" "+word2;
    }
    public String concatination(String word1,String word2,String word3){

        return word1+" "+word2+" "+word3;
    }
    public String concatination(String one,String two,String three,String four){
        return one+" "+two+" "+three+" "+four;
    }

    public static void main(String[] args) {
        StringManupulator stringManupulator=new StringManupulator();
    String word=    stringManupulator.concatination("hello","world","good evening","bye");
        System.out.println(word);
    }

}
