package parametarisedConstructor;

public class Product {
    String productName ;
    int productId;
    double productPrice;
    int productQuantity;
    String supplierId;

    public Product( String productName,int productId, double productPrice, int productQuantity, String supplierId ) {

        this.productName=productName;
        this.productId=productId;
        this.productPrice=productPrice;
        this.supplierId="VMEIN02125";
        this.productQuantity=productQuantity;





    }

    public static void main(String[] args) {



        Product santoor =  new Product("santoor",04,32,20,"ETIENTSSE12005");

        Product lifeboy =  new Product("lifeboy",01,22.50,30,"ETIENTSSE12005");

        System.out.println(santoor.productName);
        System.out.println(santoor.productId);
        System.out.println(santoor.productPrice);
        System.out.println(santoor.productQuantity);
        System.out.println(santoor.supplierId);
        System.out.println("===============================================");
        System.out.println(lifeboy.productName);
        System.out.println(lifeboy.productId);
        System.out.println(lifeboy.productPrice);
        System.out.println(lifeboy.productQuantity);
        System.out.println(lifeboy.supplierId);


    }




}

