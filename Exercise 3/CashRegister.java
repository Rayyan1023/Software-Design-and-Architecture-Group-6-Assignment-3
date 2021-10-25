import java.util.ArrayList;
//Looks up the price and name of a product based on a UPC
public class CashRegister {

    //calling classes and storing in variables
    private final ProductDB productDbClass;
    private Product productClass;
    private final ArrayList<ObserverRegister> observers;

    // Calls Array and Database
    public CashRegister(ProductDB database) {
        productDbClass = database;
        observers = new ArrayList<>();
    }
    // Adds observers
    public void inputObserver(ObserverRegister observer) {observers.add(observer);}
    //Sets the UPC code for the current scanned product.
    public void setCurrentProductUpc(String upcnumber) {
        //Fetches product upc code
        productClass = productDbClass.getProductInfo(upcnumber);
        //Uses interface to update observers when product info is updated
        for (ObserverRegister observer : observers) {
            observer.updatedProduct(productClass);
        }
    }
    //Gets the product information for the latest scanned product.
    public Product getCurrentProductInfo() {
        return productClass;
    }
}
