package defaultConstuctor;

public class Product {
    String productName ;
    int productId;
    double productPrice;
    int productQuantity;
    String supplierId;

    public Product( ) {

    /*    productName="Santoor";
        productId=5;
        productPrice=15.50;
        productQuantity=4;
        supplierId="epfa1254";    */
        supplierId ="AETEEACI0112";
    }

    public static void main(String[] args) {
     /*   Product soap= new Product();
        System.out.println(soap.productName);
        System.out.println(soap.productId);
        System.out.println(soap.productPrice);
        System.out.println(soap.productQuantity);
        System.out.println(soap.supplierId);  */

        Product santoor =  new Product();
        santoor.productId = 5;
     //   santoor.supplierId = " ated124 ";
        santoor.productPrice= 32.50;
        santoor.productQuantity=100;
        santoor.productName="Santoor";
        System.out.println(santoor.productName);
        System.out.println(santoor.productId);
        System.out.println(santoor.productPrice);
        System.out.println(santoor.productQuantity);
        System.out.println(santoor.supplierId);
        System.out.println("=====================================================");
        Product detol =  new Product();
        detol.productId = 10;
    //    detol.supplierId = " ated124 ";
        detol.productPrice= 41.20;
        detol.productQuantity=65;
        detol.productName="detol";
        System.out.println(detol.productName);
        System.out.println(detol.productId);
        System.out.println(detol.productPrice);
        System.out.println(detol.productQuantity);
        System.out.println(detol.supplierId);
        System.out.println("=======================================================");
        Product lifeboy =  new Product();
        lifeboy.productId = 20;
        lifeboy.supplierId = " ated124 ";
        lifeboy.productPrice= 25.65;
        lifeboy.productQuantity=35;
        lifeboy.productName="lifeboy";
        System.out.println("productName is " + lifeboy.productName);
        System.out.println(lifeboy.productId);
        System.out.println(lifeboy.productPrice);
        System.out.println(lifeboy.productQuantity);
        System.out.println(lifeboy.supplierId);

    }
}
