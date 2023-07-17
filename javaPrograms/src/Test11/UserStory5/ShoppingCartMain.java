package Test11.UserStory5;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart("mobile",15999,15999);
    //    shoppingCart.setItemList("biscuit,chocolate");
        System.out.println("Itemlist is "+shoppingCart.getItemList());
   //     shoppingCart.setTotalPrice(52.65);
        System.out.println("Total price "+shoppingCart.getTotalPrice());
     //   shoppingCart.setCheckOut(52.65);
        System.out.println("checkOut = "+shoppingCart.getCheckOut());
    }
}
