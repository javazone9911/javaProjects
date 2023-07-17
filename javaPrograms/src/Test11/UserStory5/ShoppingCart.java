package Test11.UserStory5;

public class ShoppingCart {
    //User Story 5: As a developer, I want to create a ShoppingCart class with methods for adding items, calculating the total price, and checking out.
    //Explanation:
    //Create a ShoppingCart class with methods such as "addItem," "calculateTotalPrice," and "checkOut."
    //Implement encapsulation by keeping the item list and total price as private variables and providing public methods to interact with them.
    //Use the encapsulated methods to add items to the shopping cart, calculate the total price, and perform the checkout process.


    private String itemList;
    private double totalPrice;
    private double checkOut;

    public String getItemList() {
        return itemList;
    }

    public void setItemList(String itemList) {
        this.itemList = itemList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(double checkOut) {
        this.checkOut = checkOut;
    }

    public ShoppingCart(String itemList, double totalPrice, double checkOut) {
        this.itemList = itemList;
        this.totalPrice = totalPrice;
        this.checkOut = checkOut;
    }
}
