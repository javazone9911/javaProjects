package OopsConcept.Final;

public class FinalTest1 {
    final   int id;
    final  String name;
    final  String designation;
    final  String address;

    public FinalTest1(int id, String name, String designation, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.address = address;
    }


    public  void finalMethodTest(){
        System.out.println("The method is finalized");
    }

}
