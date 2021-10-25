import java.util.HashMap;
//Persistence storage of the products in a store
public class ProductDB {
    //Declares Hashmap for UPC and product info
    private final HashMap<String, Product> productMap;

    public ProductDB() {
        productMap = new HashMap<String,Product>();
    }
    //Stores upcnumber, name and price of the product
    public void storedProduct(String upcnumber, Product productinfo) {
        productMap.put(upcnumber, productinfo);
    }
    //Gets the product information for the product with the UPC code equal to UPCCode.
    public Product getProductInfo(String upcnumber) {
        return productMap.get(upcnumber);
    }
}
