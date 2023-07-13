package Methods.Methods_with_parameters_but_no_return_values;

public class ToCart {

 // AL-39   As a customer, I want to be able to add items to my shopping cart by calling the "addItemToCart" method and providing the product ID and quantity as parameters.


    public void addItemToCart( int productId,String quantity) {
        System.out.println("The productId is " + productId + " and quantity is " + quantity);

    }
}
