//Looks up the price and name of a product based on a UPC
public class CashRegister {

    private final ProductDB productDbClass;
    private final Display displayClass;
    private final TicketPrinter printerClass;
    private Product currentProductClass;

    public CashRegister(ProductDB db) {
        productDbClass = db;
        displayClass = new Display();
        printerClass = new TicketPrinter();
    }

    //Sets the UPC code for the current scanned product.
    public void setCurrentProductUpc(String upc) {
        currentProductClass = productDbClass.getProductInfo(upc);//Fetches product upc code

        String text = "The product has been added "" + currentProductClass.GetName() + "".";//Outputs product on display
        displayClass.displayText(text);
        printerClass.displayText(text);
    }

    //Gets the product information for the latest scanned product.
    public Product getCurrentProductInfo() {
        return currentProductClass;
    }
}
