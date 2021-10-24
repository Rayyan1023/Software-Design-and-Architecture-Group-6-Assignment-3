//Prints on paper the scanned or manually entered item name and price
//Implements ViewRegister interface
public class TicketPrinter implements ViewRegister {
    //Prints some text on the paper.
    public void displayProduct(Product product) {
        //Outputs product on ticket
        System.out.println("TicketPrinter: " + product.GetName() + " has been scanned. Price: $" +  product.GetPrice());
    }
}
