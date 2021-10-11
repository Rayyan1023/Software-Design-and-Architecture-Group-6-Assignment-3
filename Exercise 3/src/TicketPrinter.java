//Prints on paper the scanned or manually entered item name and price
public class TicketPrinter implements ObserverRegister {
    public void TicketPrinter() {

    }

    //Prints some text on the paper.
    @Override
    public void updatedProduct(Product product) {
        System.out.println("TicketPrinter: The product was added "" + product.GetName() + "".");
    }
}
