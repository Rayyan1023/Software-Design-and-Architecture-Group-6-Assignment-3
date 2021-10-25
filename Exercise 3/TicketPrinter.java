//Prints on paper the scanned or manually entered item name and price
//Implements ObserverRegister interface
public class TicketPrinter implements ObserverRegister {
    //Prints some text on the paper.
    public void updatedProduct(Product product) {
        //Outputs product on ticket
        System.out.println("TicketPrinter: " + product.GetName() + " has been scanned. Price: $" +  product.GetPrice());
    }
}
