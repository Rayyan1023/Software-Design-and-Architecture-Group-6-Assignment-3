//Looks up the price and name of a product based on a UPC
public class CashRegister {

    //calling classes and storing in variables
    private final TicketPrinter Ticket;
    private final ProductDB productDbClass;
    private Product productClass;
    private final Display displayMonitor;

    //More variables
    public CashRegister(ProductDB database) {
        Ticket = new TicketPrinter();
        displayMonitor = new Display();
        productDbClass = database;
    }

    //Sets the UPC code for the current scanned product.
    public void setCurrentProductUpc(String upcnumber) {
        productClass = productDbClass.getProductInfo(upcnumber);//Fetches product upc code

        String text =  productClass.GetName() + " has been scanned. Price: $" +  productClass.GetPrice();//Outputs product on display
        Ticket.displayText(text);
        displayMonitor.displayText(text);
    }

    //Gets the product information for the latest scanned product.
    public Product getCurrentProductInfo() {
        return productClass;
    }
}
