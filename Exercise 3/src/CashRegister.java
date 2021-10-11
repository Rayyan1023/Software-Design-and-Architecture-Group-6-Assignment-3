
import java.util.ArrayList;

//Looks up the price and name of a product based on a UPC
public class CashRegister {

    private final ProductDB productDbClass;
    private final ArrayList<ObserverRegister> observers;
    private Product currentProductClass;

    public CashRegister(ProductDB db) {
        productDbClass = db;
        observers = new ArrayList<>();
    }

    //Sets the UPC code for the current scanned product.
    public void inputObserver(ObserverRegister observer) {
        observers.add(observer);
    }

    public void setCurrentProductUpc(String upc) {
        currentProductClass = productDbClass.getProductInfo(upc);

        for (ObserverRegister observer : observers) {
            observer.updatedProduct(currentProductClass);
        }
    }

    //Gets the product information for the latest scanned product.
    public Product getCurrentProductInfo() {
        return currentProductClass;
    }
}
