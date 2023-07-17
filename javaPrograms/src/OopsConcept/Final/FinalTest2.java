package OopsConcept.Final;

public class FinalTest2 extends  FinalTest1 {

    public FinalTest2(int id, String name, String designation, String address) {
        super(id, name, designation, address);
    }

    public static void main(String[] args) {
       FinalTest1 finalTest1=new FinalTest1(235,"yuva raj","software","Hyderabad");
    }



    public final void finalMethodTest(){
        System.out.println("The method is finalized");
    }
}
