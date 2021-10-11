//Looks up the price and name of a product based on a UPC
public class CashRegister {

    private final ProductDB productDbClass;
    private final  ViewRegister displayClass;
    private final ViewRegister printerClass;
    private Product currentProductClass;

    public CashRegister(ProductDB db) {
        productDbClass = db;
        displayClass = new Display();
        printerClass = new TicketPrinter();
    }

    //Sets the UPC code for the current scanned product.
    public void setCurrentProductUpc(String upc) {
        currentProductClass = productDbClass.getProductInfo(upc);//Fetches product upc code


        displayClass.displayProduct(currentProductClass);
        printerClass.displayProduct(currentProductClass);
    }

    //Gets the product information for the latest scanned product.
    public Product getCurrentProductInfo() {
        return currentProductClass;
    }
}
