package OopsConcept.Abstraction;

abstract class MobilePhone {
    abstract  void call(String number);
    abstract  void sendMessage(String number,String message);
    abstract void notification(String application,String notification);

    public void messenger(){
        System.out.println("hello world");
    }
}
