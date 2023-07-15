package OopsConcept.AccessModifiers.Package1;

public class A {

    public String publicWord;
    private String privateWord;
    protected String protectedWord;
     String defaultWord;

    public String getPrivateWord() {
        return privateWord;
    }

    public void setPrivateWord(String privateWord) {
        this.privateWord = privateWord;
    }

    public void publicMethod(){
         System.out.println("This is a public number");
     }
     private void privateMethod(){
         System.out.println("This is a private number");
     }
     protected  void protectedMethod(){
         System.out.println("This is protected number");
     }
     void defaultMethod(){
         System.out.println("This is default number");
     }
}
