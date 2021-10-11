import java.util.HashMap;
//Persistence storage of the products in a store
public class ProductDB {
    private final HashMap<String, Product> productMap;
    public ProductDB() {
        productMap = new HashMap<>();
    }
    public void addProductInfo(String upc, Product product) {
        productMap.put(upc, product);
    }
    //Gets the product information for the product with the UPC code equal to UPCCode.
    public Product getProductInfo(String upc) {
        return productMap.get(upc);
    }
}
