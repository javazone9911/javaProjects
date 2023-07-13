package Methods.Methods_with_parameters_but_no_return_values;

public class Service {

    //  AL-47  As a system administrator, I want to be able to restart a service by calling the "restartService" method and passing the service name or ID as a parameter.

    public void restartService( String serviceName,int id) {
        System.out.println("The service name is " + serviceName + " the id= " + id);
    }
}
