//Looks up the price and name of a product based on a UPC
public class CashRegister {

    //calling classes and storing in variables
    private final ViewRegister Ticket;
    private final ProductDB productDbClass;
    private Product productClass;
    private final ViewRegister displayMonitor;

    //More variables
    public CashRegister(ProductDB database) {
        Ticket = new TicketPrinter();
        displayMonitor = new Display();
        productDbClass = database;
    }

    //Sets the UPC code for the current scanned product.
    public void setCurrentProductUpc(String upcnumber) {
        //Fetches product upc code
        productClass = productDbClass.getProductInfo(upcnumber);
        //Uses interface to print ticket and display 
        Ticket.displayProduct(productClass);
        displayMonitor.displayProduct(productClass);
    }

    //Gets the product information for the latest scanned product.
    public Product getCurrentProductInfo() {
        return productClass;
    }
}
